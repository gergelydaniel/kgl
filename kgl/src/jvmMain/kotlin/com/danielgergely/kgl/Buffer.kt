package com.danielgergely.kgl

import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer

public actual abstract class Buffer(@JvmField @PublishedApi internal val buffer: java.nio.Buffer) {

    public actual var position: Int
        get() = buffer.position()
        set(value) {
            buffer.position(value)
        }

    public inline fun <T> withIoBuffer(offset: Int, fn: (buffer: java.nio.Buffer) -> T): T {
        val origPosition = this.position
        this.position = offset
        try {
            return fn(this.buffer)
        } finally {
            this.position = origPosition
        }
    }
}

public actual class FloatBuffer private constructor(buffer: FloatBuffer) : Buffer(buffer) {

    public actual constructor(buffer: Array<Float>) : this(buffer.toFloatArray())
    public actual constructor(buffer: FloatArray) : this(FloatBuffer.wrap(buffer))
    public actual constructor(size: Int) : this(alloc(size))

    private companion object {
        private fun alloc(size: Int) =
            ByteBuffer.allocateDirect(size * 4).order(ByteOrder.nativeOrder()).asFloatBuffer()
    }

    private val floatBuffer: FloatBuffer = buffer

    public actual fun put(f: Float) {
        floatBuffer.put(f)
    }

    public actual fun put(floatArray: FloatArray): Unit = put(floatArray, 0, floatArray.size)

    public actual fun put(floatArray: FloatArray, offset: Int, length: Int) {
        floatBuffer.put(floatArray, offset, length)
    }

    public actual operator fun set(pos: Int, f: Float) {
        floatBuffer.put(pos, f)
    }

    public actual fun get(): Float = floatBuffer.get()

    public actual fun get(floatArray: FloatArray) {
        get(floatArray, 0, floatArray.size)
    }

    public actual fun get(floatArray: FloatArray, offset: Int, length: Int) {
        floatBuffer.get(floatArray, offset, length)
    }

    public actual operator fun get(pos: Int): Float = floatBuffer.get(pos)
}

public actual class ByteBuffer private constructor(buffer: ByteBuffer) : Buffer(buffer) {
    public actual constructor(buffer: Array<Byte>) : this(buffer.toByteArray())
    public actual constructor(buffer: ByteArray) : this(ByteBuffer.wrap(buffer))
    public actual constructor(size: Int) : this(alloc(size))

    private companion object {
        private fun alloc(size: Int) = ByteBuffer.allocateDirect(size).order(ByteOrder.nativeOrder())
    }

    private val byteBuffer: ByteBuffer = buffer

    public actual fun put(b: Byte) {
        byteBuffer.put(b)
    }

    public actual fun put(byteArray: ByteArray): Unit = put(byteArray, 0, byteArray.size)

    public actual fun put(byteArray: ByteArray, offset: Int, length: Int) {
        byteBuffer.put(byteArray, offset, length)
    }

    public actual operator fun set(pos: Int, b: Byte) {
        byteBuffer.put(pos, b)
    }

    public actual fun get(): Byte = byteBuffer.get()

    public actual fun get(byteArray: ByteArray) {
        get(byteArray, 0, byteArray.size)
    }

    public actual fun get(byteArray: ByteArray, offset: Int, length: Int) {
        byteBuffer.get(byteArray, offset, length)
    }

    public actual operator fun get(pos: Int): Byte = byteBuffer.get(pos)
}
