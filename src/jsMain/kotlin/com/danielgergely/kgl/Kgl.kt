package com.danielgergely.kgl

import org.khronos.webgl.*

class KglJs(private val gl: WebGLRenderingContext) : Kgl  {

    override fun createShader(type: Int): Shader? = gl.createShader(type) // TODO return null if unsuccessful

    override fun shaderSource(shaderId: Shader, source: String) = gl.shaderSource(shaderId as WebGLShader, source)
    override fun compileShader(shaderId: Shader) = gl.compileShader(shaderId as WebGLShader)
    override fun deleteShader(shaderId: Shader) = gl.deleteShader(shaderId as WebGLShader)

    override fun getShaderParameter(shader: Shader, pname: Int): Int {
        val value = gl.getShaderParameter(shader as WebGLShader, pname)!!

        if(value is Boolean) {
            return if(value) GL_TRUE else GL_FALSE
        }
        return value as Int
    }

    override fun getProgramInfoLog(program: Program) : String? = gl.getProgramInfoLog(program as WebGLProgram)
    override fun getShaderInfoLog(shaderId: Shader): String? = gl.getShaderInfoLog(shaderId as WebGLShader)

    override fun createProgram(): Program? = gl.createProgram()
    override fun attachShader(programId: Program, shaderId: Shader) = gl.attachShader(programId as WebGLProgram, shaderId as WebGLShader)
    override fun linkProgram(programId: Program) = gl.linkProgram(programId as WebGLProgram)
    override fun useProgram(programId: Program) = gl.useProgram(programId as WebGLProgram)

    override fun getUniformLocation(programId: Program, name: String): UniformLocation? = gl.getUniformLocation(programId as WebGLProgram, name)
    override fun getAttribLocation(programId: Program, name: String): Int = gl.getAttribLocation(programId as WebGLProgram, name)
    override fun bindAttribLocation(programId: Program, index: Int, name: String) = gl.bindAttribLocation(programId as WebGLProgram, index, name)

    override fun enableVertexAttribArray(location: Int) = gl.enableVertexAttribArray(location)

    override fun enable(cap : Int) = gl.enable(cap)
    override fun disable(cap : Int) = gl.disable(cap)

    override fun createBuffers(count: Int): Array<GlBuffer> = Array(count, { gl.createBuffer() ?: throw Exception() })

    override fun bindBuffer(target: Int, bufferId: GlBuffer) = gl.bindBuffer(target, bufferId as WebGLBuffer)
    override fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int) {
        val buffer: dynamic = sourceData.buffer
        gl.bufferData(target, buffer.unsafeCast<BufferDataSource>(), usage)
    }

    override fun deleteBuffer(buffer: GlBuffer) = gl.deleteBuffer(buffer as WebGLBuffer)


    override fun vertexAttribPointer(location: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int) = gl.vertexAttribPointer(location, size, type, normalized, stride, offset)

    override fun uniform1f(location: UniformLocation, f: Float) = gl.uniform1f(location as WebGLUniformLocation, f)
    override fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float) = gl.uniform3f(location as WebGLUniformLocation, x, y, z)
    override fun uniform1i(location: UniformLocation, i: Int) = gl.uniform1i(location as WebGLUniformLocation, i)


    // TODO use value directly using an unsafe cast to avoid copying
    override fun uniformMatrix3fv(location: UniformLocation, transpose: Boolean, value: FloatArray) {
        val buffer = Float32Array(value.size)
        for (i in 0 until value.size) {
            buffer[i] = value[i]
        }
        gl.uniformMatrix3fv(location as WebGLUniformLocation, transpose, buffer)
    }

    override fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: FloatArray) {
        val buffer = Float32Array(value.size)
        for (i in 0 until value.size) {
            buffer[i] = value[i]
        }
        gl.uniformMatrix4fv(location as WebGLUniformLocation, transpose, buffer)
    }

    override fun viewport(x: Int, y: Int, width: Int, height: Int) = gl.viewport(x, y, width, height)
    override fun clear(mask: Int) = gl.clear(mask)
    override fun clearColor(r: Float, g: Float, b: Float, a: Float) = gl.clearColor(r, g, b, a)

    override fun blendFunc(sFactor: Int, dFactor: Int) = gl.blendFunc(sFactor, dFactor)

    override fun createTextures(n: Int): Array<Texture> = Array(n) { gl.createTexture() ?: throw Exception() }
    override fun texImage2D(target: Int, level: Int, internalFormat: Int, border: Int, resource: TextureResource)
        = gl.texImage2D(target, level, internalFormat, GL_RGBA, GL_UNSIGNED_BYTE, resource.image)


    override fun activeTexture(texture: Int) = gl.activeTexture(texture)
    override fun bindTexture(target: Int, texture: Texture) = gl.bindTexture(target, texture as WebGLTexture)
    override fun generateMipmap(target: Int) = gl.generateMipmap(target)
    override fun texParameteri(target: Int, pname: Int, value: Int) = gl.texParameteri(target, pname, value)

    override fun drawArrays(mode: Int, first: Int, count: Int) = gl.drawArrays(mode, first, count)

}