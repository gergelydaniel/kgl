package com.danielgergely.kgl

import android.graphics.Bitmap

actual typealias Shader = Int

actual typealias Program = Int

actual typealias UniformLocation = Int
actual val nullUniformLocation : UniformLocation = -1

actual typealias GlBuffer = Int
actual val nullGlBuffer : GlBuffer = 0

actual typealias Texture = Int
actual val nullTexture : Texture = -1

actual typealias TextureResource = Bitmap