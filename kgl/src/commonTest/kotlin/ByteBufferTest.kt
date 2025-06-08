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

    @Test
    fun byteBufferArrayGet() {
        val byteBuffer = ByteBuffer(byteArrayOf(10, 20, 30, 40))

        byteBuffer.get()

        val byteArray = ByteArray(2)
        byteBuffer.get(byteArray)

        assertEquals(20, byteArray[0])
        assertEquals(30, byteArray[1])
    }

    @Test
    fun byteBufferSingleGetChangesPosition() {
        val byteBuffer = ByteBuffer(byteArrayOf(10, 20, 30))

        val firstRead = byteBuffer.get()
        assertEquals(10, firstRead)

        val secondRead = byteBuffer.get()
        assertEquals(20, secondRead)

        assertEquals(2, byteBuffer.position)
    }

    @Test
    fun byteBufferArrayGetChangesPosition() {
        val byteBuffer = ByteBuffer(byteArrayOf(10, 20, 30))

        val byteArray = ByteArray(2)
        byteBuffer.get(byteArray)

        assertEquals(10, byteArray[0])
        assertEquals(20, byteArray[1])

        assertEquals(30, byteBuffer.get())
    }

    @Test
    fun byteBufferRandomGetDoesntChangePosition() {
        val byteBuffer = ByteBuffer(byteArrayOf(10, 20, 30))

        val getValue0 = byteBuffer[0]
        val getValue1 = byteBuffer[1]

        assertEquals(0, byteBuffer.position)
        assertEquals(byteBuffer.get(), 10)
    }
}
