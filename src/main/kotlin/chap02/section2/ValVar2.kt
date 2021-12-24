package chap02.section2

typealias Username1 = String

fun main() {
    var str1: Username = "Hello Kotlin"
    str1 = null
    // 세이프콜, 엘비스 연산자
    println("str1: $str1 length: ${str1?.length ?: -1}")

}
