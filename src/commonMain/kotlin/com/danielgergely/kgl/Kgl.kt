package com.danielgergely.kgl

interface Kgl {
    fun createShader(type: Int): Shader?
    fun shaderSource(shaderId: Shader, source: String)
    fun compileShader(shaderId: Shader)
    fun deleteShader(shaderId: Shader)

    // check whether shader has compiled
    fun shaderOk(shaderId: Shader): Boolean

    fun getProgramInfoLog(program: Program) : String?
    fun getShaderInfoLog(shaderId: Shader) : String?

    fun createProgram(): Program?
    fun attachShader(programId: Program, shaderId: Shader)
    fun linkProgram(programId: Program)
    fun useProgram(programId: Program)

    fun getUniformLocation(programId: Program, name: String): UniformLocation?
    fun getAttribLocation(programId: Program, name: String): Int
    fun bindAttribLocation(programId: Program, index: Int, name: String)

    fun enable(cap : Int)

    fun enableVertexAttribArray(location: Int)

    fun createBuffers(count: Int): Array<GlBuffer>
    fun bindBuffer(target: Int, bufferId: GlBuffer)
    fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int)
    fun deleteBuffer(buffer: GlBuffer)

    fun vertexAttribPointer(location: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int)

    fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float)
    fun uniform1f(location: UniformLocation, f: Float)
    fun uniform1i(location: UniformLocation, i: Int)
    fun uniformMatrix3fv(location: UniformLocation, transpose: Boolean, value: FloatArray)
    fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: FloatArray)

    fun viewport(x: Int, y: Int, width: Int, height: Int)
    fun clearColor(r: Float, g: Float, b: Float, a: Float)
    fun clear(mask: Int)

    fun createTextures(n: Int) : Array<Texture>
    fun texImage2D(target: Int, level: Int, internalFormat: Int, border: Int, resource: TextureResource)
    fun activeTexture(texture: Int)
    fun bindTexture(target: Int, texture: Texture)
    fun generateMipmap(target: Int)
    fun texParameteri(target: Int, pname: Int, value: Int)

    fun drawArrays(mode: Int, first: Int, count: Int)
}