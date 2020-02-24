lateinit var name: String
val email: String by lazy { "$name@kotlin.com" }

fun forWho(name: String = "you") = "One for $name, one for me"


fun main() {
    name = "Boris"
    println(email)

    println(forWho("Boris"))
    println(forWho())

}