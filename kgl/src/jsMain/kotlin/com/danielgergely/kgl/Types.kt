package com.danielgergely.kgl

import org.khronos.webgl.*

/**
 * Must be [WebGLShader]
 */
actual typealias Shader = Any

/**
 * Must be [WebGLProgram]
 */
actual typealias Program = Any

/**
 * Must be [WebGLUniformLocation]
 */
actual typealias UniformLocation = Any

actual open class TextureResource(val image: TexImageSource) {
    open fun disposeInner() {}
}
actual fun TextureResource.dispose() = disposeInner()

/**
 * Must be [WebGLBuffer]
 */
actual typealias GlBuffer = Any

/**
 * Must be [WebGLTexture]
 */
actual typealias Texture = Any

/** Must be [WebGLFramebuffer] */
actual typealias Framebuffer = Any

/** Must be [WebGLRenderbuffer] */
actual typealias Renderbuffer = Any