package chap03.section5

fun main(){
    // 일반 표현법
//    val multi = 3.multiply(10)

    // 중위 표현법
    val multi = 3 multiply 10
    println(multi)
}

infix fun Int.multiply(x: Int): Int = this * x