package org.khun.leetcode.OneDimensionDynamicProgramming

/**
 * Leetcode: 300. Longest Increasing Subsequence
 */

fun lengthOfLIS(nums: IntArray): Int {
    val DP = IntArray(nums.size){1}
    for (i in nums.indices){
        for (j in 0 until i){
            if (nums[i] > nums[j]){
                DP[i] = maxOf(DP[i], DP[j]+1)
            }
        }
    }
    return DP.maxOrNull()?: 0
}

fun main() {
    val nums = intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)
    println(org.khun.leetcode.BinarySearch.lengthOfLIS(nums)) // Output: 4

    val nums1 = intArrayOf(7, 7, 7, 7, 7, 7, 7)
    println(org.khun.leetcode.BinarySearch.lengthOfLIS(nums1)) // Output: 1
}