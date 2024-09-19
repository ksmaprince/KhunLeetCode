package org.khun.leetcode.Math

/**
 *  Leetcode 204. Count Primes
 */
fun countPrime(n: Int): Int{
    if (n < 2) return 0
    val isPrime = BooleanArray(n){ true }

    isPrime[0] = false
    isPrime[1] = false

    for(i in 2 until Math.sqrt(n.toDouble()).toInt() + 1){
        if (isPrime[i]){
            for (j in i * i until n step 2)
                isPrime[j] = false
        }
    }
    return isPrime.count { it }
}

fun main() {
    println(countPrime(10)) // 4
    println(countPrime(0)) // 0
    println(countPrime(1)) // 0
}
