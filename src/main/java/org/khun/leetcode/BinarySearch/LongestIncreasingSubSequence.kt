package org.khun.leetcode.BinarySearch

/**
 * 300. Longest increasing Subsequence
 */
// 1st Way Using BinarySearch
fun lengthOfLIS(nums: IntArray): Int{
    if (nums.isEmpty()) return 0
    val list = mutableListOf<Int>()

    for (num in nums){
        val pos = list.binarySearch(num)
        if (pos < 0){
            val insertPos = - (pos + 1)
            if (insertPos == list.size) list.add(num)
            else list[insertPos] = num
        }
    }
    return list.size
}

// 2nd Way Using 1DP
//fun lengthOfLIS(nums: IntArray): Int {
//    val DP = IntArray(nums.size) { 1 }
//    for (i in 1 until nums.size) {
//        for (j in 0 until nums.size) {
//            if (nums[i] > nums[j]) {
//                DP[i] = maxOf(DP[i], DP[j] + 1)
//            }
//        }
//    }
//    return DP.maxOrNull() ?: 0
//}

fun main() {
    val nums = intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)
    println(lengthOfLIS(nums)) // Output: 4

    val nums1 = intArrayOf(7, 7, 7, 7, 7, 7, 7)
    println(lengthOfLIS(nums1))
}