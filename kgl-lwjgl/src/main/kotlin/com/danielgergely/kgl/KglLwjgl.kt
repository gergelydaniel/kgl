package com.danielgergely.kgl

import org.lwjgl.BufferUtils
import org.lwjgl.opengl.GL33
import org.lwjgl.stb.STBImage
import java.io.InputStream
import java.nio.ByteBuffer

typealias GL = GL33

class KglLwjgl : Kgl {
    override fun cullFace(mode: Int) {
        GL.glCullFace(mode)
    }

    override fun blendFunc(sFactor: Int, dFactor: Int) {
        GL.glBlendFunc(sFactor, dFactor)
    }

    override fun getShaderParameter(shader: Shader, pname: Int): Int {
        val arr = IntArray(1)
        GL.glGetShaderiv(shader, pname, arr)
        return arr[0]
    }

    override fun activeTexture(texture: Int) {
        GL.glActiveTexture(texture)
    }

    override fun attachShader(programId: Program, shaderId: Shader) {
        GL.glAttachShader(programId, shaderId)
    }

    override fun bindAttribLocation(programId: Program, index: Int, name: String) {
        GL.glBindAttribLocation(programId, index, name)
    }

    override fun bindBuffer(target: Int, bufferId: GlBuffer) {
        GL.glBindBuffer(target, bufferId)
    }

    override fun bindTexture(target: Int, texture: Texture) {
        GL.glBindTexture(target, texture)
    }

    override fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int) {
        GL.glBufferData(target, sourceData.buffer, usage) //TODO this may be problematic
    }

    override fun clear(mask: Int) {
        GL.glClear(mask)
    }

    override fun clearColor(r: Float, g: Float, b: Float, a: Float) {
        GL.glClearColor(r, g, b, a)
    }

    override fun compileShader(shaderId: Shader) {
        GL.glCompileShader(shaderId)
    }

    override fun createBuffers(count: Int): Array<GlBuffer> {
        val array = IntArray(count)
        GL.glGenBuffers(array)
        return array.toTypedArray()
    }

    override fun createProgram(): Program? {
        return GL.glCreateProgram()
    }

    override fun createShader(type: Int): Shader? {
        val shader = GL.glCreateShader(type)
        return if (shader == 0) {
            null
        } else {
            shader
        }
    }

    override fun createTextures(n: Int): Array<Texture> {
        val array = IntArray(n)
        GL.glGenTextures(array)
        return array.toTypedArray()
    }

    override fun deleteTexture(texture: Texture) {
        GL.glDeleteTextures(intArrayOf(texture))
    }

    override fun deleteBuffer(buffer: GlBuffer) {
        GL.glDeleteBuffers(buffer)
    }

    override fun deleteShader(shaderId: Shader) {
        GL.glDeleteShader(shaderId)
    }

    override fun drawArrays(mode: Int, first: Int, count: Int) {
        GL.glDrawArrays(mode, first, count)
    }

    override fun enable(cap: Int) {
        GL.glEnable(cap)
    }

    override fun disable(cap: Int) {
        GL.glDisable(cap)
    }

    override fun enableVertexAttribArray(location: Int) {
        GL.glEnableVertexAttribArray(location)
    }

    override fun disableVertexAttribArray(location: Int) {
        GL.glDisableVertexAttribArray(location)
    }

    override fun generateMipmap(target: Int) {
        GL.glGenerateMipmap(target)
    }

    override fun getAttribLocation(programId: Program, name: String): Int {
        return GL.glGetAttribLocation(programId, name)
    }

    override fun getProgramInfoLog(program: Program): String? {
        return GL.glGetProgramInfoLog(program)
    }

    override fun getShaderInfoLog(shaderId: Shader): String? {
        return GL.glGetShaderInfoLog(shaderId)
    }

    override fun getUniformLocation(programId: Program, name: String): UniformLocation? {
        return GL.glGetUniformLocation(programId, name)
    }

    override fun linkProgram(programId: Program) {
        GL.glLinkProgram(programId)
    }

    override fun shaderSource(shaderId: Shader, source: String) {
        GL.glShaderSource(shaderId, source)
    }

    override fun texImage2D(target: Int, level: Int, internalFormat: Int, border: Int, resource: TextureResource) {
        val width = BufferUtils.createIntBuffer(1)
        val height = BufferUtils.createIntBuffer(1)
        val components = BufferUtils.createIntBuffer(1)

        val data = STBImage.stbi_load_from_memory(streamToByteBuffer(resource.encodedPng), width, height, components, 4)

        GL.glTexImage2D(target, level, internalFormat, width.get(), height.get(), border, GL_RGBA, GL_UNSIGNED_BYTE, data)
    }

    override fun texParameteri(target: Int, pname: Int, value: Int) {
        GL.glTexParameteri(target, pname, value)
    }

    override fun uniform1f(location: UniformLocation, f: Float) {
        GL.glUniform1f(location, f)
    }

    override fun uniform1i(location: UniformLocation, i: Int) {
        GL.glUniform1i(location, i)
    }

    override fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float) {
        GL.glUniform3f(location, x, y, z)
    }

    override fun uniform3fv(location: UniformLocation, value: FloatArray) {
        GL.glUniform3fv(location, value)
    }

    override fun uniformMatrix3fv(location: UniformLocation, transpose: Boolean, value: FloatArray) {
        GL.glUniformMatrix3fv(location, transpose, value)
    }

    override fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: FloatArray) {
        GL.glUniformMatrix4fv(location, transpose, value)
    }

    override fun useProgram(programId: Program) {
        GL.glUseProgram(programId)
    }

    override fun vertexAttribPointer(location: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int) {
        GL.glVertexAttribPointer(location, size, type, normalized, stride, offset.toLong())
    }

    override fun viewport(x: Int, y: Int, width: Int, height: Int) {
        GL.glViewport(x, y, width, height)
    }

}

private fun streamToByteBuffer(source: InputStream): ByteBuffer {
    var buffer = BufferUtils.createByteBuffer(1024)
    source.use { source ->
        val buf = ByteArray(1024)
        while (true) {
            val bytes = source.read(buf, 0, buf.size)
            if (bytes == -1)
                break
            if (buffer.remaining() < bytes)
                buffer = resizeBuffer(buffer, buffer.capacity() * 2)
            buffer.put(buf, 0, bytes)
        }
        buffer.flip()
    }

    return buffer
}

private fun resizeBuffer(buffer: ByteBuffer, newCapacity: Int): ByteBuffer {
    val newBuffer = BufferUtils.createByteBuffer(newCapacity)
    buffer.flip()
    newBuffer.put(buffer)
    return newBuffer
}