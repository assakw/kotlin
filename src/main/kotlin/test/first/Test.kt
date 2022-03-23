package test.first

data class Person(var name: String, var age: Int)

fun main() {
    val person = Person("", 0)
    val resultIt = person.let {
        it.name = "James"
        it.age = 56
        it // (T)->R 부분에서의 R에 해당하는 반환값.
    }

    val resultStr = person.let {
        it.name = "Steve"
        it.age = 59
        "{${it.name} is ${it.age}}" // (T)->R 부분에서의 R에 해당하는 반환값.
    }

    val resultUnit = person.let {
        it.name = "Joe"
        it.age = 63
        // (T)->R 부분에서의 R에 해당하는 반환값 없음
    }
    // 1,2,3,4,5
    println("$resultIt")
    // 1, 2, 3, 4
    println("$resultStr")
    // ??
    println("$resultUnit")
}