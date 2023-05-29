import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinarySearchTreeTest {

    @Test
    fun testBinarySearchTree() {
        val tree = BinarySearchTree()
        tree.insert(50)
        tree.insert(30)
        tree.insert(20)
        tree.insert(40)
        tree.insert(70)
        tree.insert(60)
        tree.insert(80)

        val presentElement = 40
        val expectedPresentResult = true
        val presentResult = tree.search(presentElement)
        assertEquals(expectedPresentResult, presentResult)

        val notPresentElement = 90
        val expectedNotPresentResult = false
        val notPresentResult = tree.search(notPresentElement)
        assertEquals(expectedNotPresentResult, notPresentResult)
    }

    // Agrega más tests según sea necesario

}
