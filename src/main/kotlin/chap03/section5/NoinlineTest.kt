package chap03.section5

fun main() {
    shortFuncc(3){ println("first Call: $it")}
}

inline fun shortFuncc(a: Int, noinline out : (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}