// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
        println("3 arguments required")
        exitProcess(1)
    } else {
        val min = args[0].toFloat()
        val max = args[1].toFloat()
        val increment = args[2].toFloat()
        var celsius = min
        println("Celsius|Fahrenheit")
        while (celsius <= max) {
            var fahrenheit = celsius * 9/5 + 32
            println("%4.1f  |  %4.1f".format(celsius, fahrenheit))
            celsius += increment
        }
    }
}
