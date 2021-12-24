package chap02.section2

typealias Username = String?
fun main() {

    val user: Username = "Kildong"
    println(user)


//    val number = 10
//    var language = "Korean"
//    val secondNumber: Int = 20
//    language = "English"
//
//    val a = 1
//    val str1 = "a = $a"
//    val str2 = "a = ${a + 2}"
//
//    println("        str1 : \"$str1\", str2: \"$str2\"      ")
//    println("        str1 : $str1, str2: $str2      ")
//
//    val special = "\"hello\", I Have \$15"
//    println(special)
//
//    val special2 = " ${'"'}${'$'}9.99${'"'}  "
//    println(special2)

    val num = 10
    val formattedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num)
        """

    println(formattedString)

}

