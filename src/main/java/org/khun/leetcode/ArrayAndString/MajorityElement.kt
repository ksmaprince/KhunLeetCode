package org.khun.leetcode.ArrayAndString

fun majorityElement(nums: IntArray): Int {
    var num = 0
    var count = 0
    for (i in 0 until nums.size) {
        if (count == 0) num = nums[i]
        count += if (nums[i] == num) 1 else -1
    }
    return num
}

fun main() {
    val arr = intArrayOf(3, 2, 3)
    println(majorityElement(arr))

    val arr2 = intArrayOf(2, 2, 1, 1, 1, 2, 2)
    println(majorityElement(arr2))
}