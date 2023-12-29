import com.danielgergely.kgl.FloatBuffer
import kotlin.test.Test
import kotlin.test.assertEquals

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
}