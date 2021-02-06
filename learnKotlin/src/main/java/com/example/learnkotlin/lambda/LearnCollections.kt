package com.example.learnkotlin.lambda

fun main() {
    /**
     * 不可变集合
     */
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    for (fruit in list) {
//        println(fruit)
    }

    /**
     * 可变集合
     */
    val mutableList = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
    mutableList.add("Watermelon")
    for (fruit in mutableList) {
        println(fruit)
    }

}