package org.khun.leetcode.ArrayAndString

/**
 * Leetcode 3101. Count Alternating Subarrays
 */
fun countAlternatingSubarrays(nums: IntArray): Long {
    var result = 1L
    var size = 1
    for (i in 1 until nums.size){
        size = if(nums[i] == nums[i - 1]) 1 else size + 1
        result += size
    }
    return result
}

fun main() {
    println(countAlternatingSubarrays(intArrayOf(0, 1, 1, 1))) // 5
    println(countAlternatingSubarrays(intArrayOf(1, 0, 1, 0))) // 10
}
