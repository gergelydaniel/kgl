package com.danielgergely.kgl

expect class Buffer {
    fun put(f: Float)
    fun put(floatArray: FloatArray)

    fun position(pos: Int)
}

expect fun allocate(size: Int): Buffer