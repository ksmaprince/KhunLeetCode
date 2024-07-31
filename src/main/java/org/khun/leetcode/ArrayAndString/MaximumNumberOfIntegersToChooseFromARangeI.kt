package org.khun.leetcode.ArrayAndString

// LeetCode 2554
fun maxCount1(banned: IntArray, n: Int, maxSum: Int): Int{
    var sum = 0
    var count = 0
    val set = banned.toSet()
    for (i in 1..n){
        if(!set.contains(i)){
            if (sum + i > maxSum) return count
            sum += i
            count++
        }
    }
    return count
}
fun main() {
    val banned1 = intArrayOf(1, 6, 5)
    val n1 = 5
    val maxSum1 = 6
    println(maxCount1(banned1, n1, maxSum1))

    val banned2 = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val n2 = 8
    val maxSum2 = 1
    println(maxCount1(banned2, n2, maxSum2))
}