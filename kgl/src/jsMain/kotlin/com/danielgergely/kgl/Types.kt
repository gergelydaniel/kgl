package com.danielgergely.kgl

import org.khronos.webgl.*

/**
 * Must be [WebGLShader]
 */
public actual typealias Shader = Any

/**
 * Must be [WebGLProgram]
 */
public actual typealias Program = Any

/**
 * Must be [WebGLUniformLocation]
 */
public actual typealias UniformLocation = Any

public actual open class TextureResource(public val image: TexImageSource) {
    public actual open fun dispose() {}
}

/**
 * Must be [WebGLBuffer]
 */
public actual typealias GlBuffer = Any

/**
 * Must be [WebGLTexture]
 */
public actual typealias Texture = Any

/** Must be [WebGLVertexArrayObject] */
public actual typealias VertexArrayObject = Any

/** Must be [WebGLFramebuffer] */
public actual typealias Framebuffer = Any

/** Must be [WebGLRenderbuffer] */
public actual typealias Renderbuffer = Any
