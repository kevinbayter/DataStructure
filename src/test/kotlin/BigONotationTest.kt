import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BigONotationTest {

    @Test
    fun testSumMatrix() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        val sum = sumMatrix(matrix)
        assertEquals(45, sum)
    }

    @Test
    fun testBinarySearch() {
        val arr = intArrayOf(1, 3, 5, 7, 9)
        val target = 5
        val index = binarySearch(arr, target)
        assertEquals(2, index)
    }

    // Agrega más tests según sea necesario

}
