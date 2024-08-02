package org.khun.leetcode.BinarySearch

/**
 * Leetcode: 153. Find Minimum in Rotated Sorted Array
 */

fun findMin(nums: IntArray): Int {
    var left = 0
    var right = nums.size - 1
    while (left < right) {
        val mid = left + (right - left) / 2

        if (nums[mid] > nums[right]) {
            left = mid + 1
        } else {
            right = mid
        }
    }
    return nums[left]
}

fun main() {
    val nums1 = intArrayOf(3, 4, 5, 1, 2)
    println(findMin(nums1)) // Output: 1

    val nums2 = intArrayOf(4, 5, 6, 7, 0, 1, 2)
    println(findMin(nums2)) // Output: 0

    val nums3 = intArrayOf(11, 13, 15, 17)
    println(findMin(nums3)) // Output: 11
}