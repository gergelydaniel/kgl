package com.danielgergely.kgl

import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer

actual abstract class Buffer(@JvmField val buffer: java.nio.Buffer) {
    actual abstract var position: Int
}

actual class FloatBuffer private constructor(buffer: FloatBuffer): Buffer(buffer) {
    actual constructor(buffer: Array<Float>) : this(alloc(buffer.size).also { it.put(buffer.toFloatArray()) })
    actual constructor(buffer: FloatArray) : this(alloc(buffer.size).also { it.put(buffer) })
    actual constructor(size: Int) : this(alloc(size))

    companion object {
        private fun alloc(size: Int) =
                ByteBuffer.allocateDirect(size * 4).order(ByteOrder.nativeOrder()).asFloatBuffer()
    }

    private val floatBuffer: FloatBuffer = super.buffer as FloatBuffer

    actual fun put(f: Float) {
        floatBuffer.put(f)
    }

    actual fun put(floatArray: FloatArray) = put(floatArray, floatArray.size)

    actual fun put(floatArray: FloatArray, length: Int) {
        (0 until length).forEach { i -> floatBuffer.put(floatArray[i]) }
    }

    actual operator fun set(pos: Int, f: Float) {
        floatBuffer.put(pos, f)
    }

    actual fun get(): Float = floatBuffer.get()

    actual operator fun get(pos: Int): Float = floatBuffer.get(pos)

    override var position: Int
        get() = floatBuffer.position()
        set(value) {
            floatBuffer.position(value)
        }
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

    actual fun put(byteArray: ByteArray) = put(byteArray, byteArray.size)

    actual fun put(byteArray: ByteArray, length: Int) {
        (0 until length).forEach { i -> byteBuffer.put(byteArray[i]) }
    }

    actual operator fun set(pos: Int, b: Byte) {
        byteBuffer.put(pos, b)
    }

    actual fun get(): Byte = byteBuffer.get()

    actual operator fun get(pos: Int): Byte = byteBuffer.get(pos)

    override var position: Int
        get() = byteBuffer.position()
        set(value) {
            byteBuffer.position(value)
        }
}
