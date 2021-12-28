package com.danielgergely.kgl

public expect abstract class Buffer

public expect class FloatBuffer : Buffer {
    public constructor(buffer: Array<Float>)
    public constructor(buffer: FloatArray)
    public constructor(size: Int)

    public var position: Int

    public fun put(f: Float)
    public fun put(floatArray: FloatArray)
    public fun put(floatArray: FloatArray, offset: Int, length: Int)
    public operator fun set(pos: Int, f: Float)

    public fun get(): Float
    public fun get(floatArray: FloatArray)
    public fun get(floatArray: FloatArray, offset: Int, length: Int)
    public operator fun get(pos: Int): Float
}

public expect class ByteBuffer : Buffer {
    public constructor(buffer: Array<Byte>)
    public constructor(buffer: ByteArray)
    public constructor(size: Int)

    public var position: Int

    public fun put(b: Byte)
    public fun put(byteArray: ByteArray)
    public fun put(byteArray: ByteArray, offset: Int, length: Int)
    public operator fun set(pos: Int, b: Byte)

    public fun get(): Byte
    public fun get(byteArray: ByteArray)
    public fun get(byteArray: ByteArray, offset: Int, length: Int)
    public operator fun get(pos: Int): Byte
}
