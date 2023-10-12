package com.danielgergely.kgl

public actual typealias Shader = Int

public actual typealias Program = Int

public actual typealias UniformLocation = Int

public actual typealias GlBuffer = Int

public actual typealias Texture = Int

public actual typealias VertexArrayObject = Int

public actual typealias Framebuffer = Int

public actual typealias Renderbuffer = Int

public actual interface TextureAsset {

    /** calls isRecycled on bitmap **/
    public actual fun isValid() : Boolean

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

public actual class TextureResource(
    public val width: Int,
    public val height: Int,
    public val format: Int,
    public val type: Int,
    public val data: Buffer,
) : TextureAsset {

    override fun isValid(): Boolean {
        return true
    }

    public override fun dispose() {}

    public override fun texImage2D(kgl : Kgl, target: Int, level: Int, internalFormat: Int, border: Int) {
        kgl.texImage2D(
            target = target,
            level = level,
            internalFormat = internalFormat,
            width = width,
            height = height,
            border = border,
            format = format,
            type = type,
            buffer = data
        )
    }

    override fun texSubImage2D(
        kgl : Kgl,
        target: Int,
        level: Int,
        xOffset: Int,
        yOffset: Int,
        width: Int,
        height: Int,
        format: Int,
        type: Int
    ) {
        kgl.texSubImage2D(
            target,
            level,
            xOffset,
            yOffset,
            width,
            height,
            format,
            type,
            data
        )
    }

}