// Ejercicio 2.b: Calcula la complejidad de tiempo de un algoritmo de búsqueda binaria en un arreglo ordenado

/**
 * Implementa una función que realice una búsqueda binaria en un arreglo ordenado y
 * retorne el índice del elemento objetivo si se encuentra, o -1 si no está presente.
 *
 * @param arr El arreglo ordenado en el que se realizará la búsqueda.
 * @param target El elemento objetivo que se busca en el arreglo.
 * @return El índice del elemento objetivo si se encuentra, o -1 si no está presente.
 */
fun binarySearch(arr: IntArray, target: Int): Int {
    // TODO: Implementa el algoritmo de búsqueda binaria aquí

    return 0
}

// Big O: Ejercicio 2.a: Analiza la complejidad de tiempo de un algoritmo para sumar todos los elementos en una matriz bidimensional
fun sumMatrix(matrix: Array<IntArray>): Int {
    // TODO: Implementa el código para sumar todos los elementos en la matriz

    val sum = 0
    return sum
}

fun main() {
    val arr = intArrayOf(1, 3, 5, 7, 9)
    val target = 5
    val index = binarySearch(arr, target)

    if (index != -1)
        println("El elemento $target se encuentra en el índice $index")
    else
        println("El elemento $target no se encuentra en el arreglo")

    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    val sum = sumMatrix(matrix)
    println("La suma de todos los elementos en la matriz es: $sum")
}
