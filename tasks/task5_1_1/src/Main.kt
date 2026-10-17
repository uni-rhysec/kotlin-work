// Task 5.1.1: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Two arguments required please thank you")
        exitProcess(1)
    }
    val isAnagrams = anagrams(args[0],args[1])
    if (isAnagrams) {
        println("${args[0]} and ${args[1]} are anagrams.")
    } else {
        println("${args[0]} and ${args[1]} are not anagrams.")
    }
}