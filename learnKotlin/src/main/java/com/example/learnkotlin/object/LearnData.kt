package com.example.learnkotlin.`object`

fun main() {
    val cellphone = Cellphone("Apple", 5299.0)
    val cellphone2 = Cellphone("Huawei", 5999.0)
    println(cellphone)
    println("cellphone equals cellphone2 : " + (cellphone == cellphone2))
}

data class Cellphone(val brand: String, val price: Double)