package chap03.section1

// 함수를 선언할떄는 매개변수
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b


fun sum3(a: Int, b: Int) = a + b

fun main() {
    // 함수를 호출할때는 인자
    val result1 = sum3(3, 2);
    val result2 = sum3(6, 7);

    println(result1)
    println(result2)
}