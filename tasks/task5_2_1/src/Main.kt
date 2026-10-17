// Task 5.2.1: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("It seems you have not entered the correct number of arguments for this program. What a shame. Next time, try just one.")
        exitProcess(1)
    } else {
        val radius = args[0].toDouble()
        println("A circle with radius %.2f has area %.4f".format(radius,circleArea(radius)))
        println("A circle with radius %.2f has perimeter %.4f".format(radius,circlePerimeter(radius)))
    }
}