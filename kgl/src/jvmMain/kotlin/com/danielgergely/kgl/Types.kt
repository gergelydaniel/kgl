package com.danielgergely.kgl

import java.io.InputStream

public actual typealias Shader = Int

public actual typealias Program = Int

public actual typealias UniformLocation = Int

public actual typealias GlBuffer = Int

public actual typealias Texture = Int

public actual class TextureResource(@JvmField public val encodedPng: InputStream)

public actual fun TextureResource.dispose(): Unit = encodedPng.close()

public actual typealias VertexArrayObject = Int

public actual typealias Framebuffer = Int

public actual typealias Renderbuffer = Int
