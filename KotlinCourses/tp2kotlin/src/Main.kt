// Exercice diapo 53
class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String?, message: String)
}

fun sendMessageTOClient(client: Client?, message: String?, mailer: Mailer) {
    val email = client?.personalInfo?.email
    if (email != null && message != null)
        mailer.sendMessage(email, message)
}

// Diapo 64
//fun MutableList<Int>.swap( firstIndex: int, secondIndex: int) {
// Rendre la fonction générique :
fun <T> MutableList<T>.swap( firstIndex: int, secondIndex: int) {
    val tmp = this[firstIndex]
    this[firstIndex] = this[secondIndex]
    this[secondIndex] = tmp
}
// Diapo 76
//fun hasAZ( hasA: (Int) -> Unit, hasZ: (Int) -> Unit ) {
//}

fun String.hasAZ( hasA: (Int) -> Unit, hasZ: (Int) -> Unit ) {
    val nbA = this.count { it == 'a'}
    val nbZ = this.count { it == 'z'}

    if ( nbA > 0 ) hasA(nbA)
    if ( nbZ > 0 ) hasZ(nbZ)
}

fun main() {
    // diapo 76
    val str = "azerty"
    str.hasAZ(
        { nbA -> println("il y a $nbA a") },
        { nbZ -> println("il y a $nbZ z") }
    )


// diapo 64
//    val myMutableList = mutableListOf(3, 5, 7, 8)
//    println("before swap $myMutableList")
//    myMutableList.swap(0, 1)
//    println("after swap $myMutableList")


}