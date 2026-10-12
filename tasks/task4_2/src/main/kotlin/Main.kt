// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("PIZZA MENU\n\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian\n\nChoose your pizza (a-d): ")
    val choice = readln().lowercase()
    if (choice in "a".."d") {
        println("Order accepted")
    } else {
        println("Invalid choice!")
    }
}
