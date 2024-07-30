package org.khun.leetcode.ArrayAndString

fun productExceptSelf(nums: IntArray): IntArray {
    var PRE = 1
    var END = 1
    val ans = IntArray(nums.size)
    // Pre Product for each - 1,1,2,6
    for((i, num) in nums.withIndex()){
        ans[i] = PRE
        PRE *= num
    }
    // End Product for each - 24 12 4 1
    for(j in nums.size-1 downTo 0){
        ans[j] *= END
        END *= nums[j]
    }
    return ans
}

fun main() {
    val nums1 = intArrayOf(1,2,3,4)
    println(productExceptSelf(nums1).toList())

    val nums2 = intArrayOf(-1,1,0,-3,3)
    println(productExceptSelf(nums2).toList())
}