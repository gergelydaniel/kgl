package com.danielgergely.kgl

import com.jogamp.opengl.GL3ES3
import java.awt.image.BufferedImage
import java.nio.ByteBuffer
import java.nio.IntBuffer
import java.util.*

typealias GL = GL3ES3

class KglJogl(private val gl: GL) : Kgl {

    override fun createShader(type: Int): Shader? {
        val shader = gl.glCreateShader(type)
        return if (shader == 0) {
            null
        } else {
            shader
        }
    }

    override fun shaderSource(shaderId: Shader, source: String) =
        gl.glShaderSource(shaderId, 1, arrayOf(source), null as IntBuffer?)

    override fun compileShader(shaderId: Shader) = gl.glCompileShader(shaderId)

    override fun deleteShader(shaderId: Shader) = gl.glDeleteShader(shaderId)

    override fun getShaderParameter(shader: Shader, pname: Int): Int {
        val arr = IntArray(1)
        gl.glGetShaderiv(shader, pname, arr, 0)
        return arr[0]
    }

    override fun getProgramInfoLog(program: Program): String? {
        val intBuffer = IntBuffer.allocate(1)

        gl.glGetProgramiv(program, GL.GL_INFO_LOG_LENGTH, intBuffer)
        val size = intBuffer.get(0)
        return if (size == 0) null else {
            val byteBuffer = ByteBuffer.allocate(size)
            gl.glGetProgramInfoLog(program, size, intBuffer, byteBuffer)

            String(byteBuffer.array())
        }
    }

    override fun getShaderInfoLog(shaderId: Shader): String? {
        val intBuffer = IntBuffer.allocate(1)

        gl.glGetShaderiv(shaderId, GL.GL_INFO_LOG_LENGTH, intBuffer)
        val size = intBuffer.get(0)
        return if (size == 0) null else {
            val byteBuffer = ByteBuffer.allocate(size)
            gl.glGetShaderInfoLog(shaderId, size, intBuffer, byteBuffer)

            String(byteBuffer.array())
        }
    }

    override fun createProgram(): Program? = gl.glCreateProgram()

    override fun attachShader(programId: Program, shaderId: Shader) = gl.glAttachShader(programId, shaderId)

    override fun linkProgram(programId: Program) = gl.glLinkProgram(programId)

    override fun useProgram(programId: Program) = gl.glUseProgram(programId)

    override fun detachShader(programId: Program, shaderId: Shader) = gl.glDetachShader(programId, shaderId)
    override fun deleteProgram(programId: Program) = gl.glDeleteProgram(programId)

    override fun getProgramParameter(program: Program, pname: Int): Int {
        val arr = IntArray(1)
        gl.glGetProgramiv(program, pname, arr, 0)
        return arr[0]
    }

    override fun getUniformLocation(programId: Program, name: String): UniformLocation? {
        val loc = gl.glGetUniformLocation(programId, name)
        return if (loc < 0) null else loc
    }

    override fun getAttribLocation(programId: Program, name: String): Int = gl.glGetAttribLocation(programId, name)

    override fun bindAttribLocation(programId: Program, index: Int, name: String) =
        gl.glBindAttribLocation(programId, index, name)

    override fun enable(cap: Int) = gl.glEnable(cap)
    override fun disable(cap: Int) = gl.glDisable(cap)

    override fun enableVertexAttribArray(location: Int) = gl.glEnableVertexAttribArray(location)
    override fun disableVertexAttribArray(location: Int) = gl.glDisableVertexAttribArray(location)

    override fun createBuffer(): GlBuffer {
        val buffers = IntArray(1)
        gl.glGenBuffers(1, buffers, 0)
        return buffers[0]
    }

    override fun createBuffers(count: Int): Array<GlBuffer> {
        val buffers = IntArray(count)
        gl.glGenBuffers(count, buffers, 0)
        return buffers.toTypedArray()
    }

    private fun toArray(b: IntBuffer): IntArray {
        if (b.hasArray()) {
            return if (b.arrayOffset() == 0) b.array() else Arrays.copyOfRange(
                b.array(),
                b.arrayOffset(),
                b.array().size
            )

        }

        b.rewind()
        val foo = IntArray(b.remaining())
        b.get(foo)

        return foo
    }

    override fun bindBuffer(target: Int, bufferId: GlBuffer?) = gl.glBindBuffer(target, bufferId ?: 0)

    override fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int) {
        sourceData.withJavaBuffer { javaBuffer ->
            gl.glBufferData(target, size.toLong(), javaBuffer, usage)
        }
    }

    override fun deleteBuffer(buffer: GlBuffer) = gl.glDeleteBuffers(1, intArrayOf(buffer), 0)


    override fun vertexAttribPointer(
        location: Int,
        size: Int,
        type: Int,
        normalized: Boolean,
        stride: Int,
        offset: Int
    ) {
        return gl.glVertexAttribPointer(location, size, type, normalized, stride, offset.toLong())
    }

    override fun uniform1f(location: UniformLocation, f: Float) =
        gl.glUniform1f(location, f)
    override fun uniform1fv(location: UniformLocation, value: FloatArray) =
        gl.glUniform1fv(location, value.vSize(1), value, 0)
    override fun uniform1i(location: UniformLocation, i: Int) =
        gl.glUniform1i(location, i)
    override fun uniform1iv(location: UniformLocation, value: IntArray) =
        gl.glUniform1iv(location, value.vSize(1), value, 0)

    override fun uniform2f(location: UniformLocation, x: Float, y: Float) =
        gl.glUniform2f(location, x, y)
    override fun uniform2fv(location: UniformLocation, value: FloatArray) =
        gl.glUniform2fv(location, value.vSize(2), value, 0)
    override fun uniform2i(location: UniformLocation, x: Int, y: Int) =
        gl.glUniform2i(location, x, y)
    override fun uniform2iv(location: UniformLocation, value: IntArray) =
        gl.glUniform2iv(location, value.vSize(2), value, 0)

    override fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float) =
        gl.glUniform3f(location, x, y, z)
    override fun uniform3fv(location: UniformLocation, value: FloatArray) =
        gl.glUniform3fv(location, value.vSize(3), value, 0)
    override fun uniform3i(location: UniformLocation, x: Int, y: Int, z: Int) =
        gl.glUniform3i(location, x, y, z)
    override fun uniform3iv(location: UniformLocation, value: IntArray) =
        gl.glUniform3iv(location, value.vSize(3), value, 0)

    override fun uniform4f(location: UniformLocation, x: Float, y: Float, z: Float, w: Float) =
        gl.glUniform4f(location, x, y, z, w)
    override fun uniform4fv(location: UniformLocation, value: FloatArray) =
        gl.glUniform4fv(location, value.vSize(4), value, 0)
    override fun uniform4i(location: UniformLocation, x: Int, y: Int, z: Int, w: Int) =
        gl.glUniform4i(location, x, y, z, w)
    override fun uniform4iv(location: UniformLocation, value: IntArray) =
        gl.glUniform4iv(location, value.vSize(4), value, 0)

    override fun uniformMatrix3fv(location: UniformLocation, transpose: Boolean, value: FloatArray) =
        gl.glUniformMatrix3fv(location, value.vSize(3*3), transpose, value, 0)
    override fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: FloatArray) =
        gl.glUniformMatrix4fv(location, value.vSize(4*4), transpose, value, 0)

    override fun blendFunc(sFactor: Int, dFactor: Int) = gl.glBlendFunc(sFactor, dFactor)

    override fun cullFace(mode: Int) = gl.glCullFace(mode)

    override fun viewport(x: Int, y: Int, width: Int, height: Int) {
        return gl.glViewport(x, y, width, height)
    }

    override fun clearColor(r: Float, g: Float, b: Float, a: Float) {
        return gl.glClearColor(r, g, b, a)
    }

    override fun clear(mask: Int) = gl.glClear(mask)

    override fun createTexture(): Texture {
        val buffer = IntBuffer.allocate(1)
        gl.glGenTextures(1, buffer)
        return buffer[0]
    }

    override fun createTextures(n: Int): Array<Texture> {
        val buffer = IntBuffer.allocate(n)
        gl.glGenTextures(n, buffer)
        return toArray(buffer).toTypedArray()
    }

    override fun deleteTexture(texture: Texture) = gl.glDeleteTextures(1, intArrayOf(texture), 0)

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
        buffer.withJavaBuffer { javaBuffer ->
            gl.glTexImage2D(target, level, internalFormat, width, height, border, format, type, javaBuffer)
        }
    }

    override fun activeTexture(texture: Int) = gl.glActiveTexture(texture)

    override fun bindTexture(target: Int, texture: Texture?) = gl.glBindTexture(target, texture ?: 0)

    override fun generateMipmap(target: Int) = gl.glGenerateMipmap(target)

    override fun texParameteri(target: Int, pname: Int, value: Int) = gl.glTexParameteri(target, pname, value)

    override fun createVertexArray(): VertexArrayObject {
        val ints = IntArray(1)
        gl.glGenVertexArrays(1, ints, 0)
        return ints[0]
    }

    override fun bindVertexArray(vertexArrayObject: VertexArrayObject?) = gl.glBindVertexArray(vertexArrayObject ?: 0)
    override fun deleteVertexArray(vertexArrayObject: VertexArrayObject) =
        gl.glDeleteVertexArrays(1, intArrayOf(vertexArrayObject), 0)

    override fun drawArrays(mode: Int, first: Int, count: Int) = gl.glDrawArrays(mode, first, count)
    override fun drawElements(mode: Int, count: Int, type: Int) = gl.glDrawElements(mode, count, type, 0)

    override fun getError(): Int = gl.glGetError()
    override fun finish() = gl.glFinish()

    override fun bindFramebuffer(target: Int, framebuffer: Framebuffer?) =
        gl.glBindFramebuffer(target, framebuffer ?: 0)

    override fun createFramebuffer(): Framebuffer {
        val ints = IntArray(1)
        gl.glGenFramebuffers(1, ints, 0)
        return ints[0]
    }

    override fun deleteFramebuffer(framebuffer: Framebuffer) = gl.glDeleteFramebuffers(1, intArrayOf(framebuffer), 0)
    override fun checkFramebufferStatus(target: Int): Int = gl.glCheckFramebufferStatus(target)
    override fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Texture, level: Int) =
        gl.glFramebufferTexture2D(target, attachment, textarget, texture, level)

    override fun isFramebuffer(framebuffer: Framebuffer): Boolean = gl.glIsFramebuffer(framebuffer)

    override fun bindRenderbuffer(target: Int, renderbuffer: Renderbuffer?) =
        gl.glBindRenderbuffer(target, renderbuffer ?: 0)

    override fun createRenderbuffer(): Renderbuffer {
        val ints = IntArray(1)
        gl.glGenRenderbuffers(1, ints, 0)
        return ints[0]
    }

    override fun deleteRenderbuffer(renderbuffer: Renderbuffer) =
        gl.glDeleteRenderbuffers(1, intArrayOf(renderbuffer), 0)

    override fun framebufferRenderbuffer(
        target: Int,
        attachment: Int,
        renderbuffertarget: Int,
        renderbuffer: Renderbuffer
    ) = gl.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer)

    override fun isRenderbuffer(renderbuffer: Renderbuffer): Boolean = gl.glIsRenderbuffer(renderbuffer)
    override fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int) =
        gl.glRenderbufferStorage(target, internalformat, width, height)

    override fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, buffer: Buffer) {
        buffer.withJavaBuffer { javaBuffer ->
            gl.glReadPixels(x, y, width, height, format, type, javaBuffer)
        }
    }
}

fun imageToByteBuffer(image: BufferedImage): ByteBuffer {
    val width = image.width
    val height = image.height

    val pixels = IntArray(width * height)
    image.getRGB(0, 0, width, height, pixels, 0, width)

    val buffer = ByteBuffer.allocate(width * height * 4) // 4 because RGBA

    for (y in 0 until height) {
        for (x in 0 until width) {
            val pixel = pixels[x + y * width]
            buffer.put((pixel shr 16 and 0xFF).toByte())
            buffer.put((pixel shr 8 and 0xFF).toByte())
            buffer.put((pixel and 0xFF).toByte())
            buffer.put((pixel shr 24 and 0xFF).toByte())
        }
    }

    buffer.flip()

    return buffer
}

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