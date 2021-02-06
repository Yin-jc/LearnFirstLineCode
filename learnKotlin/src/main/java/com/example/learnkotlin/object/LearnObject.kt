package com.example.learnkotlin.`object`

fun main() {
    Singleton.singletonTest()
    val singleton = Singleton
    val singleton2 = Singleton
    println(singleton)
    println(singleton2)

}

object Singleton {
    fun singletonTest() {
        println("singletonTest is called.")
    }
}