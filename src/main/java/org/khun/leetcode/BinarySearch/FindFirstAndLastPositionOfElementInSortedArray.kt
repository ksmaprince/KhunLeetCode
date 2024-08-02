package org.khun.leetcode.BinarySearch

/**
 * Leetcode: 34. Find First and Last Position of Element in Sorted Array
 */
fun searchRange(nums: IntArray, target: Int): IntArray {
    val result = intArrayOf(-1, -1)
    if (nums.isEmpty()) return result

    fun findFirst(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        var pos = -1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) {
                pos = mid
                right = mid - 1
            } else if (nums[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return pos
    }

    fun findLast(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        var pos = -1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) {
                pos = mid
                left = mid + 1
            } else if (nums[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return pos
    }
    result[0] = findFirst(nums, target)
    result[1] = findLast(nums, target)
    return result
}

fun main() {
    val nums1 = intArrayOf(5, 7, 7, 8, 8, 10)
    val t1 = 8
    println(searchRange(nums1, t1).toList())

    val nums2 = intArrayOf(5, 7, 7, 8, 8, 10)
    val t2 = 6
    println(searchRange(nums2, t2).toList())

    val nums3 = intArrayOf()
    val t3 = 0
    println(searchRange(nums3, t3).toList())
}