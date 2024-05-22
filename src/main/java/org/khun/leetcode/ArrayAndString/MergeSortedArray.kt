package org.khun.leetcode.ArrayAndString

/**
 *  Merge Sorted Array (KOTLIN)
 *  https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 */

class MergeSortedArray1 {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var pointer1 = m - 1;
        var pointer2 = n - 1;
        var pointer = m + n - 1;
        while (pointer1 >= 0 && pointer2 >= 0) {
            if (nums1[pointer1] > nums2[pointer2]) {
                nums1[pointer] = nums1[pointer1]
                pointer1--
            } else {
                nums1[pointer] = nums2[pointer2]
                pointer2--
            }
            pointer--
        }
        while (pointer2 >= 0) {
            nums1[pointer] = nums2[pointer2]
            pointer2--
            pointer--
        }
    }
}


fun main() {
    val mergeSortedArray = MergeSortedArray1()
    // Test case 1
    val nums1_1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2_1 = intArrayOf(2, 5, 6)
    mergeSortedArray.merge(nums1_1, 3, nums2_1, 3)
    println("Merged array: ${nums1_1.joinToString(", ")}") // Output: [1, 2, 2, 3, 5, 6]

    // Test case 2
    val nums1_2 = intArrayOf(1)
    val nums2_2 = intArrayOf()
    mergeSortedArray.merge(nums1_2, 1, nums2_2, 0)
    println("Merged array: ${nums1_2.joinToString(", ")}") // Output: [1]

    // Test case 3
    val nums1_3 = intArrayOf(0)
    val nums2_3 = intArrayOf(1)
    mergeSortedArray.merge(nums1_3, 0, nums2_3, 1)
    println("Merged array: ${nums1_3.joinToString(", ")}") // Output: [1]
}