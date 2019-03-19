package com.danielgergely.kgl

import java.nio.ByteBuffer

actual typealias Shader = Int

actual typealias Program = Int

actual typealias UniformLocation = Int

actual typealias GlBuffer = Int

actual typealias Texture = Int

actual class TextureResource(@JvmField val buffer: ByteBuffer)
actual fun TextureResource.dispose() { }