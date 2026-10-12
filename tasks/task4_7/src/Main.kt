// Task 4.7: finding the longest line in a file

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("File path required")
        exitProcess(1)
    } else {
        val file = Path(args[0])
        var longestLine = " "
        file.forEachLine {
            if it.size > longestLine.size {
                longestLine = it
            }
        }
        println(longestLine)
    }
}