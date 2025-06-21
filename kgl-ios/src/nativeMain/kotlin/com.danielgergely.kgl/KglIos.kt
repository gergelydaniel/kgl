package com.danielgergely.kgl

import kotlinx.cinterop.*
import platform.gles3.*
import platform.glescommon.GLboolean

// TODO: Replace this with actual stack implementation.
@ThreadLocal
private object VirtualStack : NativePlacement {
    private val scopes = mutableListOf<Arena>()

    val currentFrame: AutofreeScope? get() = scopes.lastOrNull()

    override fun alloc(size: Long, align: Int): NativePointed {
        check(scopes.size > 0) { "Call push() before allocation." }
        return scopes.last().alloc(size, align)
    }

    fun push() {
        scopes.add(Arena())
    }

    fun pop() {
        check(scopes.isNotEmpty()) { "pop() must only be called after push()." }

        scopes.removeAt(scopes.lastIndex).clear()
    }
}

@OptIn(ExperimentalUnsignedTypes::class)
object KglIos : Kgl {

    override fun createShader(type: Int): Shader? {
        val shader = glCreateShader(type.toUInt()).toInt()
        return if (shader == 0) null else shader
    }

    private fun glShaderSource(shader: UInt, strings: List<String>) {
        VirtualStack.push()
        try {
            val input = VirtualStack.allocArray<CPointerVar<ByteVar>>(strings.size) {
                value = strings[it].cstr.getPointer(VirtualStack.currentFrame!!)
            }
            val inputLength = VirtualStack.allocArray<IntVar>(strings.size) {
                value = strings[it].length
            }

            glShaderSource(shader, strings.size, input, inputLength)
        } finally {
            VirtualStack.pop()
        }
    }

    override fun shaderSource(shaderId: Shader, source: String) {
        glShaderSource(shaderId.toUInt(), listOf(source))
    }

    override fun compileShader(shaderId: Shader) {
        glCompileShader(shaderId.toUInt())
    }

    override fun deleteShader(shaderId: Shader) {
        glDeleteShader(shaderId.toUInt())
    }

    override fun getShaderParameter(shader: Shader, pname: Int): Int {
        val params = IntArray(1)
        params.usePinned {
            glGetShaderiv(shader.toUInt(), pname.toUInt(), it.addressOf(0))
        }
        return params[0]
    }

    override fun getProgramInfoLog(program: Program): String {
        val infoLogLength = getProgramParameter(program, GL_INFO_LOG_LENGTH)
        val infoLog = ByteArray(infoLogLength + 1) // +1 for null terminator
        infoLog.usePinned {
            glGetProgramInfoLog(program.toUInt(), infoLogLength + 1, null, it.addressOf(0))
        }
        return infoLog.decodeToString()
    }

    override fun getShaderInfoLog(shaderId: Shader): String? {
        val infoLogLength = getShaderParameter(shaderId, GL_INFO_LOG_LENGTH)
        val infoLog = ByteArray(infoLogLength + 1)
        infoLog.usePinned {
            glGetShaderInfoLog(shaderId.toUInt(), infoLogLength + 1, null, it.addressOf(0))
        }
        return infoLog.decodeToString()
    }

    override fun createProgram(): Program? {
        val program = glCreateProgram()
        return if (program == 0u) null else program.toInt()
    }

    override fun deleteProgram(programId: Program) {
        glDeleteProgram(programId.toUInt())
    }

    override fun detachShader(programId: Program, shaderId: Shader) {
        glDetachShader(programId.toUInt(), shaderId.toUInt())
    }

    override fun attachShader(programId: Program, shaderId: Shader) {
        glAttachShader(programId.toUInt(), shaderId.toUInt())
    }

    override fun linkProgram(programId: Program) {
        glLinkProgram(programId.toUInt())
    }

    override fun useProgram(programId: Program) {
        glUseProgram(programId.toUInt())
    }

    override fun getProgramParameter(program: Program, pname: Int): Int {
        val params = IntArray(1)
        params.usePinned {
            glGetProgramiv(program.toUInt(), pname.toUInt(), it.addressOf(0))
        }
        return params[0]
    }

    override fun getUniformLocation(programId: Program, name: String): UniformLocation? {
        val location = glGetUniformLocation(programId.toUInt(), name)
        return if (location < 0) {
            null
        } else {
            location
        }
    }

    override fun getAttribLocation(programId: Program, name: String): Int {
        return glGetAttribLocation(programId.toUInt(), name)
    }

    override fun bindAttribLocation(programId: Program, index: Int, name: String) {
        glBindAttribLocation(programId.toUInt(), index.toUInt(), name)
    }

    override fun enable(cap: Int) {
        glEnable(cap.toUInt())
    }

    override fun disable(cap: Int) {
        glDisable(cap.toUInt())
    }

    override fun enableVertexAttribArray(location: Int) {
        glEnableVertexAttribArray(location.toUInt())
    }

    override fun disableVertexAttribArray(location: Int) {
        glDisableVertexAttribArray(location.toUInt())
    }

    override fun createBuffer(): GlBuffer {
        return createBuffers(1)[0]
    }

    override fun createBuffers(count: Int): Array<GlBuffer> {
        val buffers = UIntArray(count)
        buffers.usePinned {
            glGenBuffers(count, it.addressOf(0))
        }
        return Array(count) { buffers[it].toInt() }
    }

    override fun bindBuffer(target: Int, bufferId: GlBuffer?) {
        glBindBuffer(target.toUInt(), bufferId?.toUInt() ?: 0u)
    }

    override fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int) {
        glBufferData(target.toUInt(), size.toLong(), sourceData.ref(), usage.toUInt())
    }

    override fun bufferSubData(target: Int, dstOffset: Int, sourceData: Buffer) {
        glBufferSubData(target.toUInt(), dstOffset.toLong(), sourceData.remainingBytes().toLong(), sourceData.ref())
    }

    override fun deleteBuffer(buffer: GlBuffer) {
        val buffers = uintArrayOf(buffer.toUInt())
        buffers.usePinned {
            glDeleteBuffers(1, it.addressOf(0))
        }
    }

    override fun vertexAttribPointer(
        location: Int,
        size: Int,
        type: Int,
        normalized: Boolean,
        stride: Int,
        offset: Int
    ) {
        glVertexAttribPointer(
            location.toUInt(),
            size,
            type.toUInt(),
            normalized.toGl(),
            stride,
            offset.toLong().toCPointer<COpaque>()
        )
    }

    override fun uniform1f(location: UniformLocation, f: Float) =
        glUniform1f(location, f)

    override fun uniform1fv(location: UniformLocation, value: FloatArray) =
        glUniform1fv(location, value.vSize(1), value.refTo(0))

    override fun uniform1i(location: UniformLocation, i: Int) =
        glUniform1i(location, i)

    override fun uniform1iv(location: UniformLocation, value: IntArray) =
        glUniform1iv(location, value.vSize(1), value.refTo(0))

    override fun uniform2f(location: UniformLocation, x: Float, y: Float) =
        glUniform2f(location, x, y)

    override fun uniform2fv(location: UniformLocation, value: FloatArray) =
        glUniform2fv(location, value.vSize(2), value.refTo(0))

    override fun uniform2i(location: UniformLocation, x: Int, y: Int) =
        glUniform2i(location, x, y)

    override fun uniform2iv(location: UniformLocation, value: IntArray) =
        glUniform2iv(location, value.vSize(2), value.refTo(0))

    override fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float) =
        glUniform3f(location, x, y, z)

    override fun uniform3fv(location: UniformLocation, value: FloatArray) =
        glUniform3fv(location, value.vSize(3), value.refTo(0))

    override fun uniform3i(location: UniformLocation, x: Int, y: Int, z: Int) =
        glUniform3i(location, x, y, z)

    override fun uniform3iv(location: UniformLocation, value: IntArray) =
        glUniform3iv(location, value.vSize(3), value.refTo(0))

    override fun uniform4f(location: UniformLocation, x: Float, y: Float, z: Float, w: Float) =
        glUniform4f(location, x, y, z, w)

    override fun uniform4fv(location: UniformLocation, value: FloatArray) =
        glUniform4fv(location, value.vSize(4), value.refTo(0))

    override fun uniform4i(location: UniformLocation, x: Int, y: Int, z: Int, w: Int) =
        glUniform4i(location, x, y, z, w)

    override fun uniform4iv(location: UniformLocation, value: IntArray) =
        glUniform4iv(location, value.vSize(4), value.refTo(0))

    override fun uniformMatrix3fv(location: UniformLocation, transpose: Boolean, value: FloatArray) =
        glUniformMatrix3fv(location, value.vSize(3 * 3), transpose.toGl(), value.refTo(0))

    override fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: FloatArray) =
        glUniformMatrix4fv(location, value.vSize(4 * 4), transpose.toGl(), value.refTo(0))

    override fun blendFunc(sFactor: Int, dFactor: Int) {
        glBlendFunc(sFactor.toUInt(), dFactor.toUInt())
    }

    override fun cullFace(mode: Int) {
        glCullFace(mode.toUInt())
    }

    override fun viewport(x: Int, y: Int, width: Int, height: Int) {
        glViewport(x, y, width, height)
    }

    override fun clearColor(r: Float, g: Float, b: Float, a: Float) {
        glClearColor(r, g, b, a)
    }

    override fun clear(mask: Int) {
        glClear(mask.toUInt())
    }

    override fun createTexture(): Texture {
        return createTextures(1)[0]
    }

    override fun vertexAttribDivisor(index: Int, divisor: Int) {
        glVertexAttribDivisor(index.toUInt(), divisor.toUInt())
    }

    override fun createTextures(n: Int): Array<Texture> {
        val textures = UIntArray(n)
        textures.usePinned {
            glGenTextures(n, it.addressOf(0))
        }
        return Array(n) { textures[it].toInt() }
    }

    override fun deleteTexture(texture: Texture) {
        val textures = uintArrayOf(texture.toUInt())
        textures.usePinned {
            glDeleteTextures(1, it.addressOf(0))
        }
    }

    override fun texImage2D(target: Int, level: Int, internalFormat: Int, border: Int, resource: TextureResource) {
        texImage2D(
            target = target,
            level = level,
            internalFormat = internalFormat,
            width = resource.width,
            height = resource.height,
            border = 0,
            format = resource.format,
            type = resource.type,
            buffer = resource.data
        )
    }

    override fun texImage2D(
        target: Int,
        level: Int,
        internalFormat: Int,
        width: Int,
        height: Int,
        border: Int,
        format: Int,
        type: Int,
        buffer: Buffer
    ) {
        glTexImage2D(
            target.toUInt(),
            level,
            internalFormat,
            width,
            height,
            border,
            format.toUInt(),
            type.toUInt(),
            buffer.ref()
        )
    }

    override fun activeTexture(texture: Int) {
        glActiveTexture(texture.toUInt())
    }

    override fun bindTexture(target: Int, texture: Texture?) {
        if (texture != null) {
            glBindTexture(target.toUInt(), texture.toUInt())
        } else {
            glBindTexture(target.toUInt(), 0u)
        }
    }

    override fun generateMipmap(target: Int) {
        glGenerateMipmap(target.toUInt())
    }

    override fun texParameteri(target: Int, pname: Int, value: Int) {
        glTexParameteri(target.toUInt(), pname.toUInt(), value)
    }

    override fun createVertexArray(): VertexArrayObject {
        val buffer = UIntArray(1)
        buffer.usePinned {
            glGenVertexArrays(1, it.addressOf(0))
        }
        return buffer[0].toInt()
    }

    override fun bindVertexArray(vertexArrayObject: VertexArrayObject?) {
        if (vertexArrayObject != null) {
            glBindVertexArray(vertexArrayObject.toUInt())
        } else {
            glBindVertexArray(0u)
        }
    }

    override fun deleteVertexArray(vertexArrayObject: VertexArrayObject) {
        val buffer = uintArrayOf(vertexArrayObject.toUInt())
        buffer.usePinned {
            glDeleteVertexArrays(1, it.addressOf(0))
        }
    }

    override fun drawArrays(mode: Int, first: Int, count: Int) {
        glDrawArrays(mode.toUInt(), first, count)
    }

    override fun drawElements(mode: Int, count: Int, type: Int) {
        glDrawElements(mode.toUInt(), count, type.toUInt(), null)
    }

    override fun drawArraysInstanced(
        mode: Int,
        first: Int,
        count: Int,
        instanceCount: Int
    ) {
        glDrawArraysInstanced(mode.toUInt(), first, count, instanceCount)
    }

    override fun drawElementsInstanced(
        mode: Int,
        count: Int,
        type: Int,
        offset: Int,
        instanceCount: Int
    ) {
        glDrawElementsInstanced(mode.toUInt(), count, type.toUInt(), null, instanceCount)
    }

    override fun getError(): Int {
        return glGetError().toInt()
    }

    override fun finish() {
        glFinish()
    }

    override fun bindFramebuffer(target: Int, framebuffer: Framebuffer?) {
        if (framebuffer != null) {
            glBindFramebuffer(target.toUInt(), framebuffer.toUInt())
        } else {
            glBindFramebuffer(target.toUInt(), 0u)
        }
    }

    override fun createFramebuffer(): Framebuffer {
        val buffer = UIntArray(1)
        buffer.usePinned {
            glGenFramebuffers(1, it.addressOf(0))
        }
        return buffer[0].toInt()
    }

    override fun deleteFramebuffer(framebuffer: Framebuffer) {
        val buffer = uintArrayOf(framebuffer.toUInt())
        buffer.usePinned {
            glDeleteFramebuffers(1, it.addressOf(0))
        }
    }

    override fun checkFramebufferStatus(target: Int): Int {
        return glCheckFramebufferStatus(target.toUInt()).toInt()
    }

    override fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Texture, level: Int) {
        glFramebufferTexture2D(target.toUInt(), attachment.toUInt(), textarget.toUInt(), texture.toUInt(), level)
    }

    override fun isFramebuffer(framebuffer: Framebuffer): Boolean {
        return glIsFramebuffer(framebuffer.toUInt()).toBoolean()
    }

    override fun bindRenderbuffer(target: Int, renderbuffer: Renderbuffer?) {
        if (renderbuffer != null) {
            glBindRenderbuffer(target.toUInt(), renderbuffer.toUInt())
        } else {
            glBindRenderbuffer(target.toUInt(), 0u)
        }
    }

    override fun createRenderbuffer(): Renderbuffer {
        val buffer = UIntArray(1)
        buffer.usePinned {
            glGenRenderbuffers(1, it.addressOf(0))
        }
        return buffer[0].toInt()
    }

    override fun deleteRenderbuffer(renderbuffer: Renderbuffer) {
        val buffer = uintArrayOf(renderbuffer.toUInt())
        buffer.usePinned {
            glDeleteRenderbuffers(1, it.addressOf(0))
        }
    }

    override fun framebufferRenderbuffer(
        target: Int,
        attachment: Int,
        renderbuffertarget: Int,
        renderbuffer: Renderbuffer
    ) {
        glFramebufferRenderbuffer(
            target.toUInt(),
            attachment.toUInt(),
            renderbuffertarget.toUInt(),
            renderbuffer.toUInt()
        )
    }

    override fun isRenderbuffer(renderbuffer: Renderbuffer): Boolean {
        return glIsRenderbuffer(renderbuffer.toUInt()).toBoolean()
    }

    override fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int) {
        glRenderbufferStorage(target.toUInt(), internalformat.toUInt(), width, height)
    }

    //TODO test
    override fun readPixels(
        x: Int,
        y: Int,
        width: Int,
        height: Int,
        format: Int,
        type: Int,
        buffer: Buffer
    ) {
        glReadPixels(x, y, width, height, format.toUInt(), type.toUInt(), buffer.ref())
    }
}

private fun Boolean.toGl(): GLboolean = if (this) 1u else 0u

private fun UByte.toBoolean() = this != platform.gles3.GL_FALSE.toUByte()

private fun FloatArray.vSize(vecSize: Int): Int {
    if (size % vecSize != 0)
        throw IllegalArgumentException("Array size must be a multiple of $vecSize.")
    return size / vecSize
}

private fun IntArray.vSize(vecSize: Int): Int {
    if (size % vecSize != 0)
        throw IllegalArgumentException("Array size must be a multiple of $vecSize.")
    return size / vecSize
}