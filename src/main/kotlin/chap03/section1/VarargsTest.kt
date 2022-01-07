package chap03.section1

fun main() {
//    normalValargs(1, 2, 3, 4)
//    normalValargs(4, 5, 6)
//
//    var a = sum(1, 2);
//    println("a : $a")


    print("3")
}

fun normalValargs(vararg countss: Int){
    for (num in countss){
        print("$num ")
    }
    print("\n")

}


fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a, b)
