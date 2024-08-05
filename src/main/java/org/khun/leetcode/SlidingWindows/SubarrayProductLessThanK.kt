package org.khun.leetcode.SlidingWindows

/**
 * 713. Subarray Product Less Than K
 */

fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
    if (k < 1) return 0

    var product = 1
    var result = 0
    var left = 0

    for (index in nums.indices) {
        product *= nums[index]

        while (product >= k) {
            product /= nums[left]
            left++
        }

        result += index - left + 1
    }
    return result
}

fun main() {
    println(numSubarrayProductLessThanK(intArrayOf(10, 5, 2, 6), 100))// Output: 8
    println(numSubarrayProductLessThanK(intArrayOf(1, 2, 3), 0))// Output: 0
}