package org.khun.leetcode.ArrayAndString

//LeetCode 2557
fun maxCount(banned: IntArray, n:Int, maxSum: Int): Int{
    var sum = 0L
    var count = 0
    banned.sort()
    var index = 0
    for(i in 1..n){
        while (index < banned.size && i > banned[index]) index++
        if(index < banned.size && i == banned[index]) continue
        if(sum + i > maxSum) return count
        sum += i
        count++
    }
    return count
}

fun main() {
    val banned1 = intArrayOf(1, 4, 6)
    val n1 = 6
    val maxSum1 = 4
    println(maxCount(banned1, n1, maxSum1))

    val banned2 = intArrayOf(4,3,5,6)
    val n2 = 7
    val maxSum2 = 18
    println(maxCount(banned2, n2, maxSum2))
}