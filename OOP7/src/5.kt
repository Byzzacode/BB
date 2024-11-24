// Generic funksiya
fun <T : Comparable<T>> findMax(a: T, b: T): T {
    return if (a > b) a else b
}

fun main() {
    // Int
    val maxInt = findMax(5, 10)
    println("Katta son: $maxInt")

    // Double
    val maxDouble = findMax(3.14, 2.71)
    println("Katta son: $maxDouble")
}
