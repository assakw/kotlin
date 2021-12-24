package chap02.section1

import com.exxample.edu.Person
import kotlin.math.PI
import kotlin.math.abs

fun main() {
    val intro: String = "안녕하세요!"
    val num: Int = 20

    println("intro : $intro, num : $num")
    println(PI)
    println(abs(-12.6))

    val person = Person("김건우", 35)

    val name = person.Name
    val age = person.age

    println("name : $name")
    println("age : $age")
    // val  = const
    // var = let




}