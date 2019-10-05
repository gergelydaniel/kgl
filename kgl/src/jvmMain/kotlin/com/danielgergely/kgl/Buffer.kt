package com.danielgergely.kgl

import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer

actual abstract class Buffer(@JvmField private val buffer: java.nio.Buffer) {
    actual var position: Int
        get() = buffer.position()
        set(value) {
            buffer.position(value)
        }

    fun <T> withIoBuffer(offset: Int, fn: (buffer: java.nio.Buffer) -> T): T {
        val origPosition = this.position
        this.position = offset
        try {
            return fn(this.buffer)
        } finally {
            this.position = origPosition
        }
    }
}

actual class FloatBuffer private constructor(buffer: FloatBuffer): Buffer(buffer) {
    actual constructor(buffer: Array<Float>) : this(alloc(buffer.size).also { it.put(buffer.toFloatArray()) })
    actual constructor(buffer: FloatArray) : this(alloc(buffer.size).also { it.put(buffer) })
    actual constructor(size: Int) : this(alloc(size))

    companion object {
        private fun alloc(size: Int) =
                ByteBuffer.allocateDirect(size * 4).order(ByteOrder.nativeOrder()).asFloatBuffer()
    }

    private val floatBuffer: FloatBuffer = buffer

    actual fun put(f: Float) {
        floatBuffer.put(f)
    }

    actual fun put(floatArray: FloatArray) = put(floatArray, 0, floatArray.size)

    actual fun put(floatArray: FloatArray, offset: Int, length: Int) {
        floatBuffer.put(floatArray, offset, length)
    }

    actual operator fun set(pos: Int, f: Float) {
        floatBuffer.put(pos, f)
    }

    actual fun get(): Float = floatBuffer.get()

    actual fun get(floatArray: FloatArray) {
        get(floatArray, 0, floatArray.size)
    }

    actual fun get(floatArray: FloatArray, offset: Int, length: Int) {
        floatBuffer.get(floatArray, offset, length)
    }

    actual operator fun get(pos: Int): Float = floatBuffer.get(pos)
}

actual class ByteBuffer private constructor(buffer: ByteBuffer): Buffer(buffer) {
    actual constructor(buffer: Array<Byte>) : this(alloc(buffer.size).also { it.put(buffer.toByteArray()) })
    actual constructor(buffer: ByteArray) : this(alloc(buffer.size).also { it.put(buffer) })
    actual constructor(size: Int) : this(alloc(size))

    companion object {
        private fun alloc(size: Int) =
                ByteBuffer.allocateDirect(size).order(ByteOrder.nativeOrder())
    }

    private val byteBuffer: ByteBuffer = buffer

    actual fun put(b: Byte) {
        byteBuffer.put(b)
    }

    actual fun put(byteArray: ByteArray) = put(byteArray, 0, byteArray.size)

    actual fun put(byteArray: ByteArray, offset: Int, length: Int) {
        byteBuffer.put(byteArray, offset, length)
    }

    actual operator fun set(pos: Int, b: Byte) {
        byteBuffer.put(pos, b)
    }

    actual fun get(): Byte = byteBuffer.get()

    actual fun get(byteArray: ByteArray) {
        get(byteArray, 0, byteArray.size)
    }

    actual fun get(byteArray: ByteArray, offset: Int, length: Int) {
        byteBuffer.get(byteArray, offset, length)
    }

    actual operator fun get(pos: Int): Byte = byteBuffer.get(pos)
}
