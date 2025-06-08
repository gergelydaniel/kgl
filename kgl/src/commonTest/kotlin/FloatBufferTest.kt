import com.danielgergely.kgl.FloatBuffer
import kotlin.math.abs
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FloatBufferTest {

    @Test
    fun floatBufferStoresValue() {
        val floatBuffer = FloatBuffer(1)

        floatBuffer[0] = 98f

        assertEquals(98f, floatBuffer[0])
    }

    @Test
    fun floatBufferPutIndividualChangesPosition() {
        val floatBuffer = FloatBuffer(10)

        floatBuffer.put(3f)

        assertEquals(floatBuffer.position, 1)
    }

    @Test
    fun floatBufferPutArrayChangesPosition() {
        val floatBuffer = FloatBuffer(10)

        floatBuffer.put(floatArrayOf(3f, 4f))

        assertEquals(floatBuffer.position, 2)
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
    fun floatBufferDoesntWrapArray() {
        val floatArray = FloatArray(10)
        floatArray[5] = 111f

        val floatBuffer = FloatBuffer(floatArray)
        floatArray[5] = 112f

        assertEquals(111f, floatBuffer[5])
    }

    @Test
    fun floatBufferArrayGet() {
        val floatBuffer = FloatBuffer(floatArrayOf(10.1f, 20.2f, 30.3f, 40.4f))

        floatBuffer.get()

        val floatArray = FloatArray(2)
        floatBuffer.get(floatArray)

        assertEqualsWithTolerance(20.2f, floatArray[0])
        assertEqualsWithTolerance(30.3f, floatArray[1])
    }

    @Test
    fun floatBufferSingleGetChangesPosition() {
        val floatBuffer = FloatBuffer(floatArrayOf(10.1f, 20.2f, 30.3f))

        val firstRead = floatBuffer.get()
        assertEqualsWithTolerance(10.1f, firstRead)

        val secondRead = floatBuffer.get()
        assertEqualsWithTolerance(20.2f, secondRead)

        assertEquals(2, floatBuffer.position)
    }

    @Test
    fun floatBufferArrayGetChangesPosition() {
        val floatBuffer = FloatBuffer(floatArrayOf(10.1f, 20.2f, 30.3f))

        val floatArray = FloatArray(2)
        floatBuffer.get(floatArray)

        assertEqualsWithTolerance(10.1f, floatArray[0])
        assertEqualsWithTolerance(20.2f, floatArray[1])

        assertEqualsWithTolerance(30.3f, floatBuffer.get())
    }

    @Test
    fun floatBufferRandomGetDoesntChangePosition() {
        val floatBuffer = FloatBuffer(floatArrayOf(10.1f, 20.2f, 30.3f))

        val getValue0 = floatBuffer[0]
        val getValue1 = floatBuffer[1]

        assertEquals(0, floatBuffer.position)
        assertEqualsWithTolerance(floatBuffer.get(), 10.1f)
    }

    private fun assertEqualsWithTolerance(
        expected: Float,
        actual: Float,
    ) {
        assertTrue(abs(expected - actual) < 0.0001f)
    }
}