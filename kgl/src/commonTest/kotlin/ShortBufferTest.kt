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

    @Test
    fun shortBufferArrayGet() {
        val shortBuffer = ShortBuffer(shortArrayOf(10, 20, 30, 40))

        shortBuffer.get()

        val shortArray = ShortArray(2)
        shortBuffer.get(shortArray)

        assertEquals(20, shortArray[0])
        assertEquals(30, shortArray[1])
    }

    @Test
    fun shortBufferSingleGetChangesPosition() {
        val shortBuffer = ShortBuffer(shortArrayOf(10, 20, 30))

        val firstRead = shortBuffer.get()
        assertEquals(10, firstRead)

        val secondRead = shortBuffer.get()
        assertEquals(20, secondRead)

        assertEquals(2, shortBuffer.position)
    }

    @Test
    fun shortBufferArrayGetChangesPosition() {
        val shortBuffer = ShortBuffer(shortArrayOf(10, 20, 30))

        val shortArray = ShortArray(2)
        shortBuffer.get(shortArray)

        assertEquals(10, shortArray[0])
        assertEquals(20, shortArray[1])

        assertEquals(30, shortBuffer.get())
    }

    @Test
    fun shortBufferRandomGetDoesntChangePosition() {
        val shortBuffer = ShortBuffer(shortArrayOf(10, 20, 30))

        val getValue0 = shortBuffer[0]
        val getValue1 = shortBuffer[1]

        assertEquals(0, shortBuffer.position)
        assertEquals(shortBuffer.get(), 10)
    }
}
