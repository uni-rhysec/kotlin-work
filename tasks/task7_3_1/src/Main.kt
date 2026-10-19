// Task 7.3.1: list element access

fun main() {
    val numbers = listOf(6, 9, 4, 2, 0)
    println(numbers)
    println(numbers[0])
    println(numbers.slice(0..1))
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    numbers.add(1)
}