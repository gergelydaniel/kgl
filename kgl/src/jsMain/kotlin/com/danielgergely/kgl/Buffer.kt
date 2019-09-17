package com.danielgergely.kgl

import org.khronos.webgl.*

actual abstract class Buffer(internal val buffer: ArrayBufferView) {
    protected var pos: Int = 0

    actual fun position(pos: Int) {
        this.pos = pos
    }
}

actual class FloatBuffer constructor(buffer: Float32Array) : Buffer(buffer) {
    actual constructor(buffer: Array<Float>) : this(Float32Array(buffer))
    actual constructor(buffer: FloatArray) : this(Float32Array(buffer.toTypedArray()))
    actual constructor(size: Int) : this(FloatArray(size))

    private val floatBuffer: Float32Array = buffer

    actual fun put(f: Float) {
        floatBuffer[pos] = f
        pos += 1
    }

    actual fun put(floatArray: FloatArray) = put(floatArray, floatArray.size)

    actual fun put(floatArray: FloatArray, length: Int) {
        (0 until length).forEach { i -> floatBuffer[pos++] = floatArray[i] }
    }

    actual operator fun set(pos: Int, f: Float) {
        floatBuffer[pos] = f
    }

    actual fun get(): Float = floatBuffer[pos]

    actual operator fun get(pos: Int): Float = floatBuffer[pos]
}

@ExperimentalUnsignedTypes
actual class UByteBuffer constructor(buffer: Uint8Array) : Buffer(buffer) {
    // TODO: yuck!
    actual constructor(buffer: Array<UByte>) : this(Uint8Array(buffer.toUByteArray().toByteArray().toTypedArray()))
    actual constructor(buffer: UByteArray) : this(Uint8Array(buffer.toUByteArray().toByteArray().toTypedArray()))
    actual constructor(size: Int) : this(UByteArray(size))

    private val uByteBuffer: Uint8Array = buffer

    actual fun put(b: UByte) {
        uByteBuffer[pos] = b.toByte()
        pos += 1
    }

    actual fun put(byteArray: UByteArray) = put(byteArray, byteArray.size)

    actual fun put(byteArray: UByteArray, length: Int) {
        (0 until length).forEach { i -> uByteBuffer[pos++] = byteArray[i].toByte() }
    }

    actual operator fun set(pos: Int, b: UByte) {
        uByteBuffer[pos] = b.toByte()
    }

    actual fun get(): UByte {
        return uByteBuffer[pos].toUByte()
    }

    actual operator fun get(pos: Int): UByte {
        return uByteBuffer[pos].toUByte()
    }
}
