package com.danielgergely.kgl

import android.graphics.Bitmap
import android.opengl.GLUtils

public class BitmapTextureAsset(
    public val bitmap: Bitmap,
    public val type: Int = -1,
) : TextureAsset {

    public inline val width: Int get() = bitmap.width
    public val height: Int get() = bitmap.height

    public override fun dispose() {}

    override fun texImage2D(kgl : Kgl, target: Int, level: Int, internalFormat: Int, border: Int) {
        if (internalFormat == -1) {
            GLUtils.texImage2D(
                target, level, bitmap, border
            )
        } else {
            if (type == -1) {
                GLUtils.texImage2D(
                    target, level, internalFormat, bitmap, border
                )
            } else {
                GLUtils.texImage2D(
                    target, level, internalFormat, bitmap, type, border
                )
            }
        }
    }

    override fun texSubImage2D(
        kgl : Kgl,
        target: Int,
        level: Int,
        xOffset: Int,
        yOffset: Int,
        width: Int,
        height: Int,
        format: Int,
        type: Int
    ) {
        if(format != -1 && type != -1){
            GLUtils.texSubImage2D(
                target, level, xOffset, yOffset, bitmap, format, type
            )
        } else {
            GLUtils.texSubImage2D(
                target, level, xOffset, yOffset, bitmap
            )
        }
    }

}