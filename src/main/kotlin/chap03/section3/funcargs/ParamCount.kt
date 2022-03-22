package chap03.section3.funcargs

fun main() {
    // 매개변수가 없는 람다식
    noParam({"Hello World!"})
    noParam { "Hello World!" }  //위와 동일 결과, 소괄호 생략 가능

    // 매개변수가 1개인 경우
    oneParam({a -> "Hello World! $a"})
    oneParam{a -> "Hello World! $a"}
    oneParam { "Hello World! $it" }

    // 매개변수가 2개 이상인 경우
    moreParam({a, b -> "Hello World! $a add $b"})
    moreParam{a, b -> "Hello World! $a add $b"}
    moreParam{_, b -> "Hello World! add $b"}    // 첫 번쨰 문자열은 사용하지 않고 생략

    // 일반 매개변수와 람다식 매개변수 같이 사용
    withArgs("김아린", "김아은", {x, y -> "Hello World! $x and $y"})
    withArgs("김아린", "김아은") { x, y -> "Hello World! $x and $y" }
}

// 매개변수가 없는 람다식이 noParam 함수의 매개변수 out으로 지정됨
fun noParam(out: () -> String) = println(out())

//fun oneParam({ a -> "Hello World! $a" })
fun oneParam(out: (String) -> String){
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String) {
    println(out("안녕", "ㅎㅎ"))
}

fun withArgs(a: String, b: String, out: (String, String) -> String){
    println(out(a, b))

}

