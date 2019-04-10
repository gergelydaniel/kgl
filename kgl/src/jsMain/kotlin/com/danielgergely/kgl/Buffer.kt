package com.danielgergely.kgl

import org.khronos.webgl.Float32Array

actual class Buffer(buffer: FloatArray) {
    val buffer: dynamic = buffer
    var pos: dynamic = 0

    actual fun put(f: Float) {
        buffer[pos] = f
        pos += 1
    }

    actual fun put(floatArray: FloatArray) = put(floatArray, -1)

    actual fun put(floatArray: FloatArray, length: Int) {
        val l = if (length == -1) floatArray.size else length

        val floatArray: dynamic = floatArray

        buffer.set(floatArray.subarray(0, l), pos)
        pos += l
    }

    actual fun position(pos: Int) {
        this.pos = pos / Float32Array.BYTES_PER_ELEMENT
    }

}

actual fun allocate(sizeInBytes: Int): Buffer = Buffer(FloatArray(sizeInBytes / Float32Array.BYTES_PER_ELEMENT))