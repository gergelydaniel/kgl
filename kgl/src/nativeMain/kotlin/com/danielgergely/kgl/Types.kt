package com.danielgergely.kgl


public actual typealias Shader = Int

public actual typealias Program = Int

public actual typealias UniformLocation = Int

public actual typealias GlBuffer = Int

public actual typealias Texture = Int

public actual class TextureResource(
    public val width: Int,
    public val height: Int,
    public val format: Int,
    public val type: Int,
    public val data: Buffer,
)

public actual fun TextureResource.dispose() {}

public actual typealias VertexArrayObject = Int

public actual typealias Framebuffer = Int

public actual typealias Renderbuffer = Int
