package com.example.learnkotlin.`object`

fun main() {
    val person = Person()
    person.name = "Jack"
    person.age = 19
    person.eat()

    val student = Student2("10086", 100, "Tim", 18)
    student.doHomework()

}

/**
 * 默认不可被继承 类final
 */
open class Person {

    var name = ""
    var age = 0

    fun eat() {
        println("$name is eating. He is $age years old.")
    }
}

/**
 * 父类无参构造函数
 */
class Student() : Person() {

    var sno: String = ""
    var grade: Int = 0

    init {
        println("sno is $sno.")
        println("grade is $grade.")
    }

}

/**
 * 主构造器中声明为var或val的参数将自动成为该类的字段
 */
open class Person2(val name: String, val age: Int) {
    fun eat() {
        println("$name is eating. He is $age years old.")
    }
}

/**
 * 子类构造器中不能声明var或val的父类字段
 */
class Student2(val sno: String, val grade: Int, name: String, age: Int)
    : Person2(name, age) {

    constructor(sno: String, name: String, age: Int) : this(sno, 100, name, age) {

    }

    constructor() : this("1", "Tim", 18) {
        
    }

    init {
        println("sno is $sno")
        println("grade is $grade")
    }

    fun doHomework() {
        println("$name is doing homework. His sno is $sno. His grade is $grade")
    }
}