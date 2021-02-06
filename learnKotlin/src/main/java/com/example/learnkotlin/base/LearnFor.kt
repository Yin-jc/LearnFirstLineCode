package com.example.learnkotlin

fun main() {

    /**
     * [0, 10]
     */
    for (i in 0 .. 10) {
        println(i)
    }

    /**
     * [0, 10)
     */
    for (i in 0 until 10) {
        println(i)
    }

    /**
     * 步长2
     */
    for (i in 0 until 10 step 2) {
        println(i)
    }

    /**
     * [10, 0]
     */
    for (i in 10 downTo 0) {
        println(i)
    }

}

