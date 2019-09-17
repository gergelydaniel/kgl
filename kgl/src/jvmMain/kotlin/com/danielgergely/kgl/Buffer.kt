package com.danielgergely.kgl

import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer

actual abstract class Buffer(@JvmField val buffer: java.nio.Buffer) {
    actual fun position(pos: Int) {
        buffer.position(pos)
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

}

@ExperimentalUnsignedTypes
actual class UByteBuffer private constructor(buffer: ByteBuffer): Buffer(buffer) {
    actual constructor(buffer: Array<UByte>) : this(alloc(buffer.size).also { it.put(buffer.toUByteArray().toByteArray()) })
    actual constructor(buffer: UByteArray) : this(alloc(buffer.size).also { it.put(buffer.toByteArray()) })
    actual constructor(size: Int) : this(alloc(size))

    companion object {
        private fun alloc(size: Int) =
                ByteBuffer.allocateDirect(size).order(ByteOrder.nativeOrder())
    }

    private val uByteBuffer: ByteBuffer = buffer

    actual fun put(b: UByte) {
        uByteBuffer.put(b.toByte())
    }

    actual fun put(byteArray: UByteArray) = put(byteArray, byteArray.size)

    actual fun put(byteArray: UByteArray, length: Int) {
        (0 until length).forEach { i -> uByteBuffer.put(byteArray[i].toByte()) }
    }

    actual operator fun set(pos: Int, b: UByte) {
        uByteBuffer.put(pos, b.toByte())
    }

    actual fun get(): UByte = uByteBuffer.get().toUByte()

    actual operator fun get(pos: Int): UByte = uByteBuffer.get(pos).toUByte()

}
