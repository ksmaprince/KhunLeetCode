package org.khun.leetcode.BinarySearch

/**
 * Leetcode: 33. Search in Rotated Sorted Array
 */

fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1
    while (left <= right) {
        val mid = left + (right - left) / 2
        if (nums[mid] == target) return mid
        if (nums[left] < nums[mid]) {
            if (nums[left] <= target && target < nums[mid]) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        } else {
            if (nums[mid] < target && target <= nums[right]) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
    }
    return -1
}

fun main() {
    val nums1 = intArrayOf(4, 5, 6, 7, 0, 1, 2)
    val t1 = 0
    println(search(nums1, t1))

    val nums2 = intArrayOf(4, 5, 6, 7, 0, 1, 2)
    val t2 = 3
    println(search(nums2, t2))
}