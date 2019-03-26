package com.danielgergely.kgl

import java.nio.ByteBuffer
import java.nio.ByteOrder


actual class Buffer(@JvmField val buffer : ByteBuffer) {
    actual fun put(f: Float) {
        buffer.putFloat(f)
    }

    actual fun put(floatArray: FloatArray) = put(floatArray, -1)

    actual fun put(floatArray: FloatArray, length: Int) {
        val l = if (length == -1) floatArray.size else length

        buffer.asFloatBuffer().put(floatArray, 0, l)
    }

    actual fun position(pos: Int) {
        buffer.position(pos)
    }
}

actual fun allocate(sizeInBytes : Int) : Buffer = Buffer(ByteBuffer.allocateDirect(sizeInBytes).order(ByteOrder.nativeOrder()))