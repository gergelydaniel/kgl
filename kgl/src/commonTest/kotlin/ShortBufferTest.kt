import com.danielgergely.kgl.ShortBuffer
import kotlin.test.Test
import kotlin.test.assertEquals

class ShortBufferTest {

    @Test
    fun shortBufferStoresValue() {
        val shortBuffer = ShortBuffer(1)

        shortBuffer[0] = 98

        assertEquals(98, shortBuffer[0])
    }

    @Test
    fun shortBufferPutIndividualChangesPosition() {
        val shortBuffer = ShortBuffer(10)

        shortBuffer.put(3)

        assertEquals(shortBuffer.position, 1)
    }

    @Test
    fun shortBufferPutArrayChangesPosition() {
        val shortBuffer = ShortBuffer(10)

        shortBuffer.put(shortArrayOf(3, 4))

        assertEquals(shortBuffer.position, 2)
    }

    @Test
    fun shortBufferSetDoesntChangePosition() {
        val shortBuffer = ShortBuffer(10)

        shortBuffer.put(3)
        shortBuffer.put(3)

        shortBuffer[2] = 4

        assertEquals(2, shortBuffer.position)
    }

    @Test
    fun shortBufferDoesntWrapArray() {
        val shortArray = ShortArray(10)
        shortArray[5] = 111

        val shortBuffer = ShortBuffer(shortArray)
        shortArray[5] = 112

        assertEquals(111, shortBuffer[5])
    }
}