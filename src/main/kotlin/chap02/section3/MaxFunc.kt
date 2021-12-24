package chap02.section3

fun main() {
    val num1 = 10
    val num2 = 3

    val result: Int = max(num1, num2)
    println(result)

    printSum(num1, num2)
}

fun max(a: Int, b: Int) = if(a > b) a else b

//  Unit void
// void : 아무것도 반환하지 않음
// Unit : 특수한 객체를 반환
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}