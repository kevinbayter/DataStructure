class Stack {
    fun push(i: Int) {

    }

    fun isEmpty(): Any {
        return isEmpty()
    }

    fun pop(): Any {
        return 0
    }
    // TODO: Implementa la clase Stack con los métodos push, pop y isEmpty
}

class Queue {
    fun enqueue(i: Int) {

    }

    fun isEmpty(): Any {

        return isEmpty()
    }

    fun dequeue(): Any {

        return 0
    }
    // TODO: Implementa la clase Queue con los métodos enqueue, dequeue y isEmpty
}

fun main() {
    val stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)

    while (!stack.isEmpty()) {
        val element = stack.pop()
        println("Elemento extraído de la pila: $element")
    }

    // Queue
    val queue = Queue()
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)

    while (!queue.isEmpty()) {
        val element = queue.dequeue()
        println("Elemento extraído de la cola: $element")
    }
}

private operator fun Any.not(): Boolean {
    return false
}
