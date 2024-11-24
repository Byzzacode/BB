fun <T : Comparable<T>> findMax(a: T, b: T, c: T): T {
    return maxOf(a, b, c)
}

fun main() {
    val intMax = findMax(10, 20, 15)
    println("Eng katta son (Int): $intMax")
    // Double qiymatlar bilan ishlash
    val doubleMax = findMax(12.5, 7.8, 9.3)
    println("Eng katta son (Double): $doubleMax")

    // Float qiymatlar bilan ishlash
    val floatMax = findMax(5.5f, 3.3f, 8.8f)
    println("Eng katta son (Float): $floatMax")
}

