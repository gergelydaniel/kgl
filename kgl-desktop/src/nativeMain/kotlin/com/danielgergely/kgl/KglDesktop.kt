package com.danielgergely.kgl

import kotlinx.cinterop.*

object KglDesktop : Kgl {

    // TODO this probably causes memory leak?
    private val scope = MemScope()

    override fun createShader(type: Int): Shader? {
        val shader = glCreateShader(type.toUInt()).toInt()
        return if (shader == 0) null else shader
    }

    override fun shaderSource(shaderId: Shader, source: String) {
        glShaderSource(shaderId.toUInt(), source)
    }

    override fun compileShader(shaderId: Shader) {
        glCompileShader(shaderId.toUInt())
    }

    override fun deleteShader(shaderId: Shader) {
        glDeleteShader(shaderId.toUInt())
    }

    override fun getShaderParameter(shader: Shader, pname: Int): Int {
        return glGetShaderi(shader.toUInt(), pname.toUInt())
    }

    override fun getProgramInfoLog(program: Program): String? {
        return glGetProgramInfoLog(program.toUInt())
    }

    override fun getShaderInfoLog(shaderId: Shader): String? {
        return glGetShaderInfoLog(shaderId.toUInt())
    }

    override fun createProgram(): Program? {
        val program = glCreateProgram()
        return if (program == 0u) null else program.toInt()
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
        return glGetProgrami(program.toUInt(), pname.toUInt())
    }

    override fun getUniformLocation(programId: Program, name: String): UniformLocation? {
        return glGetUniformLocation(programId.toUInt(), name)
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
        return glGenBuffer().toInt()
    }

    @OptIn(ExperimentalUnsignedTypes::class)
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

    override fun deleteBuffer(buffer: GlBuffer) {
        glDeleteBuffer(buffer.toUInt())
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
            normalized,
            stride,
            offset.toLong().toCPointer<COpaque>()
        )
    }

    override fun uniform1f(location: UniformLocation, f: Float) {
        glUniform1f(location, f)
    }

    override fun uniform1i(location: UniformLocation, i: Int) {
        glUniform1i(location, i)
    }

    override fun uniform2f(location: UniformLocation, x: Float, y: Float) {
        glUniform2f(location, x, y)
    }

    override fun uniform2i(location: UniformLocation, x: Int, y: Int) {
        glUniform2i(location, x, y)
    }

    override fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float) {
        glUniform3f(location, x, y, z)
    }

    override fun uniform3fv(location: UniformLocation, value: FloatArray) {
        glUniform3fv(location, 1, value.refTo(0))
    }

    override fun uniform3i(location: UniformLocation, x: Int, y: Int, z: Int) {
        glUniform3i(location, x, y, z)
    }

    override fun uniform4f(location: UniformLocation, x: Float, y: Float, z: Float, w: Float) {
        glUniform4f(location, x, y, z, w)
    }

    override fun uniform4i(location: UniformLocation, x: Int, y: Int, z: Int, w: Int) {
        glUniform4i(location, x, y, z, w)
    }

    override fun uniformMatrix3fv(location: UniformLocation, transpose: Boolean, value: FloatArray) {
        glUniformMatrix3fv(location, 1, transpose, value.refTo(0))
    }

    override fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: FloatArray) {
        glUniformMatrix4fv(location, 1, transpose, value.refTo(0))
    }

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
        return glGenTexture().toInt()
    }

    @OptIn(ExperimentalUnsignedTypes::class)
    override fun createTextures(n: Int): Array<Texture> {
        val textures = UIntArray(n)
        textures.usePinned {
            glGenTextures(n, it.addressOf(0))
        }
        return Array(n) { textures[it].toInt() }
    }

    override fun deleteTexture(texture: Texture) {
        glDeleteTexture(texture.toUInt())
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
        return glGenVertexArray().toInt()
    }

    override fun bindVertexArray(vertexArrayObject: VertexArrayObject?) {
        if (vertexArrayObject != null) {
            glBindVertexArray(vertexArrayObject.toUInt())
        } else {
            glBindVertexArray(0u)
        }
    }

    override fun deleteVertexArray(vertexArrayObject: VertexArrayObject) {
        glDeleteVertexArray(vertexArrayObject.toUInt())
    }

    override fun drawArrays(mode: Int, first: Int, count: Int) {
        glDrawArrays(mode.toUInt(), first, count)
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
        return glCreateFramebuffer().toInt()
    }

    override fun deleteFramebuffer(framebuffer: Framebuffer) {
        glDeleteFramebuffer(framebuffer.toUInt())
    }

    override fun checkFramebufferStatus(target: Int): Int {
        return glCheckFramebufferStatus(target.toUInt()).toInt()
    }

    override fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Texture, level: Int) {
        glFramebufferTexture2D(target.toUInt(), attachment.toUInt(), textarget.toUInt(), texture.toUInt(), level)
    }

    override fun isFramebuffer(framebuffer: Framebuffer): Boolean {
        return glIsFramebuffer(framebuffer.toUInt())
    }

    override fun bindRenderbuffer(target: Int, renderbuffer: Renderbuffer?) {
        if (renderbuffer != null) {
            glBindRenderbuffer(target.toUInt(), renderbuffer.toUInt())
        } else {
            glBindRenderbuffer(target.toUInt(), 0u)
        }
    }

    override fun createRenderbuffer(): Renderbuffer {
        return glCreateRenderbuffer().toInt()
    }

    override fun deleteRenderbuffer(renderbuffer: Renderbuffer) {
        glDeleteRenderbuffer(renderbuffer.toUInt())
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
        return glIsRenderbuffer(renderbuffer.toUInt())
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
        glReadPixels(x, y, width, height, format.toUInt(), type.toUInt(), buffer.ref().getPointer(scope))
    }
}
