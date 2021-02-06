package com.example.learnkotlin

fun main() {
    val name = "Jack"
    val score = getScore(name)
    println("$name's score is $score")

    val num = 2.0
    checkNumber(num)

    val name2 = "JimTom"
    val score2 = getScore2(name2)
    println("$name2's score is $score2")
}

/**
 * 精确匹配
 * 不需要加break
 */
fun getScore(name: String): Int {
    return when (name) {
        "Tom" -> 86
        "Jim" -> 77
        "Jack" -> 95
        "Lily" -> 100
        else -> 0
    }
}

/**
 * 无参when
 */
fun getScore2(name: String): Int {
    return when {
        name.startsWith("Tom") -> 86
        name.endsWith("Tom") -> 76
        name == "Jim" -> 77
        name == "Jack" -> 95
        name == "Lily" -> 100
        else -> 0
    }
}

/**
 * 类型匹配
 */
fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Long -> println("number is Long")
        is Float -> println("number is Float")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}