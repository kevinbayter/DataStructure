import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AlgorithmAnalysisTest {

    @Test
    fun testLinearSearch() {
        val arr = intArrayOf(1, 3, 5, 7, 9)
        val target = 5
        val index = linearSearch(arr, target)
        assertEquals(2, index)
    }

    @Test
    fun testBubbleSort() {
        val arr = intArrayOf(5, 3, 8, 2, 1)
        bubbleSort(arr)
        val sortedArr = intArrayOf(1, 2, 3, 5, 8)
        assertEquals(sortedArr, arr)
    }

    // Agrega más tests según sea necesario

}
