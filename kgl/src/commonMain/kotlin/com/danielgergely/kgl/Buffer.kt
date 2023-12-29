package com.danielgergely.kgl

public expect sealed class Buffer

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

public expect class IntBuffer : Buffer {
    public constructor(buffer: Array<Int>)
    public constructor(buffer: IntArray)
    public constructor(size: Int)

    public var position: Int

    public fun put(i: Int)
    public fun put(intArray: IntArray)
    public fun put(intArray: IntArray, offset: Int, length: Int)
    public operator fun set(pos: Int, i: Int)

    public fun get(): Int
    public fun get(intArray: IntArray)
    public fun get(intArray: IntArray, offset: Int, length: Int)
    public operator fun get(pos: Int): Int
}

public expect class ShortBuffer : Buffer {
    public constructor(buffer: Array<Short>)
    public constructor(buffer: ShortArray)
    public constructor(size: Int)

    public var position: Int

    public fun put(s: Short)
    public fun put(shortArray: ShortArray)
    public fun put(shortArray: ShortArray, offset: Int, length: Int)
    public operator fun set(pos: Int, s: Short)

    public fun get(): Short
    public fun get(shortArray: ShortArray)
    public fun get(shortArray: ShortArray, offset: Int, length: Int)
    public operator fun get(pos: Int): Short
}
