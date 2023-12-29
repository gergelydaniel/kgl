package com.danielgergely.kgl

import org.khronos.webgl.*

public actual sealed class Buffer

public fun Buffer.getJsBufferWithOffset(): ArrayBufferView {
    return when(this) {
        is ByteBuffer -> byteBuffer.asDynamic().subarray(position)
        is FloatBuffer -> buffer.asDynamic().subarray(position)
        is IntBuffer -> buffer.asDynamic().subarray(position)
        is ShortBuffer -> buffer.asDynamic().subarray(position)
        else -> throw IllegalStateException()
    }
}

public actual class FloatBuffer(internal val buffer: Float32Array) : Buffer() {
    public actual constructor(buffer: Array<Float>) : this(Float32Array(buffer))
    public actual constructor(buffer: FloatArray) : this(Float32Array(buffer.unsafeCast<Float32Array>()))
    public actual constructor(size: Int) : this(Float32Array(size))

    public actual var position: Int = 0

    public actual fun put(f: Float) {
        buffer[position] = f
        position += 1
    }

    public actual fun put(floatArray: FloatArray) {
        put(floatArray, 0, floatArray.size)
    }

    public actual fun put(floatArray: FloatArray, offset: Int, length: Int) {
        buffer.set((floatArray.unsafeCast<Float32Array>()).subarray(offset, length), position)
        position += length
    }

    public actual operator fun set(pos: Int, f: Float) {
        buffer[pos] = f
    }

    public actual fun get(): Float = buffer[position]

    public actual fun get(floatArray: FloatArray) {
        get(floatArray, 0, floatArray.size)
    }

    public actual fun get(floatArray: FloatArray, offset: Int, length: Int) {
        val dest = floatArray.unsafeCast<Float32Array>()
        dest.subarray(offset, length).set(buffer, position)
    }

    public actual operator fun get(pos: Int): Float = buffer[pos]
}

public actual class ByteBuffer(internal val byteBuffer: Uint8Array) : Buffer() {
    public actual constructor(buffer: Array<Byte>) : this(Uint8Array(buffer))
    public actual constructor(buffer: ByteArray) : this(Uint8Array(buffer.unsafeCast<Uint8Array>()))
    public actual constructor(size: Int) : this(ByteArray(size))

    public actual var position: Int = 0

    public actual fun put(b: Byte) {
        byteBuffer[position] = b
        position += 1
    }

    public actual fun put(byteArray: ByteArray) {
        put(byteArray, 0, byteArray.size)
    }

    public actual fun put(byteArray: ByteArray, offset: Int, length: Int) {
        byteBuffer.set(byteArray.unsafeCast<Uint8Array>().subarray(offset, length), position)
        position += length
    }

    public actual operator fun set(pos: Int, b: Byte) {
        byteBuffer[pos] = b
    }

    public actual fun get(): Byte {
        return byteBuffer[position].toUByte().toByte()
    }

    public actual fun get(byteArray: ByteArray) {
        get(byteArray, 0, byteArray.size)
    }

    public actual fun get(byteArray: ByteArray, offset: Int, length: Int) {
        val dest = byteArray.unsafeCast<Uint8Array>()
        dest.subarray(offset, length).set(byteBuffer, position)
    }

    public actual operator fun get(pos: Int): Byte {
        return byteBuffer[pos].toUByte().toByte()
    }
}

public actual class IntBuffer(internal val buffer: Int32Array) : Buffer() {
    public actual constructor(buffer: Array<Int>) : this(Int32Array(buffer))
    public actual constructor(buffer: IntArray) : this(Int32Array(buffer.unsafeCast<Int32Array>()))
    public actual constructor(size: Int) : this(Int32Array(size))

    public actual var position: Int = 0

    public actual fun put(i: Int) {
        buffer[position] = i
        position += 1
    }

    public actual fun put(intArray: IntArray) {
        put(intArray, 0, intArray.size)
    }

    public actual fun put(intArray: IntArray, offset: Int, length: Int) {
        buffer.set((intArray.unsafeCast<Int32Array>()).subarray(offset, length), position)
        position += length
    }

    public actual operator fun set(pos: Int, i: Int) {
        buffer[pos] = i
    }

    public actual fun get(): Int = buffer[position]

    public actual fun get(intArray: IntArray) {
        get(intArray, 0, intArray.size)
    }

    public actual fun get(intArray: IntArray, offset: Int, length: Int) {
        val dest = intArray.unsafeCast<Int32Array>()
        dest.subarray(offset, length).set(buffer, position)
    }

    public actual operator fun get(pos: Int): Int = buffer[pos]
}

public actual class ShortBuffer(internal val buffer: Int16Array) : Buffer() {
    public actual constructor(buffer: Array<Short>) : this(Int16Array(buffer))
    public actual constructor(buffer: ShortArray) : this(Int16Array(buffer.unsafeCast<Int16Array>()))
    public actual constructor(size: Int) : this(Int16Array(size))

    public actual var position: Int = 0

    public actual fun put(s: Short) {
        buffer[position] = s
        position += 1
    }

    public actual fun put(shortArray: ShortArray) {
        put(shortArray, 0, shortArray.size)
    }

    public actual fun put(shortArray: ShortArray, offset: Int, length: Int) {
        buffer.set((shortArray.unsafeCast<Int16Array>()).subarray(offset, length), position)
        position += length
    }

    public actual operator fun set(pos: Int, s: Short) {
        buffer[pos] = s
    }

    public actual fun get(): Short = buffer[position]

    public actual fun get(shortArray: ShortArray) {
        get(shortArray, 0, shortArray.size)
    }

    public actual fun get(shortArray: ShortArray, offset: Int, length: Int) {
        val dest = shortArray.unsafeCast<Int16Array>()
        dest.subarray(offset, length).set(buffer, position)
    }

    public actual operator fun get(pos: Int): Short = buffer[pos]
}
