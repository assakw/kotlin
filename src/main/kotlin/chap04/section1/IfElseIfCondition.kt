package chap04.section1

fun main() {
//    print("Enter the score : ")
//    val score = readLine()!!.toDouble()
//    var grade: Char = 'F'
//
//    if(score >= 90.0){
//        grade = 'A'
//    }else if (score in 80.0 .. 89.9){
//        grade = 'B'
//    }else if (score in 70.0 .. 79.9){
//        grade = 'C'
//    }
//
//    println("Score : $score, Grade : $grade")

    lateinit var text: String


    

    // 대충 중간에 뭔가 했음
    val result1 = 30

    text = "Result : $result1"
    println(text)

    // 대충 뭔가 또 했음
    val result2 = 50

    text = "Result : ${result1 + result2}"
    println(text)
}