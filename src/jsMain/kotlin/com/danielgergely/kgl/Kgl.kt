package com.danielgergely.kgl

import org.khronos.webgl.*
import org.w3c.dom.HTMLImageElement
import kotlin.browser.document

class KglJs(private val gl: WebGLRenderingContext) : Kgl  {
    override fun createShader(type: Int): Shader? = gl.createShader(type) // TODO return null if unsuccessful

    override fun shaderSource(shaderId: Shader, source: String) = gl.shaderSource(shaderId as WebGLShader, source)
    override fun compileShader(shaderId: Shader) = gl.compileShader(shaderId as WebGLShader)
    override fun deleteShader(shaderId: Shader) = gl.deleteShader(shaderId as WebGLShader)

    // check whether shader has compiled
    override fun shaderOk(shaderId: Shader): Boolean = true //TODO implement(?)

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

    override fun createBuffers(count: Int): Array<GlBuffer> = Array(count, { gl.createBuffer() ?: throw Exception() })

    override fun bindBuffer(target: Int, bufferId: GlBuffer) = gl.bindBuffer(target, bufferId as WebGLBuffer)
    override fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int) {
        gl.bufferData(target, sourceData.buffer, usage)
    }
    override fun deleteBuffer(buffer: GlBuffer) = gl.deleteBuffer(buffer as WebGLBuffer)


    override fun vertexAttribPointer(location: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int) = gl.vertexAttribPointer(location, size, type, normalized, stride, offset)

    override fun uniform1f(location: UniformLocation, f: Float) = gl.uniform1f(location as WebGLUniformLocation, f)
    override fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float) = gl.uniform3f(location as WebGLUniformLocation, x, y, z)
    override fun uniform1i(location: UniformLocation, i: Int) = gl.uniform1i(location as WebGLUniformLocation, i)

    override fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: FloatArray) {
        val buffer = Float32Array(value.size)
        //TODO faster
        for (i in 0 until value.size) {
            buffer[i] = value[i]
        }
        gl.uniformMatrix4fv(location as WebGLUniformLocation, transpose, buffer)
    }

    override fun viewport(x: Int, y: Int, width: Int, height: Int) = gl.viewport(x, y, width, height)
    override fun clear(mask: Int) = gl.clear(mask)
    override fun clearColor(r: Float, g: Float, b: Float, a: Float) = gl.clearColor(r, g, b, a)

    override fun createTextures(n: Int): Array<Texture> = Array(n) { gl.createTexture() ?: throw Exception() }
    override fun loadTexture(texture: Texture, resource: String) {
        gl.bindTexture(GL_TEXTURE_2D, texture as WebGLTexture)

        val level = 0
        val internalFormat = GL_RGBA
        val w = 1
        val h = 1
        val border = 0
        val srcFormat = GL_RGBA
        val srcType = GL_UNSIGNED_BYTE
        val pixel = Uint8Array(byteArrayOf(0, 0, 0, 0).toTypedArray())
        gl.texImage2D(GL_TEXTURE_2D, level, internalFormat,
            w, h, border, srcFormat, srcType,
            pixel)


        val image = document.createElement("img") as HTMLImageElement
        image.onload = {
            gl.bindTexture(GL_TEXTURE_2D, texture)
            gl.texImage2D(GL_TEXTURE_2D, level, internalFormat, srcFormat, srcType, image)

            if (isPowerOf2(image.width) && isPowerOf2(image.height)) {
                gl.generateMipmap(GL_TEXTURE_2D)
            } else {
                gl.texParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE)
                gl.texParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE)
                gl.texParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR)
            }
        }
        image.crossOrigin = ""
        image.src = "$resource.png"
    }
    fun isPowerOf2(n : Int) = (n and (n - 1)) == 0

    override fun activeTexture(texture: Int) = gl.activeTexture(texture)
    override fun bindTexture(target: Int, texture: Texture) = gl.bindTexture(target, texture as WebGLTexture)
    override fun texParameteri(target: Int, pname: Int, value: Int) = gl.texParameteri(target, pname, value)

    override fun drawArrays(mode: Int, first: Int, count: Int) = gl.drawArrays(mode, first, count)

}