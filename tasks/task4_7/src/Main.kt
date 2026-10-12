// Task 4.7: finding the longest line in a file

import kotlin.system.exitProcess
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.readText

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("File path required")
        exitProcess(1)
    } else {
        val file = Path(args[0])
        println(file.readText())
        var longestLine = " "
        file.forEachLine {
            if (it.length > longestLine.length) {
                longestLine = it
            }
        }
        println(longestLine)
    }
}