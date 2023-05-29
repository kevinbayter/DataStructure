import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TimeSpaceComplexityTest {

    @Test
    fun testFindMax() {
        val arr = intArrayOf(1, 5, 2, 9, 3)
        val max = findMax(arr)
        assertEquals(9, max)
    }

    @Test
    fun testCalculateFactorial() {
        val n = 5
        val factorial = calculateFactorial(n)
        assertEquals(120, factorial)
    }

    // Agrega más tests según sea necesario

}
