package com.danielgergely.kgl

expect abstract class Buffer {
    fun position(pos: Int)
}

expect class FloatBuffer : Buffer {
    constructor(buffer: Array<Float>)
    constructor(buffer: FloatArray)
    constructor(size: Int)

    fun put(f: Float)
    fun put(floatArray: FloatArray)
    fun put(floatArray: FloatArray, length: Int)
    operator fun set(pos: Int, f: Float)
    
    fun get(): Float
    operator fun get(pos: Int): Float
}

@ExperimentalUnsignedTypes
expect class UByteBuffer : Buffer {
    constructor(buffer: Array<UByte>)
    constructor(buffer: UByteArray)
    constructor(size: Int)

    fun put(b: UByte)
    fun put(byteArray: UByteArray)
    fun put(byteArray: UByteArray, length: Int)
    operator fun set(pos: Int, b: UByte)
    
    fun get(): UByte
    operator fun get(pos: Int): UByte
}

fun allocate(sizeInBytes: Int): FloatBuffer = FloatBuffer(sizeInBytes / 4)