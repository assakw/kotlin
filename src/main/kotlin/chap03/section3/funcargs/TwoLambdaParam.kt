package chap03.section3.funcargs

fun main() {
    twoLambda({a, b -> "안녕하세요. $a, $b"}, {a -> "안녕못해요~ $a"})
    twoLambda({a, b -> "안녕하세요. $a, $b"}, {"안녕못해요~ $it"})
    twoLambda( {a, b -> "안녕하세요. $a, $b"} ){"안녕못해요~ $it"}
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String){
    println(first("김아린", "김아은"))
    println(second("제갈수"))


}