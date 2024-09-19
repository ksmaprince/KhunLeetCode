package org.khun.leetcode.ArrayAndString

/**
 *  Leetcode 1390. Four Divisors
 */
fun sumFourDivisors(nums: IntArray): Int {
    var sum = 0
    for(n in nums){
        var divCount = 0
        var tempSum = 0
        for (i in 1..n){
            if (n % i == 0){
                divCount++
                tempSum += i
            }
            if (divCount > 4) break
        }
        if (divCount == 4) sum += tempSum
    }
    return sum
}

fun main() {
    println(sumFourDivisors(intArrayOf(21, 4, 7))) // 32
    println(sumFourDivisors(intArrayOf(21, 21))) // 64
    println(sumFourDivisors(intArrayOf(1,2,3,4,5))) // 0
}