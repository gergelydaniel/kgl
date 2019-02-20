package com.danielgergely.kgl

import java.nio.ByteBuffer
import java.nio.ByteOrder

actual class Buffer(val buffer : ByteBuffer) {
    actual fun put(f: Float) {
        buffer.putFloat(f)
    }

    actual fun put(floatArray: FloatArray) = put(floatArray, -1)

    private fun put(floatArray: FloatArray, length: Int) {
        val l = if (length == -1) floatArray.size else length

        buffer.asFloatBuffer().put(floatArray, 0, l)
    }

    actual fun position(pos: Int) {
        buffer.position(pos)
    }
}

actual fun allocate(size : Int) : Buffer = Buffer(ByteBuffer.allocateDirect(size).order(ByteOrder.nativeOrder()))