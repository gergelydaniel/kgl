package com.danielgergely.kgl

import android.opengl.GLES20
import android.opengl.GLES30

typealias GL = GLES20

object KglAndroid : Kgl {

    override fun createShader(type: Int): Shader? {
        val shader = GL.glCreateShader(type)
        return if (shader == 0) {
            null
        } else {
            shader
        }
    }

    override fun shaderSource(shaderId: Int, source: String) = GL.glShaderSource(shaderId, source)
    override fun compileShader(shaderId: Int) = GL.glCompileShader(shaderId)
    override fun deleteShader(shaderId: Int) = GL.glDeleteShader(shaderId)

    override fun getShaderParameter(shader: Shader, pname: Int): Int {
        val arr = IntArray(1)
        GL.glGetShaderiv(shader, pname, arr, 0)
        return arr[0]
    }

    override fun getProgramInfoLog(program: Int) = GL.glGetProgramInfoLog(program)
    override fun getShaderInfoLog(shaderId: Int) = GL.glGetShaderInfoLog(shaderId)

    override fun createProgram(): Program? = GL.glCreateProgram()

    override fun attachShader(programId: Program, shaderId: Int) = GL.glAttachShader(programId, shaderId)
    override fun linkProgram(programId: Program) = GL.glLinkProgram(programId)

    override fun useProgram(programId: Program) = GL.glUseProgram(programId)

    override fun detachShader(programId: Program, shaderId: Shader) = GL.glDetachShader(programId, shaderId)
    override fun deleteProgram(programId: Program) = GL.glDeleteProgram(programId)

    override fun getProgramParameter(program: Program, pname: Int): Int {
        val arr = IntArray(1)
        GL.glGetProgramiv(program, pname, arr, 0)
        return arr[0]
    }

    override fun getUniformLocation(programId: Program, name: String): UniformLocation? {
        val loc = GL.glGetUniformLocation(programId, name)
        return if (loc < 0) null else loc
    }

    override fun getAttribLocation(programId: Program, name: String) = GL.glGetAttribLocation(programId, name)
    override fun bindAttribLocation(programId: Program, index: Int, name: String) =
        GL.glBindAttribLocation(programId, index, name)

    override fun createBuffer(): GlBuffer {
        val buffers = IntArray(1)
        GL.glGenBuffers(1, buffers, 0)
        return buffers[0]
    }

    override fun createBuffers(count: Int): Array<GlBuffer> {
        val buffers = IntArray(count)
        GL.glGenBuffers(count, buffers, 0)
        return buffers.toTypedArray()
    }

    override fun bindBuffer(target: Int, bufferId: GlBuffer?) = GL.glBindBuffer(target, bufferId ?: 0)
    override fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int) {
        sourceData.withJavaBuffer { javaBuffer ->
            GL.glBufferData(target, size, javaBuffer, usage)
        }
    }

    override fun deleteBuffer(buffer: GlBuffer) = GL.glDeleteBuffers(1, intArrayOf(buffer), 0)

    override fun vertexAttribPointer(
        location: Int,
        size: Int,
        type: Int,
        normalized: Boolean,
        stride: Int,
        offset: Int
    ) = GL.glVertexAttribPointer(location, size, type, normalized, stride, offset)

    override fun enableVertexAttribArray(location: Int) = GL.glEnableVertexAttribArray(location)
    override fun disableVertexAttribArray(location: Int) = GL.glDisableVertexAttribArray(location)

    override fun enable(cap: Int) = GL.glEnable(cap)
    override fun disable(cap: Int) = GL.glDisable(cap)

    override fun uniform1f(location: UniformLocation, f: Float) = GL.glUniform1f(location, f)
    override fun uniform1i(location: UniformLocation, i: Int) = GL.glUniform1i(location, i)

    override fun uniform2f(location: UniformLocation, x: Float, y: Float) = GL.glUniform2f(location, x, y)
    override fun uniform2i(location: UniformLocation, x: Int, y: Int) = GL.glUniform2i(location, x, y)

    override fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float) = GL.glUniform3f(location, x, y, z)
    override fun uniform3fv(location: UniformLocation, value: FloatArray) = GL.glUniform3fv(location, 1, value, 0)
    override fun uniform3i(location: UniformLocation, x: Int, y: Int, z: Int) = GL.glUniform3i(location, x, y, z)

    override fun uniform4f(location: UniformLocation, x: Float, y: Float, z: Float, w: Float) =
        GL.glUniform4f(location, x, y, z, w)

    override fun uniform4i(location: UniformLocation, x: Int, y: Int, z: Int, w: Int) =
        GL.glUniform4i(location, x, y, z, w)

    override fun uniformMatrix3fv(location: Int, transpose: Boolean, value: FloatArray) =
        GL.glUniformMatrix3fv(location, 1, transpose, value, 0)

    override fun uniformMatrix4fv(location: Int, transpose: Boolean, value: FloatArray) =
        GL.glUniformMatrix4fv(location, 1, transpose, value, 0)

    override fun blendFunc(sFactor: Int, dFactor: Int) = GL.glBlendFunc(sFactor, dFactor)

    override fun cullFace(mode: Int) = GL.glCullFace(mode)

    override fun viewport(x: Int, y: Int, width: Int, height: Int) = GL.glViewport(x, y, width, height)
    override fun clear(mask: Int) = GL.glClear(mask)

    override fun clearColor(r: Float, g: Float, b: Float, a: Float) = GL.glClearColor(r, g, b, a)

    override fun createTexture(): Texture {
        val ints = IntArray(1)
        GL.glGenTextures(1, ints, 0)
        return ints[0]
    }

    override fun createTextures(n: Int): Array<Texture> {
        val ints = IntArray(n)
        GL.glGenTextures(n, ints, 0)
        return ints.toTypedArray()
    }

    override fun deleteTexture(texture: Texture) = GL.glDeleteTextures(1, intArrayOf(texture), 0)

    override fun texImage2D(target: Int, level: Int, internalFormat: Int, border: Int, resource: TextureResource) {
        texImage2D(
            target = target,
            level = level,
            internalFormat = internalFormat,
            width = resource.width,
            height = resource.height,
            border = 0,
            format = resource.format,
            type = resource.type,
            buffer = resource.data
        )
    }

    override fun texImage2D(
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
        buffer.withJavaBuffer { javaBuffer ->
            GL.glTexImage2D(target, level, internalFormat, width, height, border, format, type, javaBuffer)
        }
    }

    override fun activeTexture(texture: Int) = GL.glActiveTexture(texture)
    override fun bindTexture(target: Int, texture: Texture?) = GL.glBindTexture(target, texture ?: 0)
    override fun generateMipmap(target: Int) = GL.glGenerateMipmap(target)
    override fun texParameteri(target: Int, pname: Int, value: Int) = GL.glTexParameteri(target, pname, value)

    override fun createVertexArray(): VertexArrayObject {
        val ints = IntArray(1)
        GLES30.glGenVertexArrays(1, ints, 0)
        return ints[0]
    }

    override fun bindVertexArray(vertexArrayObject: VertexArrayObject?) =
        GLES30.glBindVertexArray(vertexArrayObject ?: 0)

    override fun deleteVertexArray(vertexArrayObject: VertexArrayObject) =
        GLES30.glDeleteVertexArrays(1, intArrayOf(vertexArrayObject), 0)

    override fun drawArrays(mode: Int, first: Int, count: Int) = GL.glDrawArrays(mode, first, count)

    override fun getError(): Int = GL.glGetError()
    override fun finish() = GL.glFinish()

    override fun bindFramebuffer(target: Int, framebuffer: Framebuffer?) =
        GL.glBindFramebuffer(target, framebuffer ?: 0)

    override fun createFramebuffer(): Framebuffer {
        val ints = IntArray(1)
        GL.glGenFramebuffers(1, ints, 0)
        return ints[0]
    }

    override fun deleteFramebuffer(framebuffer: Framebuffer) = GL.glDeleteFramebuffers(1, intArrayOf(framebuffer), 0)
    override fun checkFramebufferStatus(target: Int): Int = GL.glCheckFramebufferStatus(target)
    override fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Texture, level: Int) =
        GL.glFramebufferTexture2D(target, attachment, textarget, texture, level)

    override fun isFramebuffer(framebuffer: Framebuffer): Boolean = GL.glIsFramebuffer(framebuffer)

    override fun bindRenderbuffer(target: Int, renderbuffer: Renderbuffer?) =
        GL.glBindRenderbuffer(target, renderbuffer ?: 0)

    override fun createRenderbuffer(): Renderbuffer {
        val ints = IntArray(1)
        GL.glGenRenderbuffers(1, ints, 0)
        return ints[0]
    }

    override fun deleteRenderbuffer(renderbuffer: Renderbuffer) =
        GL.glDeleteRenderbuffers(1, intArrayOf(renderbuffer), 0)

    override fun framebufferRenderbuffer(
        target: Int,
        attachment: Int,
        renderbuffertarget: Int,
        renderbuffer: Renderbuffer
    ) = GL.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer)

    override fun isRenderbuffer(renderbuffer: Renderbuffer): Boolean = GL.glIsRenderbuffer(renderbuffer)
    override fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int) =
        GL.glRenderbufferStorage(target, internalformat, width, height)

    override fun readPixels(
        x: Int,
        y: Int,
        width: Int,
        height: Int,
        format: Int,
        type: Int,
        buffer: Buffer
    ) {
        buffer.withJavaBuffer { javaBuffer ->
            GL.glReadPixels(x, y, width, height, format, type, javaBuffer)
        }
    }
}
