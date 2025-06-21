package com.danielgergely.kgl

import kotlinx.cinterop.CValuesRef
import kotlinx.cinterop.refTo


public actual sealed class Buffer {

    public abstract fun remainingElements(): Int

    public abstract fun remainingBytes(): Int
}

public fun Buffer.ref(): CValuesRef<*> {
    return when (this) {
        is ByteBuffer -> buffer.refTo(position)
        is FloatBuffer -> buffer.refTo(position)
        is IntBuffer -> buffer.refTo(position)
        is ShortBuffer -> buffer.refTo(position)
        else -> throw IllegalStateException()
    }
}

public actual class FloatBuffer : Buffer {

    internal val buffer: FloatArray
    public actual var position: Int = 0

    public actual constructor(buffer: FloatArray) {
        this.buffer = buffer.copyOf()
    }

    public actual constructor(buffer: Array<Float>) {
        this.buffer = buffer.toFloatArray()
    }

    public actual constructor(size: Int) {
        this.buffer = FloatArray(size)
    }

    public actual fun put(f: Float) {
        buffer[position++] = f
    }

    public actual fun put(floatArray: FloatArray) {
        floatArray.copyInto(buffer, position)
        position += floatArray.size
    }

    public actual fun put(floatArray: FloatArray, offset: Int, length: Int) {
        floatArray.copyInto(buffer, position, offset, offset + length)
        position += length
    }

    public actual operator fun set(pos: Int, f: Float) {
        buffer[pos] = f
    }

    public actual fun get(): Float {
        return buffer[position++]
    }

    public actual fun get(floatArray: FloatArray) {
        get(floatArray, 0, floatArray.size)
    }

    public actual fun get(floatArray: FloatArray, offset: Int, length: Int) {
        buffer.copyInto(floatArray, offset, position, position + length)
        position += length
    }

    public actual operator fun get(pos: Int): Float {
        return buffer[pos]
    }

    override fun remainingElements(): Int {
        return buffer.size - position
    }

    override fun remainingBytes(): Int {
        return remainingElements() * 4
    }
}

public actual class ByteBuffer : Buffer {

    internal val buffer: ByteArray
    public actual var position: Int = 0

    public actual constructor(buffer: ByteArray) : super() {
        this.buffer = buffer.copyOf()
    }

    public actual constructor(buffer: Array<Byte>) {
        this.buffer = buffer.toByteArray()
    }

    public actual constructor(size: Int) {
        this.buffer = ByteArray(size)
    }


    public actual fun put(b: Byte) {
        buffer[position++] = b
    }

    public actual fun put(byteArray: ByteArray) {
        byteArray.copyInto(buffer, position)
        position += byteArray.size
    }

    public actual fun put(byteArray: ByteArray, offset: Int, length: Int) {
        byteArray.copyInto(buffer, position, offset, offset + length)
        position += length
    }

    public actual operator fun set(pos: Int, b: Byte) {
        buffer[pos] = b
    }

    public actual fun get(): Byte {
        return buffer[position++]
    }

    public actual fun get(byteArray: ByteArray) {
        get(byteArray, 0, byteArray.size)
    }

    public actual fun get(byteArray: ByteArray, offset: Int, length: Int) {
        buffer.copyInto(byteArray, offset, position, position + length)
        position += length
    }

    public actual operator fun get(pos: Int): Byte {
        return buffer[pos]
    }

    override fun remainingElements(): Int {
        return buffer.size - position
    }

    override fun remainingBytes(): Int {
        return remainingElements()
    }
}

public actual class IntBuffer : Buffer {

    internal val buffer: IntArray
    public actual var position: Int = 0

    public actual constructor(buffer: IntArray) : super() {
        this.buffer = buffer.copyOf()
    }

    public actual constructor(buffer: Array<Int>) {
        this.buffer = buffer.toIntArray()
    }

    public actual constructor(size: Int) {
        this.buffer = IntArray(size)
    }

    public actual fun put(i: Int) {
        buffer[position++] = i
    }

    public actual fun put(intArray: IntArray) {
        intArray.copyInto(buffer, position)
        position += intArray.size
    }

    public actual fun put(intArray: IntArray, offset: Int, length: Int) {
        intArray.copyInto(buffer, position, offset, offset + length)
        position += length
    }

    public actual operator fun set(pos: Int, i: Int) {
        buffer[pos] = i
    }

    public actual fun get(): Int {
        return buffer[position++]
    }

    public actual fun get(intArray: IntArray) {
        get(intArray, 0, intArray.size)
    }

    public actual fun get(intArray: IntArray, offset: Int, length: Int) {
        buffer.copyInto(intArray, offset, position, position + length)
        position += length
    }

    public actual operator fun get(pos: Int): Int {
        return buffer[pos]
    }

    override fun remainingElements(): Int {
        return buffer.size - position
    }

    override fun remainingBytes(): Int {
        return remainingElements() * 4
    }
}

public actual class ShortBuffer : Buffer {

    internal val buffer: ShortArray
    public actual var position: Int = 0

    public actual constructor(buffer: ShortArray) {
        this.buffer = buffer.copyOf()
    }

    public actual constructor(buffer: Array<Short>) {
        this.buffer = buffer.toShortArray()
    }

    public actual constructor(size: Int) {
        this.buffer = ShortArray(size)
    }


    public actual fun put(s: Short) {
        buffer[position++] = s
    }

    public actual fun put(shortArray: ShortArray) {
        shortArray.copyInto(buffer, position)
        position += shortArray.size
    }

    public actual fun put(shortArray: ShortArray, offset: Int, length: Int) {
        shortArray.copyInto(buffer, position, offset, offset + length)
        position += length
    }

    public actual operator fun set(pos: Int, s: Short) {
        buffer[pos] = s
    }

    public actual fun get(): Short {
        return buffer[position++]
    }

    public actual fun get(shortArray: ShortArray) {
        get(shortArray, 0, shortArray.size)
    }

    public actual fun get(shortArray: ShortArray, offset: Int, length: Int) {
        buffer.copyInto(shortArray, offset, position, position + length)
        position += length
    }

    public actual operator fun get(pos: Int): Short {
        return buffer[pos]
    }

    override fun remainingElements(): Int {
        return buffer.size - position
    }

    override fun remainingBytes(): Int {
        return remainingElements() * 2
    }
}
