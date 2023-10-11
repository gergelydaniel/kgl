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

    public fun texImage2D(kgl : Kgl, target: Int, level: Int, internalFormat: Int, border: Int)

    public fun texSubImage2D(
        kgl : Kgl,
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

    override fun texImage2D(kgl: Kgl, target: Int, level: Int, internalFormat: Int, border: Int) {
        kgl.texImage2D(target, level, internalFormat, border, this@TextureResource)
    }

    override fun texSubImage2D(
        kgl: Kgl,
        target: Int,
        level: Int,
        xOffset: Int,
        yOffset: Int,
        width: Int,
        height: Int,
        format: Int,
        type: Int
    ) {
        (kgl as KglJs).texSubImage2D(
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
