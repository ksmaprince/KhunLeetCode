package org.khun.leetcode.ArrayAndString

/**
 * Remove Duplicate from Sorted Array (JAVA)
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 */

fun removeDuplicates(nums: IntArray): Int {
    var index = 1
    for (i in 1 until nums.size) {
        if (nums[i - 1] != nums[i]) nums[index++] = nums[i]
    }
    return index
}

fun main(){
    val nums1 = intArrayOf(1, 1, 2)
    println(removeDuplicates(nums1))

    val nums2 = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    println(removeDuplicates(nums2))
}