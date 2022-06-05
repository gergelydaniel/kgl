package com.danielgergely.kgl

import org.khronos.webgl.*

public class KglJs(private val gl: WebGLRenderingContext) : Kgl {

    public override fun createShader(type: Int): Shader? = gl.createShader(type)

    public override fun shaderSource(shaderId: Shader, source: String): Unit =
        gl.shaderSource(shaderId.unsafeCast<WebGLShader>(), source)

    public override fun compileShader(shaderId: Shader): Unit = gl.compileShader(shaderId.unsafeCast<WebGLShader>())
    public override fun deleteShader(shaderId: Shader): Unit = gl.deleteShader(shaderId.unsafeCast<WebGLShader>())

    public override fun getShaderParameter(shader: Shader, pname: Int): Int {
        val value = gl.getShaderParameter(shader.unsafeCast<WebGLShader>(), pname)!!

        if (value is Boolean) {
            return if (value) GL_TRUE else GL_FALSE
        }
        return value as Int
    }

    public override fun getProgramInfoLog(program: Program): String? =
        gl.getProgramInfoLog(program.unsafeCast<WebGLProgram>())

    public override fun getShaderInfoLog(shaderId: Shader): String? =
        gl.getShaderInfoLog(shaderId.unsafeCast<WebGLShader>())

    public override fun getProgramParameter(program: Program, pname: Int): Int {
        val value = gl.getProgramParameter(program.unsafeCast<WebGLProgram>(), pname)!!

        if (value is Boolean) {
            return if (value) GL_TRUE else GL_FALSE
        }
        return value as Int
    }

    public override fun createProgram(): Program? = gl.createProgram()
    public override fun attachShader(programId: Program, shaderId: Shader): Unit =
        gl.attachShader(programId.unsafeCast<WebGLProgram>(), shaderId.unsafeCast<WebGLShader>())

    public override fun linkProgram(programId: Program): Unit = gl.linkProgram(programId.unsafeCast<WebGLProgram>())
    public override fun useProgram(programId: Program): Unit = gl.useProgram(programId.unsafeCast<WebGLProgram>())

    public override fun detachShader(programId: Program, shaderId: Shader): Unit = gl.detachShader(programId.unsafeCast<WebGLProgram>(), shaderId.unsafeCast<WebGLShader>())
    public override fun deleteProgram(programId: Program): Unit = gl.deleteProgram(programId.unsafeCast<WebGLProgram>())

    public override fun getUniformLocation(programId: Program, name: String): UniformLocation? =
        gl.getUniformLocation(programId.unsafeCast<WebGLProgram>(), name)

    public override fun getAttribLocation(programId: Program, name: String): Int =
        gl.getAttribLocation(programId.unsafeCast<WebGLProgram>(), name)

    public override fun bindAttribLocation(programId: Program, index: Int, name: String): Unit =
        gl.bindAttribLocation(programId.unsafeCast<WebGLProgram>(), index, name)

    public override fun enableVertexAttribArray(location: Int): Unit = gl.enableVertexAttribArray(location)
    public override fun disableVertexAttribArray(location: Int): Unit = gl.disableVertexAttribArray(location)

    public override fun enable(cap: Int): Unit = gl.enable(cap)
    public override fun disable(cap: Int): Unit = gl.disable(cap)

    public override fun createBuffer(): GlBuffer = gl.createBuffer() ?: throw Exception()
    public override fun createBuffers(count: Int): Array<GlBuffer> =
        Array(count) { gl.createBuffer() ?: throw Exception() }

    public override fun bindBuffer(target: Int, bufferId: GlBuffer?): Unit =
        gl.bindBuffer(target, bufferId.unsafeCast<WebGLBuffer>())

    public override fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int) {
        gl.bufferData(target, sourceData.getJsBufferWithOffset(), usage)
    }

    public override fun deleteBuffer(buffer: GlBuffer): Unit = gl.deleteBuffer(buffer.unsafeCast<WebGLBuffer>())

    public override fun vertexAttribPointer(
        location: Int,
        size: Int,
        type: Int,
        normalized: Boolean,
        stride: Int,
        offset: Int
    ): Unit = gl.vertexAttribPointer(location, size, type, normalized, stride, offset)

    public override fun uniform1f(location: UniformLocation, f: Float): Unit =
        gl.uniform1f(location.unsafeCast<WebGLUniformLocation>(), f)

    public override fun uniform1i(location: UniformLocation, i: Int): Unit =
        gl.uniform1i(location.unsafeCast<WebGLUniformLocation>(), i)

    public override fun uniform2f(location: UniformLocation, x: Float, y: Float): Unit =
        gl.uniform2f(location.unsafeCast<WebGLUniformLocation>(), x, y)

    public override fun uniform2i(location: UniformLocation, x: Int, y: Int): Unit =
        gl.uniform2i(location.unsafeCast<WebGLUniformLocation>(), x, y)

    public override fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float): Unit =
        gl.uniform3f(location.unsafeCast<WebGLUniformLocation>(), x, y, z)

    public override fun uniform3fv(location: UniformLocation, value: FloatArray): Unit =
        gl.uniform3fv(location.unsafeCast<WebGLUniformLocation>(), value.unsafeCast<Float32Array>())

    public override fun uniform3i(location: UniformLocation, x: Int, y: Int, z: Int): Unit =
        gl.uniform3i(location.unsafeCast<WebGLUniformLocation>(), x, y, z)

    public override fun uniform4f(location: UniformLocation, x: Float, y: Float, z: Float, w: Float): Unit =
        gl.uniform4f(location.unsafeCast<WebGLUniformLocation>(), x, y, z, w)

    public override fun uniform4i(location: UniformLocation, x: Int, y: Int, z: Int, w: Int): Unit =
        gl.uniform4i(location.unsafeCast<WebGLUniformLocation>(), x, y, z, w)

    public override fun uniformMatrix3fv(location: UniformLocation, transpose: Boolean, value: dynamic) {
        gl.uniformMatrix3fv(location.unsafeCast<WebGLUniformLocation>(), transpose, value.unsafeCast<Float32Array>())
    }

    public override fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: dynamic) {
        gl.uniformMatrix4fv(location.unsafeCast<WebGLUniformLocation>(), transpose, value.unsafeCast<Float32Array>())
    }

    public override fun viewport(x: Int, y: Int, width: Int, height: Int): Unit = gl.viewport(x, y, width, height)
    public override fun clear(mask: Int): Unit = gl.clear(mask)
    public override fun clearColor(r: Float, g: Float, b: Float, a: Float): Unit = gl.clearColor(r, g, b, a)

    public override fun blendFunc(sFactor: Int, dFactor: Int): Unit = gl.blendFunc(sFactor, dFactor)
    public override fun cullFace(mode: Int): Unit = gl.cullFace(mode)

    public override fun createTexture(): Texture = gl.createTexture() ?: throw Exception()
    public override fun createTextures(n: Int): Array<Texture> = Array(n) { gl.createTexture() ?: throw Exception() }
    public override fun deleteTexture(texture: Texture): Unit = gl.deleteTexture(texture.unsafeCast<WebGLTexture>())
    public override fun texImage2D(
        target: Int,
        level: Int,
        internalFormat: Int,
        border: Int,
        resource: TextureResource
    ): Unit = gl.texImage2D(target, level, internalFormat, GL_RGBA, GL_UNSIGNED_BYTE, resource.image)

    public override fun texImage2D(
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
        gl.texImage2D(target, level, internalFormat, width, height, border, format, type, buffer.getJsBufferWithOffset())
    }


    public override fun activeTexture(texture: Int): Unit = gl.activeTexture(texture)
    public override fun bindTexture(target: Int, texture: Texture?): Unit =
        gl.bindTexture(target, texture.unsafeCast<WebGLTexture>())

    public override fun generateMipmap(target: Int): Unit = gl.generateMipmap(target)
    public override fun texParameteri(target: Int, pname: Int, value: Int): Unit =
        gl.texParameteri(target, pname, value)

    public override fun createVertexArray(): VertexArrayObject =
        (gl as WebGL2RenderingContext).createVertexArray() ?: throw Exception()

    public override fun bindVertexArray(vertexArrayObject: VertexArrayObject?): Unit =
        (gl as WebGL2RenderingContext).bindVertexArray(vertexArrayObject.unsafeCast<WebGLVertexArrayObject>())

    public override fun deleteVertexArray(vertexArrayObject: VertexArrayObject): Unit =
        (gl as WebGL2RenderingContext).deleteVertexArray(vertexArrayObject.unsafeCast<WebGLVertexArrayObject>())

    public override fun drawArrays(mode: Int, first: Int, count: Int): Unit = gl.drawArrays(mode, first, count)

    public override fun getError(): Int = gl.getError()
    public override fun finish(): Unit = gl.finish()

    public override fun bindFramebuffer(target: Int, framebuffer: Framebuffer?): Unit =
        gl.bindFramebuffer(target, framebuffer.unsafeCast<WebGLFramebuffer>())

    public override fun createFramebuffer(): Framebuffer = gl.createFramebuffer() ?: throw Exception()
    public override fun deleteFramebuffer(framebuffer: Framebuffer): Unit =
        gl.deleteFramebuffer(framebuffer.unsafeCast<WebGLFramebuffer>())

    public override fun checkFramebufferStatus(target: Int): Int = gl.checkFramebufferStatus(target)
    public override fun framebufferTexture2D(
        target: Int,
        attachment: Int,
        textarget: Int,
        texture: Texture,
        level: Int
    ): Unit = gl.framebufferTexture2D(target, attachment, textarget, texture.unsafeCast<WebGLTexture>(), level)

    public override fun isFramebuffer(framebuffer: Framebuffer): Boolean =
        gl.isFramebuffer(framebuffer.unsafeCast<WebGLFramebuffer>())

    public override fun bindRenderbuffer(target: Int, renderbuffer: Renderbuffer?): Unit =
        gl.bindRenderbuffer(target, renderbuffer.unsafeCast<WebGLRenderbuffer>())

    public override fun createRenderbuffer(): Renderbuffer = gl.createRenderbuffer() ?: throw Exception()
    public override fun deleteRenderbuffer(renderbuffer: Renderbuffer): Unit =
        gl.deleteRenderbuffer(renderbuffer.unsafeCast<WebGLRenderbuffer>())

    public override fun framebufferRenderbuffer(
        target: Int,
        attachment: Int,
        renderbuffertarget: Int,
        renderbuffer: Renderbuffer
    ): Unit =
        gl.framebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer.unsafeCast<WebGLRenderbuffer>())

    public override fun isRenderbuffer(renderbuffer: Renderbuffer): Boolean =
        gl.isRenderbuffer(renderbuffer.unsafeCast<WebGLRenderbuffer>())

    public override fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int): Unit =
        gl.renderbufferStorage(target, internalformat, width, height)

    public override fun readPixels(
        x: Int,
        y: Int,
        width: Int,
        height: Int,
        format: Int,
        type: Int,
        buffer: Buffer
    ) {
        gl.readPixels(x, y, width, height, format, type, buffer.getJsBufferWithOffset())
    }
}
