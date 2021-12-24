package chap03.section4

import java.util.concurrent.locks.ReentrantLock

var sharable = 1    // 보호가 필요한 공유 자원

fun main() {
    val reLock = ReentrantLock()

    lock(reLock, { criticalFunc()})
    println(sharable)

    lock(reLock) { criticalFunc()}
    println(sharable)

    lock(reLock, ::criticalFunc)
    println(sharable)
}

fun criticalFunc() {
    // 공유 자원 접근 코드 사용
    sharable += 1
}

fun <T> lock(reLock: ReentrantLock, body: () -> T): T{
    println("in")
    reLock.lock()
    try {
        println("return in")
        return body()
    } finally {
        println("finally in")
        reLock.unlock()
    }
}
