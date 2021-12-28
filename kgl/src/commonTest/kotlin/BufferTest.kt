import com.danielgergely.kgl.ByteBuffer
import com.danielgergely.kgl.FloatBuffer
import kotlin.test.Test
import kotlin.test.assertEquals

class BufferTest {

    @Test
    fun byteBufferStoresValue() {
        val byteBuffer = ByteBuffer(1)

        byteBuffer[0] = 98

        assertEquals(98.toByte(), byteBuffer[0])
    }

    @Test
    fun floatBufferStoresValue() {
        val floatBuffer = FloatBuffer(1)

        floatBuffer[0] = 98f

        assertEquals(98f, floatBuffer[0])
    }

    @Test
    fun byteBufferPutIndividualChangesPosition() {
        val byteBuffer = ByteBuffer(10)

        byteBuffer.put(3)

        assertEquals(byteBuffer.position, 1)
    }

    @Test
    fun floatBufferPutIndividualChangesPosition() {
        val floatBuffer = FloatBuffer(10)

        floatBuffer.put(3f)

        assertEquals(floatBuffer.position, 1)
    }

    @Test
    fun byteBufferPutArrayChangesPosition() {
        val byteBuffer = ByteBuffer(10)

        byteBuffer.put(byteArrayOf(3, 4))

        assertEquals(byteBuffer.position, 2)
    }

    @Test
    fun floatBufferPutArrayChangesPosition() {
        val floatBuffer = FloatBuffer(10)

        floatBuffer.put(floatArrayOf(3f, 4f))

        assertEquals(floatBuffer.position, 2)
    }

    @Test
    fun byteBufferSetDoesntChangePosition() {
        val byteBuffer = ByteBuffer(10)

        byteBuffer.put(3)
        byteBuffer.put(3)

        byteBuffer[2] = 4

        assertEquals(2, byteBuffer.position)
    }

    @Test
    fun floatBufferSetDoesntChangePosition() {
        val floatBuffer = FloatBuffer(10)

        floatBuffer.put(3f)
        floatBuffer.put(3f)

        floatBuffer[2] = 4f

        assertEquals(2, floatBuffer.position)
    }

    @Test
    fun byteBufferDoesntWrapArray() {
        val byteArray = ByteArray(10)
        byteArray[5] = 111

        val byteBuffer = ByteBuffer(byteArray)
        byteArray[5] = 112

        assertEquals(111, byteBuffer[5])
    }

    @Test
    fun floatBufferDoesntWrapArray() {
        val floatArray = FloatArray(10)
        floatArray[5] = 111f

        val floatBuffer = FloatBuffer(floatArray)
        floatArray[5] = 112f

        assertEquals(111f, floatBuffer[5])
    }
}
