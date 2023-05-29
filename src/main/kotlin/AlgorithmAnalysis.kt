// Ejercicio 3.a: Análisis de algoritmos y estimación de su eficiencia:
// Compara la eficiencia de tiempo de los algoritmos de búsqueda lineal y búsqueda binaria en un arreglo ordenado
fun linearSearch(arr: IntArray, target: Int): Int {
    // TODO: Implementa el código para buscar el elemento objetivo utilizando búsqueda lineal
    val index = 0

    return index
}

fun binarySearchLinear(arr: IntArray, target: Int): Int {
    // TODO: Implementa el código para buscar el elemento objetivo utilizando búsqueda binaria
    val index = 0

    return index
}

// Ejercicio 2.c: Estima la complejidad de tiempo de un algoritmo de ordenación de burbuja en un arreglo
fun bubbleSort(array: IntArray) {
    // TODO: Implementa el código para ordenar el arreglo utilizando el algoritmo de ordenación de burbuja

}

fun main() {
    val arr = intArrayOf(1, 3, 5, 7, 9)
    val target = 5

    val linearIndex = linearSearch(arr, target)
    val binaryIndex = binarySearchLinear(arr, target)

    println("Búsqueda Lineal: El elemento $target se encuentra en el índice $linearIndex")
    println("Búsqueda Binaria: El elemento $target se encuentra en el índice $binaryIndex")

    // Bubble sort
    val array = intArrayOf(5, 3, 8, 2, 1)
    bubbleSort(arr)

    println("El arreglo ordenado es:")
    for (element in arr) {
        print("$element ")
    }
    println()
}
