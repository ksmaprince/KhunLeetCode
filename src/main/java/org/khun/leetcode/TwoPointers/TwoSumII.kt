package org.khun.leetcode.TwoPointers

fun twoSum(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.size - 1
    while (left < right){
        val sum = numbers[left] + numbers[right]
        if (sum == target) return intArrayOf(left+1, right+1)
        if (sum<target){
            left++
        }else{
            right--
        }
    }
    return intArrayOf(-1, -1)
}

fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9).contentToString())
    println(twoSum(intArrayOf(2, 3, 4), 6).contentToString())
    println(twoSum(intArrayOf(-1, 0), -1).contentToString())
}