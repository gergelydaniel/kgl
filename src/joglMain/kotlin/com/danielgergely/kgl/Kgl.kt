package com.danielgergely.kgl

import com.jogamp.opengl.GL3ES3
import java.nio.ByteBuffer
import java.nio.IntBuffer
import java.awt.image.*
import java.util.*

typealias GL = GL3ES3

class KglJogl(@JvmField private val gl: GL) : Kgl {

    override fun createShader(type: Int): Shader? = gl.glCreateShader(type)

    override fun shaderSource(shaderId: Shader, source: String)
        = gl.glShaderSource(shaderId, 1, arrayOf(source), null as IntBuffer?)

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

    override fun getUniformLocation(programId: Program, name: String): UniformLocation? {
        val loc = gl.glGetUniformLocation(programId, name)
        return if (loc < 0) null else loc
    }

    override fun getAttribLocation(programId: Program, name: String): Int = gl.glGetAttribLocation(programId, name)

    override fun bindAttribLocation(programId: Program, index: Int, name: String) = gl.glBindAttribLocation(programId, index, name)

    override fun enable(cap: Int) = gl.glEnable(cap)
    override fun disable(cap: Int) = gl.glDisable(cap)

    override fun enableVertexAttribArray(location: Int) = gl.glEnableVertexAttribArray(location)

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

    override fun bindBuffer(target: Int, bufferId: GlBuffer) = gl.glBindBuffer(target, bufferId)

    override fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int) {
        return gl.glBufferData(target, size.toLong(), sourceData.buffer, usage)
    }

    override fun deleteBuffer(buffer: GlBuffer) = gl.glDeleteBuffers(1, intArrayOf(buffer), 0)


    override fun vertexAttribPointer(location: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int) {
        return gl.glVertexAttribPointer(location, size, type, normalized, stride, offset.toLong())
    }

    override fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float) = gl.glUniform3f(location, x, y, z)


    override fun uniform1f(location: UniformLocation, f: Float) {
        return gl.glUniform1f(location, f)
    }

    override fun uniform1i(location: UniformLocation, i: Int) {
        return gl.glUniform1i(location, i)
    }

    override fun uniformMatrix3fv(location: UniformLocation, transpose: Boolean, value: FloatArray)
            = gl.glUniformMatrix3fv(location, 1, transpose, value, 0)

    override fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: FloatArray)
        = gl.glUniformMatrix4fv(location, 1, transpose, value, 0)

    override fun blendFunc(sFactor: Int, dFactor: Int) = gl.glBlendFunc(sFactor, dFactor)

    override fun cullFace(mode: Int) = gl.glCullFace(mode)

    override fun viewport(x: Int, y: Int, width: Int, height: Int) {
        return gl.glViewport(x, y, width, height)
    }

    override fun clearColor(r: Float, g: Float, b: Float, a: Float) {
        return gl.glClearColor(r, g, b, a)
    }

    override fun clear(mask: Int) = gl.glClear(mask)

    override fun createTextures(n: Int): Array<Texture> {
        val buffer = IntBuffer.allocate(n)
        gl.glGenTextures(n, buffer)
        return toArray(buffer).toTypedArray()
    }

    override fun texImage2D(target: Int, level: Int, internalFormat: Int, border: Int, resource: TextureResource) {


        gl.glTexImage2D(target, level, internalFormat, resource.width, resource.height, border, GL_RGBA, GL_UNSIGNED_BYTE, imageToByteBuffer(resource))
    }

    override fun activeTexture(texture: Int) = gl.glActiveTexture(texture)

    override fun bindTexture(target: Int, texture: Texture) = gl.glBindTexture(target, texture)

    override fun generateMipmap(target: Int) = gl.glGenerateMipmap(target)

    override fun texParameteri(target: Int, pname: Int, value: Int) = gl.glTexParameteri(target, pname, value)

    override fun drawArrays(mode: Int, first: Int, count: Int) = gl.glDrawArrays(mode, first, count)
}

fun imageToByteBuffer(image: BufferedImage) : ByteBuffer {
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