package com.danielgergely.kgl

import org.khronos.webgl.*

actual abstract class Buffer(internal val buffer: ArrayBufferView) {
    actual var position: Int = 0
}

actual class FloatBuffer constructor(buffer: Float32Array) : Buffer(buffer) {
    actual constructor(buffer: Array<Float>) : this(Float32Array(buffer))
    actual constructor(buffer: FloatArray) : this(Float32Array(buffer.toTypedArray()))
    actual constructor(size: Int) : this(FloatArray(size))

    private val floatBuffer: Float32Array = buffer

    actual fun put(f: Float) {
        floatBuffer[position] = f
        position += 1
    }

    actual fun put(floatArray: FloatArray) = put(floatArray, 0, floatArray.size)

    actual fun put(floatArray: FloatArray, offset: Int, length: Int) {
        floatBuffer.set((floatArray.unsafeCast<Float32Array>()).subarray(offset, length), position)
        position += length
    }

    actual operator fun set(pos: Int, f: Float) {
        floatBuffer[pos] = f
    }

    actual fun get(): Float = floatBuffer[position]

    actual fun get(floatArray: FloatArray) {
        get(floatArray, 0, floatArray.size)
    }

    actual fun get(floatArray: FloatArray, offset: Int, length: Int) {
        val dest = floatArray.unsafeCast<Float32Array>()
        dest.subarray(offset, length).set(floatBuffer, position)
    }

    actual operator fun get(pos: Int): Float = floatBuffer[pos]
}

actual class ByteBuffer constructor(buffer: Uint8Array) : Buffer(buffer) {
    actual constructor(buffer: Array<Byte>) : this(Uint8Array(buffer))
    actual constructor(buffer: ByteArray) : this(Uint8Array(buffer.toTypedArray()))
    actual constructor(size: Int) : this(ByteArray(size))

    private val byteBuffer: Uint8Array = buffer

    actual fun put(b: Byte) {
        byteBuffer[position] = b
        position += 1
    }

    actual fun put(byteArray: ByteArray) = put(byteArray, 0, byteArray.size)

    actual fun put(byteArray: ByteArray, offset: Int, length: Int) {
        buffer.asDynamic().set(byteArray.asDynamic().subarray(0, length), position)
        position += length
    }

    actual operator fun set(pos: Int, b: Byte) {
        byteBuffer[pos] = b
    }

    actual fun get(): Byte {
        return byteBuffer[position]
    }

    actual fun get(byteArray: ByteArray) {
        get(byteArray, 0, byteArray.size)
    }

    actual fun get(byteArray: ByteArray, offset: Int, length: Int) {
        val dest = byteArray.unsafeCast<Uint8Array>()
        dest.subarray(offset, length).set(byteBuffer, position)
    }

    actual operator fun get(pos: Int): Byte {
        return byteBuffer[pos]
    }
}
