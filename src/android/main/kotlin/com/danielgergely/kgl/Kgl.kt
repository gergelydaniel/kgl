package com.danielgergely.kgl

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.opengl.GLES20
import android.opengl.GLUtils

typealias GL = GLES20

class KglAndroid : Kgl {
    override fun createShader(type: Int): Shader? = GL.glCreateShader(type) //TODO null, 0

    override fun shaderSource(shaderId: Int, source: String) = GL.glShaderSource(shaderId, source)
    override fun compileShader(shaderId: Int) = GL.glCompileShader(shaderId)
    override fun deleteShader(shaderId: Int) = GL.glDeleteShader(shaderId)

    override fun shaderOk(shaderId: Int): Boolean {
        val linkStatus = IntArray(1)
        GL.glGetProgramiv(shaderId, GLES20.GL_LINK_STATUS, linkStatus, 0)
        return linkStatus[0] == 0
    }

    override fun getProgramInfoLog(program: Int) = GL.glGetProgramInfoLog(program)
    override fun getShaderInfoLog(shaderId: Int) = GL.glGetShaderInfoLog(shaderId)

    override fun createProgram(): Program? = GL.glCreateProgram()

    override fun attachShader(programId: Program, shaderId: Int) = GL.glAttachShader(programId, shaderId)
    override fun linkProgram(programId: Program) {
        GL.glLinkProgram(programId)

        //TODO nemide
        val linkStatus = IntArray(1)
        GL.glGetProgramiv(programId, GL.GL_LINK_STATUS, linkStatus, 0)

        // If the link failed, delete the program.
        if (linkStatus[0] == 0) {
            val s = getProgramInfoLog(programId)

            println(s)

            throw Exception("Linking error")
        }
    }
    override fun useProgram(programId: Program) = GL.glUseProgram(programId)
    override fun getUniformLocation(programId: Program, name: String) : UniformLocation? {
        val loc = GL.glGetUniformLocation(programId, name)
        return if (loc < 0) null else loc
    }

    override fun getAttribLocation(programId: Program, name: String) = GL.glGetAttribLocation(programId, name)
    override fun bindAttribLocation(programId: Program, index: Int, name: String) = GL.glBindAttribLocation(programId, index, name)
    override fun createBuffers(count: Int): Array<GlBuffer> {
        val buffers = IntArray(count)
        GL.glGenBuffers(count, buffers, 0)
        return buffers.toTypedArray()
    }

    override fun bindBuffer(target: Int, bufferId: Int) = GL.glBindBuffer(target, bufferId)
    override fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int) {
        GL.glBufferData(target, size, sourceData.buffer, usage)
    }
    override fun deleteBuffer(buffer: GlBuffer) = GL.glDeleteBuffers(1, intArrayOf(buffer), 0)

    override fun vertexAttribPointer(location: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int)
            = GL.glVertexAttribPointer(location, size, type, normalized, stride, offset)

    override fun enableVertexAttribArray(location: Int) = GL.glEnableVertexAttribArray(location)

    override fun enable(cap : Int) = GL.glEnable(cap)
    override fun disable(cap : Int) = GL.glDisable(cap)

    override fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float) = GL.glUniform3f(location, x, y, z)
    override fun uniform1f(location: UniformLocation, f: Float) = GL.glUniform1f(location, f)
    override fun uniform1i(location: UniformLocation, i: Int) = GL.glUniform1i(location, i)

    override fun uniformMatrix3fv(location: Int, transpose: Boolean, value: FloatArray)
            = GL.glUniformMatrix3fv(location, 1, transpose, value, 0)

    override fun uniformMatrix4fv(location: Int, transpose: Boolean, value: FloatArray)
            = GL.glUniformMatrix4fv(location, 1, transpose, value, 0)

    override fun viewport(x: Int, y: Int, width: Int, height: Int) = GL.glViewport(x, y, width, height)
    override fun clear(mask: Int) = GL.glClear(mask)

    override fun clearColor(r: Float, g: Float, b: Float, a: Float) = GL.glClearColor(r, g, b, a)

    override fun createTextures(n: Int) : Array<Texture> {
        val ints = IntArray(n)
        GL.glGenTextures(n, ints, 0)
        return ints.toTypedArray()
    }

    override fun texImage2D(target: Int, level: Int, internalFormat: Int, border: Int, resource: Bitmap) {
        GLUtils.texImage2D(target, level, internalFormat, resource, border)
    }

    override fun activeTexture(texture: Int) = GL.glActiveTexture(texture)
    override fun bindTexture(target: Int, texture: Texture) = GL.glBindTexture(target, texture)
    override fun generateMipmap(target: Int) = GL.glGenerateMipmap(target)
    override fun texParameteri(target: Int, pname: Int, value: Int) = GL.glTexParameteri(target, pname, value)

    override fun drawArrays(mode: Int, first: Int, count: Int) = GL.glDrawArrays(mode, first, count)
}