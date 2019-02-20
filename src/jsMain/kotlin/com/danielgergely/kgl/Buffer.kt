package com.danielgergely.kgl

import org.khronos.webgl.Float32Array
import org.khronos.webgl.set

actual class Buffer(val buffer: Float32Array) {
    var pos: Int = 0

    actual fun put(f: Float) {
        buffer[pos / Float32Array.BYTES_PER_ELEMENT] = f
        pos += Float32Array.BYTES_PER_ELEMENT
    }

    actual fun put(floatArray: FloatArray) = put(floatArray, -1)

    private fun put(floatArray: FloatArray, length: Int) {
        val l = if (length == -1) floatArray.size else length

        for (i in 0 until l) {
            buffer[pos / Float32Array.BYTES_PER_ELEMENT] = floatArray[i]
            pos += Float32Array.BYTES_PER_ELEMENT
        }
    }

    actual fun position(pos: Int) {
        this.pos = pos
    }

}

actual fun allocate(size: Int): Buffer = Buffer(Float32Array(size / Float32Array.BYTES_PER_ELEMENT))