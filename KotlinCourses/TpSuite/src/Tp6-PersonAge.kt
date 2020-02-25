data class Person(
    val name: String,
    val age: Int? = null
)

val persons = listOf(
    Person("Aline"),
    Person("Bob", 29),
    Person("Marc", 42),
    Person("Christine", 15),
    Person("Albert")
)





fun main() {
    // Si age nul, on considere à 0
    val oldest = persons.maxBy { it.age ?: 0 }
    println("the oldest is $oldest")
}