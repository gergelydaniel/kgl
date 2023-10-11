package com.danielgergely.kgl

import java.nio.Buffer

public actual class TextureResource(
    public val width: Int,
    public val height: Int,
    public val format: Int,
    public val type: Int,
    public val data: Buffer,
) {
    public actual fun dispose() {}
}