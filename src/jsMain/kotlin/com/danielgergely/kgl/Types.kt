package com.danielgergely.kgl

import org.khronos.webgl.TexImageSource

actual typealias Shader = Any

actual typealias Program = Any

actual typealias UniformLocation = Any

actual val nullUniformLocation : UniformLocation = Any()

actual class TextureResource(val image: TexImageSource)
actual fun TextureResource.dispose() {
    //TODO do something?
}

actual typealias GlBuffer = Any
actual val nullGlBuffer : GlBuffer = Any()

actual typealias Texture = Any
actual val nullTexture : Texture = Any()