package com.example.learnkotlin.`object`

fun main() {
    val teacher = Teacher("Chinese", "Tim", 24)
    teacher.readBooks()
    teacher.correctHomework()
}

interface Teach {
    /**
     * 默认实现 实现类可选择是否复写
     */
    fun readBooks() {
        println("read books default implementation.")
    }
    fun correctHomework()
}

class Teacher(val course: String, name: String, age: Int) : Person2(name, age), Teach {
    /*override fun readBooks() {
        println("$name is reading.")
    }*/

    override fun correctHomework() {
        println("$name is correcting homework.")
    }

}