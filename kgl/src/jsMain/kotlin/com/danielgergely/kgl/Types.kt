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

public actual interface TextureAsset {

    public actual fun dispose()

    public fun Kgl.texImage2D(target: Int, level: Int, internalFormat: Int, border: Int)

    public fun Kgl.texSubImage2D(
        target: Int,
        level: Int,
        xOffset: Int,
        yOffset: Int,
        width: Int,
        height: Int,
        format: Int,
        type: Int
    )

}

public actual open class TextureResource(public val image: TexImageSource) : TextureAsset {

    public override fun dispose() {}

    override fun Kgl.texImage2D(target: Int, level: Int, internalFormat: Int, border: Int) {
        texImage2D(target, level, internalFormat, border, this@TextureResource)
    }

    override fun Kgl.texSubImage2D(
        target: Int,
        level: Int,
        xOffset: Int,
        yOffset: Int,
        width: Int,
        height: Int,
        format: Int,
        type: Int
    ) {
        (this@texSubImage2D as KglJs).texSubImage2D(
            target, level, xOffset, yOffset, format, type, resource = this@TextureResource
        )
    }

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
