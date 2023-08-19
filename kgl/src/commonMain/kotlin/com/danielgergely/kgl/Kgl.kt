package com.danielgergely.kgl

public interface Kgl {
    public fun createShader(type: Int): Shader?
    public fun shaderSource(shaderId: Shader, source: String)
    public fun compileShader(shaderId: Shader)
    public fun deleteShader(shaderId: Shader)

    public fun getShaderParameter(shader: Shader, pname: Int): Int

    public fun getProgramInfoLog(program: Program): String?
    public fun getShaderInfoLog(shaderId: Shader): String?

    public fun createProgram(): Program?
    public fun attachShader(programId: Program, shaderId: Shader)
    public fun linkProgram(programId: Program)
    public fun useProgram(programId: Program)
    public fun detachShader(programId: Program, shaderId: Shader)
    public fun deleteProgram(programId: Program)

    public fun getProgramParameter(program: Program, pname: Int): Int

    public fun getUniformLocation(programId: Program, name: String): UniformLocation?
    public fun getAttribLocation(programId: Program, name: String): Int
    public fun bindAttribLocation(programId: Program, index: Int, name: String)

    public fun enable(cap: Int)
    public fun disable(cap: Int)

    public fun enableVertexAttribArray(location: Int)
    public fun disableVertexAttribArray(location: Int)

    public fun createBuffer(): GlBuffer
    public fun createBuffers(count: Int): Array<GlBuffer>
    public fun bindBuffer(target: Int, bufferId: GlBuffer?)
    public fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int)
    public fun deleteBuffer(buffer: GlBuffer)

    public fun vertexAttribPointer(location: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int)

    public fun uniform1f(location: UniformLocation, f: Float)
    public fun uniform1fv(location: UniformLocation, value: FloatArray)
    public fun uniform1i(location: UniformLocation, i: Int)
    public fun uniform1iv(location: UniformLocation, value: IntArray)

    public fun uniform2f(location: UniformLocation, x: Float, y: Float)
    public fun uniform2fv(location: UniformLocation, value: FloatArray)
    public fun uniform2i(location: UniformLocation, x: Int, y: Int)
    public fun uniform2iv(location: UniformLocation, value: IntArray)

    public fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float)
    public fun uniform3fv(location: UniformLocation, value: FloatArray)
    public fun uniform3i(location: UniformLocation, x: Int, y: Int, z: Int)
    public fun uniform3iv(location: UniformLocation, value: IntArray)

    public fun uniform4f(location: UniformLocation, x: Float, y: Float, z: Float, w: Float)
    public fun uniform4fv(location: UniformLocation, value: FloatArray)
    public fun uniform4i(location: UniformLocation, x: Int, y: Int, z: Int, w: Int)
    public fun uniform4iv(location: UniformLocation, value: IntArray)

    public fun uniformMatrix3fv(location: UniformLocation, transpose: Boolean, value: FloatArray)
    public fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: FloatArray)

    public fun blendFunc(sFactor: Int, dFactor: Int)

    public fun cullFace(mode: Int)

    public fun viewport(x: Int, y: Int, width: Int, height: Int)
    public fun clearColor(r: Float, g: Float, b: Float, a: Float)
    public fun clear(mask: Int)

    public fun createTexture(): Texture
    public fun createTextures(n: Int): Array<Texture>
    public fun deleteTexture(texture: Texture)
    public fun texImage2D(target: Int, level: Int, internalFormat: Int, border: Int, resource: TextureResource)
    public fun texImage2D(
        target: Int,
        level: Int,
        internalFormat: Int,
        width: Int,
        height: Int,
        border: Int,
        format: Int,
        type: Int,
        buffer: Buffer
    )

    public fun activeTexture(texture: Int)
    public fun bindTexture(target: Int, texture: Texture?)
    public fun generateMipmap(target: Int)
    public fun texParameteri(target: Int, pname: Int, value: Int)

    public fun createVertexArray(): VertexArrayObject
    public fun bindVertexArray(vertexArrayObject: VertexArrayObject?)
    public fun deleteVertexArray(vertexArrayObject: VertexArrayObject)

    public fun drawArrays(mode: Int, first: Int, count: Int)

    public fun getError(): Int
    public fun finish()

    public fun bindFramebuffer(target: Int, framebuffer: Framebuffer?)
    public fun createFramebuffer(): Framebuffer
    public fun deleteFramebuffer(framebuffer: Framebuffer)
    public fun checkFramebufferStatus(target: Int): Int
    public fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Texture, level: Int)
    public fun isFramebuffer(framebuffer: Framebuffer): Boolean

    public fun bindRenderbuffer(target: Int, renderbuffer: Renderbuffer?)
    public fun createRenderbuffer(): Renderbuffer
    public fun deleteRenderbuffer(renderbuffer: Renderbuffer)
    public fun framebufferRenderbuffer(
        target: Int,
        attachment: Int,
        renderbuffertarget: Int,
        renderbuffer: Renderbuffer
    )

    public fun isRenderbuffer(renderbuffer: Renderbuffer): Boolean
    public fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int)

    public fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, buffer: Buffer)
}
