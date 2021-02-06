package com.example.learnkotlin

import kotlin.math.max

fun main() {
    val a = 37
    val b = 40
    val c = largerNumber(a, b)
    println("larger number is $c")
}

/**
 * function定义
 */
fun largerNumber(num1: Int, num2: Int): Int {
    return max(num1, num2)
}

/**
 * simple
 */
fun largerNumber2(num1: Int, num2: Int) = max(num1, num2)