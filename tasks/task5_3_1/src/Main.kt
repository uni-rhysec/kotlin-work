// Task 5.1.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size == 0) {
        rollDie()
    } else if (args.size == 1) {
        rollDie(args[0].toInt())
    } else {
        println("Can we have one argument from you please thank you very much")
        exitProcess(1)
    }
}