// Task 7.7.1: program to compute stats for a numeric dataset

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("One argument required")
        exitProcess(1)
    }
    var list = readData(args[0])
    displayStats(list)
}