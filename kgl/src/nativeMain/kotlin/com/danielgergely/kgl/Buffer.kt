package com.danielgergely.kgl

import kotlinx.cinterop.CValuesRef
import kotlinx.cinterop.refTo
import platform.posix.free


public actual abstract class Buffer {
    public abstract fun ref(): CValuesRef<*>

    internal open fun dispose() {}
}

public class PointerBuffer(
    private val pointer: CValuesRef<*>,
    private val freeOnDispose: Boolean
) : Buffer() {

    override fun ref(): CValuesRef<*> {
        return pointer
    }

    override fun dispose() {
        if (freeOnDispose) {
            free(pointer)
        }
    }
}

public actual class FloatBuffer actual constructor(buffer: FloatArray) : Buffer() {
    public actual constructor(buffer: Array<Float>) : this(buffer.toFloatArray())
    public actual constructor(size: Int) : this(FloatArray(size))

    private val buffer: FloatArray = buffer.copyOf()

    public actual var position: Int = 0

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
        return buffer[position]
    }

    public actual fun get(floatArray: FloatArray) {
        get(floatArray, 0, floatArray.size)
    }

    public actual fun get(floatArray: FloatArray, offset: Int, length: Int) {
        buffer.copyInto(floatArray, offset, position, position + length)
    }

    public actual operator fun get(pos: Int): Float {
        return buffer[pos]
    }

    override fun ref(): CValuesRef<*> {
        return buffer.refTo(position)
    }
}

public actual class ByteBuffer actual constructor(buffer: ByteArray) : Buffer() {
    public actual constructor(buffer: Array<Byte>) : this(buffer.toByteArray())
    public actual constructor(size: Int) : this(ByteArray(size))

    private val buffer: ByteArray = buffer.copyOf()
    public actual var position: Int = 0

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
        return buffer[position]
    }

    public actual fun get(byteArray: ByteArray) {
        get(byteArray, 0, byteArray.size)
    }

    public actual fun get(byteArray: ByteArray, offset: Int, length: Int) {
        buffer.copyInto(byteArray, offset, position, position + length)
    }

    public actual operator fun get(pos: Int): Byte {
        return buffer[pos]
    }

    override fun ref(): CValuesRef<*> {
        return buffer.refTo(position) //TODO test
    }
}

public actual class IntBuffer actual constructor(buffer: IntArray) : Buffer() {
    public actual constructor(buffer: Array<Int>) : this(buffer.toIntArray())
    public actual constructor(size: Int) : this(IntArray(size))

    private val buffer: IntArray = buffer.copyOf()

    public actual var position: Int = 0

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
        return buffer[position]
    }

    public actual fun get(intArray: IntArray) {
        get(intArray, 0, intArray.size)
    }

    public actual fun get(intArray: IntArray, offset: Int, length: Int) {
        buffer.copyInto(intArray, offset, position, position + length)
    }

    public actual operator fun get(pos: Int): Int {
        return buffer[pos]
    }

    override fun ref(): CValuesRef<*> {
        return buffer.refTo(position)
    }
}
