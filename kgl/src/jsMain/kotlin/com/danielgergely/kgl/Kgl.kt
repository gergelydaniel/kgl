package com.danielgergely.kgl

import org.khronos.webgl.*

class KglJs(private val gl: WebGLRenderingContext) : Kgl  {

    override fun createShader(type: Int): Shader? = gl.createShader(type)

    override fun shaderSource(shaderId: Shader, source: String) = gl.shaderSource(shaderId.unsafeCast<WebGLShader>(), source)
    override fun compileShader(shaderId: Shader) = gl.compileShader(shaderId.unsafeCast<WebGLShader>())
    override fun deleteShader(shaderId: Shader) = gl.deleteShader(shaderId.unsafeCast<WebGLShader>())

    override fun getShaderParameter(shader: Shader, pname: Int): Int {
        val value = gl.getShaderParameter(shader.unsafeCast<WebGLShader>(), pname)!!

        if(value is Boolean) {
            return if(value) GL_TRUE else GL_FALSE
        }
        return value as Int
    }

    override fun getProgramInfoLog(program: Program) : String? = gl.getProgramInfoLog(program.unsafeCast<WebGLProgram>())
    override fun getShaderInfoLog(shaderId: Shader): String? = gl.getShaderInfoLog(shaderId.unsafeCast<WebGLShader>())

    override fun getProgramParameter(program: Program, pname: Int): Int {
        val value = gl.getProgramParameter(program.unsafeCast<WebGLProgram>(), pname)!!

        if(value is Boolean) {
            return if(value) GL_TRUE else GL_FALSE
        }
        return value as Int
    }

    override fun createProgram(): Program? = gl.createProgram()
    override fun attachShader(programId: Program, shaderId: Shader) = gl.attachShader(programId.unsafeCast<WebGLProgram>(), shaderId.unsafeCast<WebGLShader>())
    override fun linkProgram(programId: Program) = gl.linkProgram(programId.unsafeCast<WebGLProgram>())
    override fun useProgram(programId: Program) = gl.useProgram(programId.unsafeCast<WebGLProgram>())

    override fun getUniformLocation(programId: Program, name: String): UniformLocation? = gl.getUniformLocation(programId.unsafeCast<WebGLProgram>(), name)
    override fun getAttribLocation(programId: Program, name: String): Int = gl.getAttribLocation(programId.unsafeCast<WebGLProgram>(), name)
    override fun bindAttribLocation(programId: Program, index: Int, name: String) = gl.bindAttribLocation(programId.unsafeCast<WebGLProgram>(), index, name)

    override fun enableVertexAttribArray(location: Int) = gl.enableVertexAttribArray(location)
    override fun disableVertexAttribArray(location: Int) = gl.disableVertexAttribArray(location)

    override fun enable(cap : Int) = gl.enable(cap)
    override fun disable(cap : Int) = gl.disable(cap)

    override fun createBuffers(count: Int): Array<GlBuffer> = Array(count) { gl.createBuffer() ?: throw Exception() }

    override fun bindBuffer(target: Int, bufferId: GlBuffer?) = gl.bindBuffer(target, bufferId.unsafeCast<WebGLBuffer>())
    override fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int, offset: Int) {
        sourceData.withGlBuffer(offset) { glBuffer ->
            gl.bufferData(target, glBuffer, usage)
        }
    }

    override fun deleteBuffer(buffer: GlBuffer) = gl.deleteBuffer(buffer.unsafeCast<WebGLBuffer>())


    override fun vertexAttribPointer(location: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int) = gl.vertexAttribPointer(location, size, type, normalized, stride, offset)

    override fun uniform1f(location: UniformLocation, f: Float) = gl.uniform1f(location.unsafeCast<WebGLUniformLocation>(), f)
    override fun uniform1i(location: UniformLocation, i: Int) = gl.uniform1i(location.unsafeCast<WebGLUniformLocation>(), i)

    override fun uniform2f(location: UniformLocation, x: Float, y: Float) = gl.uniform2f(location.unsafeCast<WebGLUniformLocation>(), x, y)
    override fun uniform2i(location: UniformLocation, x: Int, y: Int) = gl.uniform2i(location.unsafeCast<WebGLUniformLocation>(), x, y)

    override fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float) = gl.uniform3f(location.unsafeCast<WebGLUniformLocation>(), x, y, z)
    override fun uniform3fv(location: UniformLocation, value: FloatArray) = gl.uniform3fv(location.unsafeCast<WebGLUniformLocation>(), value.unsafeCast<Float32Array>())
    override fun uniform3i(location: UniformLocation, x: Int, y: Int, z: Int) = gl.uniform3i(location.unsafeCast<WebGLUniformLocation>(), x, y, z)

    override fun uniform4f(location: UniformLocation, x: Float, y: Float, z: Float, w: Float) = gl.uniform4f(location.unsafeCast<WebGLUniformLocation>(), x, y, z, w)
    override fun uniform4i(location: UniformLocation, x: Int, y: Int, z: Int, w: Int) = gl.uniform4i(location.unsafeCast<WebGLUniformLocation>(), x, y, z, w)

    override fun uniformMatrix3fv(location: UniformLocation, transpose: Boolean, value: dynamic) {
        gl.uniformMatrix3fv(location.unsafeCast<WebGLUniformLocation>(), transpose, value.unsafeCast<Float32Array>())
    }

    override fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: dynamic) {
        gl.uniformMatrix4fv(location.unsafeCast<WebGLUniformLocation>(), transpose, value.unsafeCast<Float32Array>())
    }

    override fun viewport(x: Int, y: Int, width: Int, height: Int) = gl.viewport(x, y, width, height)
    override fun clear(mask: Int) = gl.clear(mask)
    override fun clearColor(r: Float, g: Float, b: Float, a: Float) = gl.clearColor(r, g, b, a)

    override fun blendFunc(sFactor: Int, dFactor: Int) = gl.blendFunc(sFactor, dFactor)
    override fun cullFace(mode: Int) = gl.cullFace(mode)

    override fun createTextures(n: Int): Array<Texture> = Array(n) { gl.createTexture() ?: throw Exception() }
    override fun deleteTexture(texture: Texture) = gl.deleteTexture(texture.unsafeCast<WebGLTexture>())
    override fun texImage2D(target: Int, level: Int, internalFormat: Int, border: Int, resource: TextureResource)
            = gl.texImage2D(target, level, internalFormat, GL_RGBA, GL_UNSIGNED_BYTE, resource.image)
    override fun texImage2D(target: Int, level: Int, internalFormat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, buffer: Buffer, offset: Int) {
        buffer.withGlBuffer(offset) { glBuffer ->
            gl.texImage2D(target, level, internalFormat, width, height, border, format, type, glBuffer)
        }
    }


    override fun activeTexture(texture: Int) = gl.activeTexture(texture)
    override fun bindTexture(target: Int, texture: Texture?) = gl.bindTexture(target, texture.unsafeCast<WebGLTexture>())
    override fun generateMipmap(target: Int) = gl.generateMipmap(target)
    override fun texParameteri(target: Int, pname: Int, value: Int) = gl.texParameteri(target, pname, value)

    override fun createVertexArray(): VertexArrayObject?
            = (gl as WebGL2RenderingContext).createVertexArray()
    override fun bindVertexArray(vertexArrayObject: VertexArrayObject?)
            = (gl as WebGL2RenderingContext).bindVertexArray(vertexArrayObject.unsafeCast<WebGLVertexArrayObject>())
    override fun deleteVertexArray(vertexArrayObject: VertexArrayObject)
            = (gl as WebGL2RenderingContext).deleteVertexArray(vertexArrayObject.unsafeCast<WebGLVertexArrayObject>())

    override fun drawArrays(mode: Int, first: Int, count: Int) = gl.drawArrays(mode, first, count)

    override fun getError(): Int = gl.getError()
    override fun finish() = gl.finish()

    override fun bindFramebuffer(target: Int, framebuffer: Framebuffer?) = gl.bindFramebuffer(target, framebuffer.unsafeCast<WebGLFramebuffer>())
    override fun createFramebuffer(): Framebuffer? = gl.createFramebuffer()
    override fun deleteFramebuffer(framebuffer: Framebuffer) = gl.deleteFramebuffer(framebuffer.unsafeCast<WebGLFramebuffer>())
    override fun checkFramebufferStatus(target: Int): Int = gl.checkFramebufferStatus(target)
    override fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Texture, level: Int) = gl.framebufferTexture2D(target, attachment, textarget, texture.unsafeCast<WebGLTexture>(), level)
    override fun isFramebuffer(framebuffer: Framebuffer): Boolean = gl.isFramebuffer(framebuffer.unsafeCast<WebGLFramebuffer>())

    override fun bindRenderbuffer(target: Int, renderbuffer: Renderbuffer?) = gl.bindRenderbuffer(target, renderbuffer.unsafeCast<WebGLRenderbuffer>())
    override fun createRenderbuffer(): Renderbuffer? = gl.createRenderbuffer()
    override fun deleteRenderbuffer(renderbuffer: Renderbuffer) = gl.deleteRenderbuffer(renderbuffer.unsafeCast<WebGLRenderbuffer>())
    override fun framebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: Renderbuffer) = gl.framebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer.unsafeCast<WebGLRenderbuffer>())
    override fun isRenderbuffer(renderbuffer: Renderbuffer): Boolean = gl.isRenderbuffer(renderbuffer.unsafeCast<WebGLRenderbuffer>())
    override fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int) = gl.renderbufferStorage(target, internalformat, width, height)

    override fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, buffer: Buffer, offset: Int) {
        buffer.withGlBuffer(offset) { glBuffer ->
            gl.readPixels(x, y, width, height, format, type, glBuffer)
        }
    }
}