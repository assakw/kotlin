package chap03.section5

fun main() {
    // 인라인 함수 shortFunc()의 내용이 복사되어 shortFunc으로 들어감
    shortFunc(3){ println("First call : $it")}
    shortFunc(5){ println("Second call : $it")}
}


// inline 함수는 람다식 매개변수를 가지고 있는 함수에서 동작
// 보통 함수는 호출되었을때 다른 코드로 분기해야 하기떄문에 내부적으로 기존 내용을 저장했다가 다시 돌아올 때 복구하는 작업에 프로세스(cpu)
// 와 메모리를 꽤 사용해야 하는 비용(overhead)이 듦
// 함수가 2번 호출되는 것처럼 보이지만 역컴파일 해보면 shortFunc()함수의 내용이 복사된 것을 확인
// 확인 : Tools -> Kotlin -> Show Kotlin Bytecode [Decompile]버튼 확인

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}
