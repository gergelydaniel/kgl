package com.danielgergely.kgl

import java.io.InputStream

actual typealias Shader = Int

actual typealias Program = Int

actual typealias UniformLocation = Int

actual typealias GlBuffer = Int

actual typealias Texture = Int

actual class TextureResource(@JvmField val encodedPng: InputStream)
actual fun TextureResource.dispose() = encodedPng.close()

actual typealias Framebuffer = Int

actual typealias Renderbuffer = Int

actual typealias PixelBuffer = Any