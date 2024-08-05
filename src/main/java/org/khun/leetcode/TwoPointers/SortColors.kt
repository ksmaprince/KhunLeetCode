package org.khun.leetcode.TwoPointers

/**
 * Leetcode: 75. Sort Colors
 */

fun sortColors(nums: IntArray): Unit {
    var low = 0
    var mid = 0
    var high = nums.size - 1
    while (mid <= high){
        when(nums[mid]){
            0 -> {
                nums[mid] = nums[low].also { nums[low] = nums[mid] }
                low++
                mid++
            }
            1 -> {
                mid++
            }
            2 -> {
               nums[mid] = nums[high].also { nums[high] = nums[mid] }
               high--
            }
        }
    }
}

fun main() {
    val nums1 = intArrayOf(2, 0, 2, 1, 1, 0)
    sortColors(nums1)
    println(nums1.joinToString()) // Output: [0, 0, 1, 1, 2, 2]

    val nums2 = intArrayOf(2, 0, 1)
    sortColors(nums2)
    println(nums2.joinToString()) // Output: [0, 1, 2]

    val nums3 = intArrayOf(0)
    sortColors(nums3)
    println(nums3.joinToString()) // Output: [0]

    val nums4 = intArrayOf(1)
    sortColors(nums4)
    println(nums4.joinToString()) // Output: [1]
}