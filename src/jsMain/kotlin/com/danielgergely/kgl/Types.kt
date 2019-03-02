package com.danielgergely.kgl

import org.w3c.dom.Image

actual typealias Shader = Any

actual typealias Program = Any

actual typealias UniformLocation = Any

actual val nullUniformLocation : UniformLocation = Any()

actual typealias TextureResource = Image
actual fun TextureResource.dispose() {
    parentNode?.removeChild(this)
}

actual typealias GlBuffer = Any
actual val nullGlBuffer : GlBuffer = Any()

actual typealias Texture = Any
actual val nullTexture : Texture = Any()