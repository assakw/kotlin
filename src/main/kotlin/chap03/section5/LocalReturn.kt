package chap03.section5

fun main() {
    shortFunccc(3){
        println("First Call : $it")
        // 비지역 반환(Non-Local Return)
        return
    }
}

inline fun shortFunccc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}