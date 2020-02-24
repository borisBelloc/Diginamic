// Diapo 98
//class User( private val name: String, private val age: Int, private var email: String? = null )

// Diapo 101
class User (private var name: String) {

    var address: String = "unspecified"
    var name: String = ""
        set(value) {
            println("adress was changed for $name: $field -> $value")
            field = value
        }



}

fun main (args: Array<String>) {

}