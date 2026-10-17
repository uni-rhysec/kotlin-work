// Task 5.3.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: <number of dice to roll>d<number of die sides>")
        exitProcess(1)
    } else {
        var rolls = args[0].substringBefore("d")
        if (rolls == "") {
            rolls = "1"
        }
        var sides = args[0].substringAfter("d")
        if (sides == "") {
            sides = "6"
        }

        rollDice(rolls.toInt(), sides.toInt())
    }
}
