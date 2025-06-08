import com.danielgergely.kgl.IntBuffer
import kotlin.test.Test
import kotlin.test.assertEquals

class IntBufferTest {

    @Test
    fun intBufferStoresValue() {
        val intBuffer = IntBuffer(1)

        intBuffer[0] = 98

        assertEquals(98, intBuffer[0])
    }

    @Test
    fun intBufferPutIndividualChangesPosition() {
        val intBuffer = IntBuffer(10)

        intBuffer.put(3)

        assertEquals(intBuffer.position, 1)
    }

    @Test
    fun intBufferPutArrayChangesPosition() {
        val intBuffer = IntBuffer(10)

        intBuffer.put(intArrayOf(3, 4))

        assertEquals(intBuffer.position, 2)
    }

    @Test
    fun intBufferSetDoesntChangePosition() {
        val intBuffer = IntBuffer(10)

        intBuffer.put(3)
        intBuffer.put(3)

        intBuffer[2] = 4

        assertEquals(2, intBuffer.position)
    }

    @Test
    fun intBufferDoesntWrapArray() {
        val intArray = IntArray(10)
        intArray[5] = 111

        val intBuffer = IntBuffer(intArray)
        intArray[5] = 112

        assertEquals(111, intBuffer[5])
    }

    @Test
    fun intBufferArrayGet() {
        val intBuffer = IntBuffer(intArrayOf(10, 20, 30, 40))

        intBuffer.get()

        val intArray = IntArray(2)
        intBuffer.get(intArray)

        assertEquals(20, intArray[0])
        assertEquals(30, intArray[1])
    }

    @Test
    fun intBufferSingleGetChangesPosition() {
        val intBuffer = IntBuffer(intArrayOf(10, 20, 30))

        val firstRead = intBuffer.get()
        assertEquals(10, firstRead)

        val secondRead = intBuffer.get()
        assertEquals(20, secondRead)

        assertEquals(2, intBuffer.position)
    }

    @Test
    fun intBufferArrayGetChangesPosition() {
        val intBuffer = IntBuffer(intArrayOf(10, 20, 30))

        val intArray = IntArray(2)
        intBuffer.get(intArray)

        assertEquals(10, intArray[0])
        assertEquals(20, intArray[1])

        assertEquals(30, intBuffer.get())
    }

    @Test
    fun intBufferRandomGetDoesntChangePosition() {
        val intBuffer = IntBuffer(intArrayOf(10, 20, 30))

        val getValue0 = intBuffer[0]
        val getValue1 = intBuffer[1]

        assertEquals(0, intBuffer.position)
        assertEquals(intBuffer.get(), 10)
    }
}
