// Task 4.3: grade calculation using a when expression

import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("3 marks required!")
        exitProcess(1)
    } else {
        val average = ((args[0].toDouble() + args[1].toDouble() + args[2].toDouble()) / 3).roundToInt()
        when {
            average in 0..39   -> println("Fail")
            average in 40..69  -> println("Pass")
            average in 70..100 -> println("Distinction")
            else               -> println("Invalid mark supplied")
        }
        println("Average mark: ${average}")
    }
}