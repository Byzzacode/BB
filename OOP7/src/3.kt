interface Printer {
    fun print(message: String)
}
class ConsolePrinter : Printer {
    override fun print(message: String) {
        println("Printing message: $message")
    }
}
class Delegating(printer: Printer) : Printer by printer
fun main() {
    val consolePrinter = ConsolePrinter()
    val delegatingPrinter = Delegating(consolePrinter)
    delegatingPrinter.print("Salom Codial")
}
