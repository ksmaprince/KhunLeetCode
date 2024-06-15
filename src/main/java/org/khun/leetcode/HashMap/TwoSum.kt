package org.khun.leetcode.HashMap

import java.util.Arrays

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for (i in 0 until nums.size){
        val d = target - nums[i]
        if (map.containsKey(d)) return intArrayOf(map[d]!!, i)
        map[nums[i]] = i
    }
    return intArrayOf(-1, -1)
}

fun main() {
    val nums1 = intArrayOf(2, 7, 11, 15)
    val target1 = 9
    println(Arrays.toString(twoSum(nums1, target1)))

    val nums2 = intArrayOf(3, 2, 4)
    val target2 = 6
    println(Arrays.toString(twoSum(nums2, target2)))

    val nums3 = intArrayOf(3, 3)
    val target3 = 6
    println(Arrays.toString(twoSum(nums3, target3)))
}