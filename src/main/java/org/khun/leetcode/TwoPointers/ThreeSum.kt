package org.khun.leetcode.TwoPointers

fun threeSum(nums: IntArray): List<List<Int>> {
    val results = mutableListOf<List<Int>>()
    nums.sort()

    for (i in 0 until nums.size - 2){
        if (i == 0 || (nums[i] !=nums[i-1])){
            val target = -nums[i]
            var left = i+1
            var right = nums.size - 1
            while (left < right){
                val sum = nums[left] + nums[right]
                when{
                    sum == target -> {
                        results.add(listOf(nums[i], nums[left], nums[right]))
                        while (left<right && nums[left] == nums[left+1]) left++
                        while (left<right && nums[right] == nums[right-1]) right--
                        left++
                        right--
                    }
                    sum < target -> left++
                    else -> right--
                }
            }
        }
    }
    return  results
}

fun main() {
    println(threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
    println(threeSum(intArrayOf(0, 1, 1)))
    println(threeSum(intArrayOf(0, 0, 0)))
}