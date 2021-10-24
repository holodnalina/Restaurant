package main.kotlin.restaurant

fun main() {
    val client = Person("Petrov Peter", "Client")
    val waiter = Person("Ivanov Ivan", "Waiter")
    val chief_cook = Person("Orlov Oleg", "Chief cook")
    val bartender = Person("Sotnik Tetiana", "Bartender")
    val hostess = Person("Kino Olesya", "Hostess")

    val dish1 = Menu("fried chicken", 53.95, "300 gramm")
    val dish2 = Menu("pasta", 22.50, "250 gramm")
    val dish3 = Menu("dessert", 12.25, "150 gramm")

    val drink1 = BarMenu("mohito", 10.99, 0.33)
    val drink2 = BarMenu("coke", 5.50, 0.25)
    val drink3 = BarMenu("beer", 8.95, 0.50)

    hostess.welcome()
    hostess.table()
    waiter.menu()
    client.check()
    chief_cook.choice()
    dish1.choiceMenu()
    bartender.choice()
    drink3.choiceBarMenu()
    chief_cook.prepare()
    bartender.prepare()
    waiter.give()
    waiter.takes()
    drink3.BarBill()
    dish1.MenuBill()
    hostess.goodbye()

}
class Person (
    val fullName: String,
    val status: String){

    fun welcome() {
        println("$status say Welcome to our restaurant! Now we will check a table for you!")
    }
    fun table() {
        println("$status seats the customers.")
    }
    fun menu () {
        println("$status say Hello, my name is $fullName. Today I will be your waiter. Here is your menu, I will come in 5 minutes.")
    }
    fun check(){
        println("$status is checking menu and choosing what he wants.")
    }
    fun choice(){
        println("$status received the order.")
    }
    fun prepare(){
        println("$status prepares the order.")
    }
    fun give(){
        println("$status gives the order to a table.")
    }
    fun takes(){
        println("$status takes dishes. Gives a restaurant bill.")
    }
    fun goodbye(){
        println("$status say goodbye, we will be happy to see you again!")
    }

}
class Menu (
    val dishName: String,
    val price: Double,
    val dishWeight: String){

    fun choiceMenu(){
        println("The choice is $dishWeight of $dishName.")
    }
    fun MenuBill(){
        println("The menu bill of $price is payed")
    }
}
class BarMenu (
    val drinkName: String,
    val price: Double,
    val drinkWeight_to_millilitres: Double
        ){
    fun choiceBarMenu(){
        println("The choice is $drinkWeight_to_millilitres of $drinkName.")
    }
    fun BarBill(){
        println("The bar bill of $price is payed.")
    }
}