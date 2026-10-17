// Task 5.2.2: conversion of marks into grades, using a function

import kotlin.system.exitProcess

fun grade(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}

fun main(args: Array<String>) {
    if (args.size == 0) {
        println("This program requires at least one argument sweetie")
        exitProcess(1)
    } else {
        for (arg in args) {
            println("${arg} is a ${grade(arg.toInt())}")

        }
    }
}