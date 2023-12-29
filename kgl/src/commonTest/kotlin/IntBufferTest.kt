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
}