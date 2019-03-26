package com.danielgergely.kgl

expect class Buffer {
    fun put(f: Float)
    fun put(floatArray: FloatArray)
    fun put(floatArray: FloatArray, length: Int)

    fun position(pos: Int)
}

expect fun allocate(sizeInBytes: Int): Buffer