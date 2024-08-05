package org.khun.leetcode.TwoPointers

import kotlin.math.min

fun maxArea(height: IntArray): Int {
    var maxA = 0
    var left = 0
    var right = height.size - 1

    while (left<right){
        val h = minOf(height[left], height[right])
        val w = right - left
        maxA = maxOf(maxA, h * w)
        if (height[left] < height[right]){
            left++
        }else{
            right--
        }
    }
    return maxA
}

fun main() {
    println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    println(maxArea(intArrayOf(1, 1)))
    println(maxArea(intArrayOf(1, 2, 1)))
}