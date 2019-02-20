package com.danielgergely.kgl

import com.jogamp.opengl.GL3ES3
import java.nio.ByteBuffer
import java.nio.IntBuffer

typealias GL = GL3ES3

class KglJogl(private val gl: GL) : Kgl {

    override fun createShader(type: Int): Shader? = gl.glCreateShader(type)

    override fun shaderSource(shaderId: Shader, source: String)
        = gl.glShaderSource(shaderId, 1, arrayOf(source), null as IntBuffer?)

    override fun compileShader(shaderId: Shader) = gl.glCompileShader(shaderId)

    override fun deleteShader(shaderId: Shader) = gl.glDeleteShader(shaderId)

    override fun shaderOk(shaderId: Shader): Boolean {
        val linkStatus = IntArray(1)
        gl.glGetProgramiv(shaderId, GL.GL_LINK_STATUS, linkStatus, 0)
        return linkStatus[0] == 0
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

    override fun getUniformLocation(programId: Program, name: String): UniformLocation? = gl.glGetUniformLocation(programId, name)

    override fun getAttribLocation(programId: Program, name: String): Int = gl.glGetAttribLocation(programId, name)

    override fun bindAttribLocation(programId: Program, index: Int, name: String) = gl.glBindAttribLocation(programId, index, name)

    override fun enable(cap: Int) = gl.glEnable(cap)

    override fun enableVertexAttribArray(location: Int) = gl.glEnableVertexAttribArray(location)

    override fun createBuffers(count: Int): Array<GlBuffer> {
        val buffers = IntArray(count)
        gl.glGenBuffers(count, buffers, 0)
        return buffers.toTypedArray()
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

    override fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: FloatArray) {
        return gl.glUniformMatrix4fv(location, 1, transpose, value, 0)
    }

    override fun viewport(x: Int, y: Int, width: Int, height: Int) {
        return gl.glViewport(x, y, width, height)
    }

    override fun clearColor(r: Float, g: Float, b: Float, a: Float) {
        return gl.glClearColor(r, g, b, a)
    }

    override fun clear(mask: Int) = gl.glClear(mask)

    override fun createTextures(n: Int): Array<Texture> {
        val ints = IntArray(n)
        gl.glGenTextures(n, ints, 0)
        return ints.toTypedArray()
    }

    override fun loadTexture(texture: Texture, resource: TextureResource) {
        throw NotImplementedError()
    }

    override fun activeTexture(texture: Int) = gl.glActiveTexture(texture)

    override fun bindTexture(target: Int, texture: Texture) = gl.glBindTexture(target, texture)

    override fun texParameteri(target: Int, pname: Int, value: Int) = gl.glTexParameteri(target, pname, value)

    override fun drawArrays(mode: Int, first: Int, count: Int) = gl.glDrawArrays(mode, first, count)
}