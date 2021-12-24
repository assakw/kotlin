package chap03.section3.funcargs

fun main() {

    // 인자와 반환값이 있는 함수
    val res1 = funcParam(3, 2, ::sums)
    val res2 = funcParam(3, 2) { x, y -> x + y }
    println(res1)
    println(res2)


    // 인자가 없는 함수
    hello(::text)
    hello({a, b -> text(a, b)})
    hello { a, b -> text(a, b) }


    // 일반 변수에 값처럼 할당
    val likeLambda = ::sums
    println(likeLambda(6, 6))

}

fun sums(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c:(Int, Int) -> Int ): Int {
    return c(a, b)
}

fun hello(body: (String, String) -> String): Unit{
    println(body("Hello", "World"))
}