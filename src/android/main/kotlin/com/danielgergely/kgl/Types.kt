package com.danielgergely.kgl

import android.graphics.Bitmap

actual typealias Shader = Int

actual typealias Program = Int

actual typealias UniformLocation = Int

actual typealias GlBuffer = Int

actual typealias Texture = Int

actual typealias TextureResource = Bitmap
actual fun TextureResource.dispose() = recycle()