package org.khun.leetcode.Intervals

/**
 * Leetcode: 228. Summary Ranges
 */
fun summaryRanges(nums: IntArray): List<String> {
    var range = mutableListOf<String>()
    if (nums.isEmpty()) return range
    var start = nums[0]
    for (i in 1 until nums.size){
        if (nums[i] != nums[i-1] + 1){
            if (start == nums[i - 1]) range.add("$start")
            else range.add("$start->${nums[i-1]}")
            start = nums[i]
        }
    }
    if (start == nums[nums.size - 1]) range.add("$start")
    else range.add("$start->${nums[nums.size-1]}")
    return range
}

fun main() {
    val nums1= intArrayOf(0,1,2,4,5,7)
    println(summaryRanges(nums1)) //Output: ["0->2","4->5","7"]

    val nums2 = intArrayOf(0,2,3,4,6,8,9)
    println(summaryRanges(nums2)) //Output: ["0","2->4","6","8->9"]
}