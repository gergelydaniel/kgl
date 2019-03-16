package com.danielgergely.kgl

import org.khronos.webgl.TexImageSource

actual typealias Shader = Any

actual typealias Program = Any

actual typealias UniformLocation = Any

actual open class TextureResource(val image: TexImageSource) {
    open fun disposeInner() {}
}
actual fun TextureResource.dispose() = disposeInner()

actual typealias GlBuffer = Any

actual typealias Texture = Any