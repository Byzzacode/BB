// Talaba classi, talaba saqlash
data class Student(val name: String, val age: Int, val grade: Double)

fun main() {
    // Talabalar ro'yxatini yaratish
    val students = listOf(
        Student("Ali", 20, 85.5),
        Student("Sara", 22, 92.0),
        Student("Zafar", 21, 78.0),
        Student("Lola", 19, 95.5),
        Student("Jasur", 23, 88.0)
    )
    val sortedByAge = students.sortedBy { it.age }
    println("Talabalar yoshiga ko'ra:")
    sortedByAge.forEach { println("${it.name}, ${it.age} yosh, Bahosi: ${it.grade}") }
}
