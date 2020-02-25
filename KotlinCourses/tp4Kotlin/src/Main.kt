open interface Network {
    fun connect(success: (message: String) -> Unit, fail: (errorMessage: String) -> Unit)
    fun disconnect(done: () -> Unit)
    fun sendHello(success: (message: String, code: Int) -> Unit, fail: (errorMessage: String, code: Int) -> Unit)
}

object ApiManager : Network {
    var baseUrl: String? = null
    set(value) {
        // fonction vide, donc pas obligé de mettre les () disconnect(){}
        disconnect {}
        field = value
    }
    private var isConnected: Boolean = false

    override fun connect(success: (message: String) -> Unit, fail: (errorMessage: String) -> Unit) {
        println("Connecting from $baseUrl")
        if (baseUrl.isNullOrEmpty()) fail("Not found")
        else {
            success("Connected")
            isConnected = true
        }
    }

    override fun disconnect(done: () -> Unit) {
        println("Diconnected from $baseUrl")
        isConnected = false
        done()
    }

    override fun sendHello(
        success: (message: String, code: Int) -> Unit,
        fail: (errorMessage: String, code: Int) -> Unit
    ) {
        println("send hello to $baseUrl")
        if (isConnected)
            success("success", 200)
        else fail ("error", 500)

    }
}



fun main() {

}