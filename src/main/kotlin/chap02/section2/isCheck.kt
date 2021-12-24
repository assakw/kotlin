package chap02.section2

fun main() {
    val num = 256

    //  num이 Int형일때
    if(num is Int){
        print(num)

    }else if(num !is Int){
        //  num이 Int형이 아닐 떄, !(num is Int)와 동일
        print("Not a Int")
    }
    println("")

    val x: Any = "Hello"

    if(x is String){
        print(x.length)
    }else{
        print("?")
    }





}