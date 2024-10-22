package org.khun.leetcode.Math

fun countAlternatingSubarrays(nums: IntArray): Long {
    var result = 1L
    var size = 1

    for (i in 1 until nums.size - 1) {
        size = if (nums[i - 1] == nums[i]) 1 else size + 1
        result += size
    }
    return result
}

fun main() {
    println(countAlternatingSubarrays(intArrayOf(0, 1, 1, 1, 1)))

    println(countAlternatingSubarrays(intArrayOf(1, 0, 1, 0, 1)))
}