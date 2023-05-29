import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ArrayAndListExercisesTest {
    @Test
    fun testSumArrayElements() {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        val sum = sumArrayElements(arr)
        assertEquals(15, sum, "La suma de los elementos del arreglo es incorrecta")
    }

    @Test
    fun testConcatenateStrings() {
        val strings = listOf("Hola", "mundo", "!")
        val result = concatenateStrings(strings)
        assertEquals("Hola mundo!", result, "La concatenación de las cadenas es incorrecta")
    }
}
