

data class City(val name: String)
data class Customer(val name: String, val city: City, val order: List<Order>)
data class Shop(val name: String, val customers: List<Customer>)
data class Product(val name: String, val price: Double)
data class Order( val products: List<Product>, val isDelivered: Boolean )


fun main() {
    // DATAS
    val paris = City("Paris")
    val nimes = City("Nîmes")
    val montpellier = City("Montpellier")
    val montreal = City("Montréal")

    val tv = Product("Tv 4k", 499.42)
    val velo = Product("Velo bleu", 199.64)
    val frigo = Product("Frigo blanc", 342.99)

//    ---------------------

    val order1 = Actions.order(true, tv )
    val order2 = Actions.order(true, tv )
    val order3 = Actions.order(false, frigo )
    val order4 = Actions.order(true, velo )
    val order5 = Actions.order(true, velo )

    val eMacron = Actions.customer("Emmanuel Macron", paris, order1)
    val trudeau = Actions<>.customer("Justin Trudeau", montreal, order2, order3)
    val patricia = Actions.customer("Patricia deMontpel", montpellier, order4)
    val kevin = Actions.customer("Kevin", nimes, order5)

    val shopi = Actions.shop("Shopi", patricia, kevin)
    val leBeauBourgeois = Actions.shop("Le beau Bourgeois", eMacron, trudeau)
    val leParisien = Actions.shop("Le Parisien", eMacron)

// Fonctions extension
//    println(shopi.getSetOfCustomers())

//    println(shopi.getCitiesCustomersAreFrom())

//    println(leBeauBourgeois.getCustomersFrom(paris))

//    println(leBeauBourgeois.checkAllCustomersAreFrom(paris))
//    println(leParisien.checkAllCustomersAreFrom(paris))

//    println(leBeauBourgeois.hasCustomerFrom(paris))

//    println(leParisien.countCustomersFrom(paris))

    // --

        println(trudeau.orderedProducts())


}