class Box<T>(val value: T) {
    fun printValue() {
        println("Box value: $value")
    }
}

fun main() {
    val intBox = Box(42)
    intBox.printValue()

    // String turidagi Box yaratish
    val stringBox = Box("Kotlin")
    stringBox.printValue()

    // Double turidagi Box yaratish
    val doubleBox = Box(3.14)
    doubleBox.printValue()
}
