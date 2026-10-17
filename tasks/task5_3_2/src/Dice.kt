// Task 5.3.2: rollDice() function

import kotlin.random.Random

fun rollDice(rolls: Int = 1, sides: Int = 6) {
    var total = 0
    for (i in 1..rolls) {
        var result = Random.nextInt(1, sides + 1)
        total += result
        println("You rolled a ${result}")
    }
    println("Total rolled: ${total}")
}