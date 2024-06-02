package org.khun.leetcode.ArrayAndString

fun rotateArray(nums: IntArray, k: Int) {
    reverseArray(nums, 0, nums.size - 1)
    reverseArray(nums, 0, k - 1)
    reverseArray(nums, k, nums.size - 1)
}

fun reverseArray(nums: IntArray, startIndex: Int, endIndex: Int) {
    var start = startIndex
    var end = endIndex
    while (start < end) {
        val temp = nums[start]
        nums[start] = nums[end]
        nums[end] = temp
        start++
        end--
    }
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    rotateArray(arr, 3)
    println(arr.contentToString())

    val arr2 = intArrayOf(-1, -100, 3, 99)
    rotateArray(arr2, 2)
    println(arr2.contentToString())
}