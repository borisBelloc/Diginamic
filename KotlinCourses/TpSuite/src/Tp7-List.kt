fun Collection<Int>.containsEven() = this.any { it % 2 == 0 }

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 5 , 77)
    println("number contain at least one event ? ${numbers.containsEven()}")
}