package chap03.section3.funcargs

fun main() {
    println("funcFunc : ${funcFunc()}")
}

fun sum2(a: Int, b: Int) = a + b

fun funcFunc(): Int {
    // 함수의 반환값으로 함수를 사용... 고차함수
    return sum2(2, 2)
}
