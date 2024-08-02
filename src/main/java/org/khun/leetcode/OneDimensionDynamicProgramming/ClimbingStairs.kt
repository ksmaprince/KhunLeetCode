package org.khun.leetcode.OneDimensionDynamicProgramming

/**
 * Leetcode : 70. Climbing Stairs
 */
// 1st Way
//fun climbStairs(n: Int): Int {
//    if(n <= 2) return n
//
//    var first = 1
//    var second = 2
//    for(i in 3..n){
//        val temp = first + second
//        first = second
//        second = temp
//    }
//    return second
//}

// 2nd Way - Using 1-DP
fun climbStairs(n: Int): Int {
    if (n <= 2) return n
    val DP = IntArray(n)
    DP[0] = 1
    DP[1] = 2
    for (i in 2 until n) {
        DP[i] = DP[i - 1] + DP[i - 2]
    }
    return DP[n - 1]
}

fun main() {
    val n1 = 2
    println(climbStairs(n1)) // Output: 2

    val n2 = 3
    println(climbStairs(n2)) // Output: 3

    val n3 = 4
    println(climbStairs(n3)) // Output: 5

    val n4 = 5
    println(climbStairs(n4)) // Output: 8
}