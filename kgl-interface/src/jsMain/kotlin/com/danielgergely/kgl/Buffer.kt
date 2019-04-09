package com.danielgergely.kgl

import org.khronos.webgl.Float32Array

actual class Buffer(val buffer: FloatArray) {
    var pos: Int = 0

    actual fun put(f: Float) {
        buffer[pos / Float32Array.BYTES_PER_ELEMENT] = f
        pos += Float32Array.BYTES_PER_ELEMENT
    }

    actual fun put(floatArray: FloatArray) = put(floatArray, -1)

    actual fun put(floatArray: FloatArray, length: Int) {
        val l = if (length == -1) floatArray.size else length

        val buffer: dynamic = buffer
        val floatArray: dynamic = floatArray

        buffer.set(floatArray.subarray(0, l), pos)
        pos += Float32Array.BYTES_PER_ELEMENT * l
    }

    actual fun position(pos: Int) {
        this.pos = pos
    }

}

actual fun allocate(sizeInBytes: Int): Buffer = Buffer(FloatArray(sizeInBytes / Float32Array.BYTES_PER_ELEMENT))