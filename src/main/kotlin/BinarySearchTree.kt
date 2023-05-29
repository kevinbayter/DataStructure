// Complejidad de tiempo y espacio: Ejercicio 1.c:
// Busca un elemento en un árbol binario de búsqueda y estima su complejidad de tiempo y espacio
class Node(var key: Int) {
    var left: Node? = null
    var right: Node? = null
}

class BinarySearchTree {
    private var root: Node? = null

    // TODO: Implementa los métodos para insertar un nodo y buscar un elemento en el árbol binario de búsqueda
    // También añade el código para estimar la complejidad de tiempo y espacio

    // Inserta un nodo en el árbol binario de búsqueda
    fun insert(key: Int) {
        root = root?.let { insertRecursive(it, key) }
    }

    // implementar metodo insertRecursive
    private fun insertRecursive(node: Node, key: Int): Node {
        // Si el árbol está vacío, crea un nuevo nodo


        // Si el valor es menor que la clave del nodo actual, ve al subárbol izquierdo


        // Si el valor es mayor que la clave del nodo actual, ve al subárbol derecho




        // Retorna el nodo actual
        return node
    }

    // TODO: Implementa la función `search` y la estimación de complejidad de tiempo y espacio
    // Busca un elemento en el árbol binario de búsqueda
    fun search(key: Int): Boolean? {
        return root?.let { searchRecursive(root!!, key) };
    }

    // Función auxiliar recursiva para buscar un elemento en el árbol
    private fun searchRecursive(node: Node, key: Int): Boolean {
        // Si el nodo es nulo, el elemento no está presente


        // Si el elemento es igual a la clave del nodo actual, se encontró el elemento


        // Si el elemento es menor que la clave del nodo actual, busca en el subárbol izquierdo


        // Si el elemento es mayor que la clave del nodo actual, busca en el subárbol derecho

        return false;
    }

}

fun main() {
    val tree = BinarySearchTree()
    tree.insert(50)
    tree.insert(30)
    tree.insert(20)
    tree.insert(40)
    tree.insert(70)
    tree.insert(60)
    tree.insert(80)

    val element = 40
    if (tree.search(element) == true)
        println("El elemento $element está presente en el árbol")
    else
        println("El elemento $element no está presente en el árbol")
}
