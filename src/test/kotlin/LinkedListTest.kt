import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class LinkedListTest {
    @Test
    fun testLinkedListOperations() {
        val linkedList = LinkedList()
        linkedList.insert(1)
        linkedList.insert(2)
        linkedList.insert(3)

        assertEquals(true, linkedList.search(2), "La búsqueda en la lista enlazada es incorrecta")
        linkedList.delete(2)
        assertEquals(false, linkedList.search(2), "La eliminación en la lista enlazada es incorrecta")
    }
}

class HashTableTest {
    @Test
    fun testHashTableOperations() {
        val hashTable = HashTable()
        hashTable.put("clave1", "valor1")
        hashTable.put("clave2", "valor2")
        assertEquals("valor1", hashTable.get("clave1"), "El valor obtenido de la tabla hash es incorrecto")
        hashTable.remove("clave2")
        assertEquals(null, hashTable.get("clave2"), "La eliminación en la tabla hash es incorrecta")
    }

    @Test
    fun testHashTableOperations2() {
        val hashTable = HashTable()
        hashTable.put("clave1", "valor1")
        hashTable.put("clave2", "valor2")

        assertEquals("valor1", hashTable.get("clave1"), "El valor obtenido de la tabla hash es incorrecto")
        assertEquals("valor2", hashTable.get("clave2"), "El valor obtenido de la tabla hash es incorrecto")

        assertNull(hashTable.get("clave3"), "El valor obtenido de la tabla hash es incorrecto")

        hashTable.remove("clave1")
        assertNull(hashTable.get("clave1"), "La eliminación en la tabla hash es incorrecta")

        hashTable.put("clave2", "valor3")
        assertEquals("valor3", hashTable.get("clave2"), "La actualización en la tabla hash es incorrecta")
    }
}
