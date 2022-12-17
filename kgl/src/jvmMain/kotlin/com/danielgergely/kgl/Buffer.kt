package com.danielgergely.kgl

import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer
import java.nio.IntBuffer

public actual abstract class Buffer internal constructor(
    @JvmField @PublishedApi internal val javaBuffer: java.nio.Buffer
) {

    public inline fun withJavaBuffer(block: (java.nio.Buffer) -> Unit) {
        val positionBefore = javaBuffer.position()
        block(javaBuffer)
        javaBuffer.position(positionBefore)
    }
}

public actual class FloatBuffer(buffer: FloatBuffer) : Buffer(buffer) {

    public actual constructor(buffer: Array<Float>) : this(buffer.toFloatArray())
    public actual constructor(buffer: FloatArray) : this(alloc(buffer.size).apply {
        put(buffer)
        position(0)
    })

    public actual constructor(size: Int) : this(alloc(size))

    private companion object {
        private fun alloc(size: Int) =
            ByteBuffer.allocateDirect(size * 4).order(ByteOrder.nativeOrder()).asFloatBuffer()
    }

    public actual var position: Int
        get() = floatBuffer.position()
        set(value) {
            floatBuffer.position(value)
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

public actual class ByteBuffer(buffer: ByteBuffer) : Buffer(buffer) {
    public actual constructor(buffer: Array<Byte>) : this(buffer.toByteArray())
    public actual constructor(buffer: ByteArray) : this(alloc(buffer.size).apply {
        put(buffer)
        position(0)
    })

    public actual constructor(size: Int) : this(alloc(size))

    private companion object {
        private fun alloc(size: Int) = ByteBuffer.allocateDirect(size).order(ByteOrder.nativeOrder())
    }

    public actual var position: Int
        get() = byteBuffer.position()
        set(value) {
            byteBuffer.position(value)
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


public actual class IntBuffer(private val buffer: IntBuffer) : Buffer(buffer) {

    public actual constructor(buffer: Array<Int>) : this(buffer.toIntArray())
    public actual constructor(buffer: IntArray) : this(alloc(buffer.size).apply {
        put(buffer)
        position(0)
    })

    public actual constructor(size: Int) : this(alloc(size))

    private companion object {
        private fun alloc(size: Int) = ByteBuffer.allocateDirect(size * 4).order(ByteOrder.nativeOrder()).asIntBuffer()
    }

    public actual var position: Int
        get() = buffer.position()
        set(value) {
            buffer.position(value)
        }

    public actual fun put(i: Int) {
        buffer.put(i)
    }

    public actual fun put(intArray: IntArray): Unit = put(intArray, 0, intArray.size)

    public actual fun put(intArray: IntArray, offset: Int, length: Int) {
        buffer.put(intArray, offset, length)
    }

    public actual operator fun set(pos: Int, i: Int) {
        buffer.put(pos, i)
    }

    public actual fun get(): Int = buffer.get()

    public actual fun get(intArray: IntArray) {
        get(intArray, 0, intArray.size)
    }

    public actual fun get(intArray: IntArray, offset: Int, length: Int) {
        buffer.get(intArray, offset, length)
    }

    public actual operator fun get(pos: Int): Int = buffer.get(pos)
}
