package org.khun.leetcode.OneDimensionDynamicProgramming

/**
 * Leetcode: 198. House Robber
 */

fun rob(nums: IntArray): Int {
    if(nums.size < 2) return nums[nums.size - 1]

    val DP = IntArray(nums.size)
    DP[0] = nums[0]
    DP[1] = maxOf(nums[0], nums[1])
    for (i in 2 until nums.size){
        DP[i] = maxOf(nums[i] + DP[i - 2], DP[i - 1])
    }
    return DP[nums.size - 1]
}

fun main() {
    val nums1 = intArrayOf(1,2,3,1)
    println(rob(nums1))

    val nums2 = intArrayOf(2,7,9,3,1)
    println(rob(nums2))
}