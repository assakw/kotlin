package chap03.section5

fun main() {
    shortFuncccc(3){
        println("First Call : $it")
        // return 사용 불가
    }
}
// crossinline 사용시 람다식에서 return문이 사용되었을 경우 코드 작성 단계에서 오류를 보여주므로
// 잘못도니 비지역 반환을 방지할 수 있음
inline fun shortFuncccc(a: Int, crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    nestedFunc { out(a) }
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit) {
    body()
}