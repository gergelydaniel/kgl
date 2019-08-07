package com.danielgergely.kgl

import org.khronos.webgl.Float32Array

actual class Buffer(buffer: FloatArray) {
    val buffer: dynamic = buffer
    var pos: dynamic = 0

    actual fun put(f: Float) {
        buffer[pos] = f
        pos += 1
    }

    actual fun put(floatArray: FloatArray) = put(floatArray, floatArray.size)

    actual fun put(floatArray: dynamic, length: Int) {
        buffer.set(floatArray.subarray(0, length), pos)
        pos += length
    }

    actual fun position(pos: Int) {
        this.pos = pos / Float32Array.BYTES_PER_ELEMENT
    }

}

actual fun allocate(sizeInBytes: Int): Buffer = Buffer(FloatArray(sizeInBytes / Float32Array.BYTES_PER_ELEMENT))