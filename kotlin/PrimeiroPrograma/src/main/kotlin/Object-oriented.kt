import java.time.temporal.TemporalAmount

abstract class Person(val name: String) {
    abstract fun greet()
}

interface FoodConsumer {
    fun eat()
    fun pay(amount: Int) = println("Delicious! Here's $amount bucks!")
}

class RestaurantCustomer(name: String, val dish : String) : Person(name), FoodConsumer {
    fun order() = println("$dish, please!")
    override fun eat() =    println("*Eats $dish*")
    override fun greet() = println("Its me, $name")
}

fun main() {
    val sam = RestaurantCustomer("Sam", "churrasco")
    sam.greet()
    sam.order()
    sam.eat()
    sam.pay(50)
}