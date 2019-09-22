package com.danielgergely.kgl

expect abstract class Buffer {
    abstract var position: Int
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

expect class ByteBuffer : Buffer {
    constructor(buffer: Array<Byte>)
    constructor(buffer: ByteArray)
    constructor(size: Int)

    fun put(b: Byte)
    fun put(byteArray: ByteArray)
    fun put(byteArray: ByteArray, length: Int)
    operator fun set(pos: Int, b: Byte)

    fun get(): Byte
    operator fun get(pos: Int): Byte
}

@Deprecated("Use FloatBuffer() or ByteBuffer() instead.",
        ReplaceWith("FloatBuffer(sizeInBytes / 4)", "com.danielgergely.kgl.FloatBuffer"))
fun allocate(sizeInBytes: Int): FloatBuffer = FloatBuffer(sizeInBytes / 4)