import com.danielgergely.kgl.ByteBuffer
import kotlin.test.Test
import kotlin.test.assertEquals

class ByteBufferTest {

    @Test
    fun byteBufferStoresValue() {
        val byteBuffer = ByteBuffer(1)

        byteBuffer[0] = 98

        assertEquals(98.toByte(), byteBuffer[0])
    }

    @Test
    fun byteBufferPutIndividualChangesPosition() {
        val byteBuffer = ByteBuffer(10)

        byteBuffer.put(3)

        assertEquals(byteBuffer.position, 1)
    }

    @Test
    fun byteBufferPutArrayChangesPosition() {
        val byteBuffer = ByteBuffer(10)

        byteBuffer.put(byteArrayOf(3, 4))

        assertEquals(byteBuffer.position, 2)
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
    fun byteBufferDoesntWrapArray() {
        val byteArray = ByteArray(10)
        byteArray[5] = 111

        val byteBuffer = ByteBuffer(byteArray)
        byteArray[5] = 112

        assertEquals(111, byteBuffer[5])
    }
}
