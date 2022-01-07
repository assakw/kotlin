package chap03.section5

fun main() {
    val number = 5
//    factorial(number)

    println(factorial(number))

    val mal1 = mul(1, 2)

    val mal2 = mul2(2, 3)

    println("mal1 : $mal1  , mal2 : $mal2")
}

tailrec fun factorial(n: Int, run: Int = 1): Long{
    return if (n == 1) run.toLong() else factorial(n - 1, run * n)
}

fun mul(a: Int, b: Int): Int = a * b


fun mul2(a: Int, b: Int): Int  {return a * b}