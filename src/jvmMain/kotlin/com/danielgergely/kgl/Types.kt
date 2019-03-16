package com.danielgergely.kgl

import java.awt.image.BufferedImage

actual typealias Shader = Int

actual typealias Program = Int

actual typealias UniformLocation = Int

actual typealias GlBuffer = Int

actual typealias Texture = Int

actual typealias TextureResource = BufferedImage
actual fun TextureResource.dispose() { }