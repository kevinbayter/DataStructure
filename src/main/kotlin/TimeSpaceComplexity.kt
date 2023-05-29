// Ejercicio 1.a: Encuentra el elemento máximo en un arreglo y determina su complejidad de tiempo y espacio
fun findMax(arr: IntArray): Int {
    // TODO: Implementa el código para encontrar el elemento máximo en el arreglo
    val maxElement = 0

    return maxElement
}

// Ejercicio 1.b: Calcula el factorial de un número y analiza su complejidad de tiempo y espacio
fun calculateFactorial(n: Int): Int {
    // TODO: Implementa el código para calcular el factorial de un número
    if (n <= 0) {
        return 1
    }

    return calculateFactorial(n - 1) * n
}


fun main() {
    val arr = intArrayOf(1, 5, 2, 9, 3)
    val max = findMax(arr)
    val n = 5
    val factorial = calculateFactorial(n)
    println("El factorial de $n es: $factorial")
    println("El elemento máximo es: $max")
}
