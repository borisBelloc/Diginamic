class Actions {
    companion object {

        fun customer(name: String, city: City, vararg orders: Order): Customer {
            val orderList = orders.toList()
            return Customer(name, city, orderList)
        }

        fun order(isDelivered: Boolean = true, vararg products: Product): Order {
            val productsList = products.toList()
            return Order(productsList, isDelivered )
        }

        fun shop(name: String, vararg customers: Customer): Shop {
            val customersList = customers.toList()
            return Shop(name, customersList)
        }

    }
}

