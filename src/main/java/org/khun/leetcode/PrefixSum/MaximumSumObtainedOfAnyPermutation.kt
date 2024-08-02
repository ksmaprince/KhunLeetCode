package org.khun.leetcode.PrefixSum

/**
 *
 */
fun maxSumRangeQuery(nums: IntArray, requests: Array<IntArray>): Int {
    val MOD = 1_000_000_007
    val freq = IntArray(nums.size)
    for (req in requests){
        freq[req[0]]++
        if (req[1]+1 < nums.size) freq[req[1] + 1]--
    }

    for (i in 1 until nums.size){
        freq[i] += freq[i-1]
    }

    nums.sort()
    freq.sort()

    var maxSum = 0L
    for (i in 0 until nums.size){
        maxSum = (nums[i].toLong() * freq[i] + maxSum) % MOD
    }
    return maxSum.toInt()
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5)
    val requests = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(0, 1)
    )
    println(maxSumRangeQuery(nums, requests)) // Output: 19

    val nums1 = intArrayOf(1, 2, 3, 4, 5, 6)
    val requests1 = arrayOf(
        intArrayOf(0, 1)
    )
    println(maxSumRangeQuery(nums1, requests1)) // Output: 11
}