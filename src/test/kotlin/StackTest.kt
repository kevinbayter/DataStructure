import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StackTest {
    @Test
    fun testStackOperations() {
        val stack = Stack()
        stack.push(1)
        stack.push(2)
        stack.push(3)

        assertEquals(3, stack.pop(), "El elemento extraído de la pila es incorrecto")
        assertEquals(2, stack.pop(), "El elemento extraído de la pila es incorrecto")
        assertEquals(1, stack.pop(), "El elemento extraído de la pila es incorrecto")
        assertEquals(true, stack.isEmpty(), "La pila no está vacía después de extraer todos los elementos")
    }
}

class QueueTest {
    @Test
    fun testQueueOperations() {
        val queue = Queue()
        queue.enqueue(1)
        queue.enqueue(2)
        queue.enqueue(3)

        assertEquals(1, queue.dequeue(), "El elemento extraído de la cola es incorrecto")
        assertEquals(2, queue.dequeue(), "El elemento extraído de la cola es incorrecto")
        assertEquals(3, queue.dequeue(), "El elemento extraído de la cola es incorrecto")
        assertEquals(true, queue.isEmpty(), "La cola no está vacía después de extraer todos los elementos")
    }
}

