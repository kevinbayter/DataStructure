class NodeLinkedList(var value: Int) {
    var next: Node? = null
}

class LinkedList {
    fun insert(i: Int) {

    }

    fun search(i: Int): Any {

        return 0
    }

    fun delete(i: Int) {

    }
    // TODO: Implementa la clase LinkedList con los métodos insert, delete y search
}

class HashTable {
    fun put(s: String, s1: String) {

    }

    fun get(s: String): Any {
        return 0
    }

    fun remove(s: String) {

    }
    // TODO: Implementa la clase HashTable con los métodos put, get y remove
}

fun main() {
    val linkedList = LinkedList()
    linkedList.insert(1)
    linkedList.insert(2)
    linkedList.insert(3)

    val searchResult = linkedList.search(2)
    println("El resultado de la búsqueda es: $searchResult")

    linkedList.delete(2)

    val searchResultAfterDeletion = linkedList.search(2)
    println("El resultado de la búsqueda después de la eliminación es: $searchResultAfterDeletion")

    // HastTable
    val hashTable = HashTable()
    hashTable.put("clave1", "valor1")
    hashTable.put("clave2", "valor2")

    val value1 = hashTable.get("clave1")
    println("El valor asociado a la clave1 es: $value1")

    hashTable.remove("clave2")

    val value2 = hashTable.get("clave2")
    println("El valor asociado a la clave2 es: $value2")
}
