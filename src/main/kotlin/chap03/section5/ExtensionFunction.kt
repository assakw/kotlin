package chap03.section5

fun main() {
    val source: String = "Hello World!"
    val target: String = "Kotlin"
    println(source.getLongString(target))
}
//
//fun String.getLongString(target: String): String {
//    return if (this.length >  target.length) {
//        this
//    } else {
//        target
//    }
//}

fun String.getLongString (target: String): String =
    if (this.length > target.length) this else target
