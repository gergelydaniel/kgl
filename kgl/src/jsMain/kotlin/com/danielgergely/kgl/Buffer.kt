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

actual class ByteBuffer constructor(buffer: Uint8Array) : Buffer(buffer) {
    actual constructor(buffer: Array<Byte>) : this(Uint8Array(buffer))
    actual constructor(buffer: ByteArray) : this(Uint8Array(buffer.toTypedArray()))
    actual constructor(size: Int) : this(ByteArray(size))

    private val byteBuffer: Uint8Array = buffer

    actual fun put(b: Byte) {
        byteBuffer[pos] = b
        pos += 1
    }

    actual fun put(byteArray: ByteArray) = put(byteArray, byteArray.size)

    actual fun put(byteArray: ByteArray, length: Int) {
        (0 until length).forEach { i -> byteBuffer[pos++] = byteArray[i] }
    }

    actual operator fun set(pos: Int, b: Byte) {
        byteBuffer[pos] = b
    }

    actual fun get(): Byte {
        return byteBuffer[pos]
    }

    actual operator fun get(pos: Int): Byte {
        return byteBuffer[pos]
    }
}
