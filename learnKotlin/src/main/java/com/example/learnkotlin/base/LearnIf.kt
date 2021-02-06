package com.example.learnkotlin

fun main() {
    val a = 5
    val b = 6
    val c = largerNumber3(a, b)
    println("larger number is $c")
}

fun largerNumber3(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}

fun largerNumber4(num1: Int, num2: Int): Int = if (num1 > num2) {
    num1
} else {
    num2
}