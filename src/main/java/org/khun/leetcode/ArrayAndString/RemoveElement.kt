package org.khun.leetcode.ArrayAndString

/**
 * Remove Element (KOTLIN)
 * https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
 */

fun removeElement(nums: IntArray, `val`: Int): Int {
    var index = 0
    for (i in nums.indices) {
        if (nums[i] != `val`) nums[index++] = nums[i]
    }
    return index
}

fun main() {
    val nums_1 = intArrayOf(3, 2, 2, 3)
    val val_1 = 3
    println(removeElement(nums_1, val_1))

    val nums_2 = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
    val val_2 = 2
    println(removeElement(nums_2, val_2))
}