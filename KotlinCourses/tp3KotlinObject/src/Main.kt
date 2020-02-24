// Diapo 98
//class User( private val name: String, private val age: Int, private var email: String? = null )

// diapo 108
private class User (val nickName: String) {

    companion object {
//        fun newSubscribingUser(email: String) : User {
//            val pseudo = email.substringBefore('@')
//            return User(pseudo)
//        }

        // kotlin like
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) : User {
            return User("fb:$accountId")
        }
    }
}

fun main() {
    val subscribedUser = User.newSubscribingUser("bob@gmail.com")
    val fbUser = User.newFacebookUser(4)

    println(subscribedUser.nickName)
    println(fbUser.nickName)
}