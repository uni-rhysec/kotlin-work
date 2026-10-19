// Task 7.3.1: list element access

fun main() {
    val numbers = mutableListOf(6, 9, 4, 2, 0)
    println(numbers)
    println(numbers[0])
    println(numbers.slice(0..1))
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    numbers.add(1)
    println(numbers)
    numbers.addAll(listOf(2, 7))
    println(numbers)
    numbers.remove(4)
    println(numbers)
    numbers.removeAll(listOf(2, 0, 1, 2))
    println(numbers)
    numbers.removeAt(1)
    println(numbers)
    numbers.clear()
    println(numbers)
}