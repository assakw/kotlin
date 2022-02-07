package chap03.section1

fun main() {
    val name: String = "홍길동"
    val email: String = "assakw@naver.com"

    add(name)
    add(name, email)
    add("둘리", "dooly@example.kr")

    defaultArgs()           // 100 + 200
    defaultArgs(200)    //  200 + 200
}

fun add(name: String, email: String = "default"): Unit{

    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200){
    println("test")
    println(x + y)
}
