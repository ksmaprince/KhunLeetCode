package org.khun.leetcode.ArrayAndString

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var mm = m
    var nn = n
    while (mm>0 && nn>0){
        if (nums1[mm-1]>nums2[nn-1]){
            nums1[mm + nn - 1] = nums1[mm-1]
            mm--
        }else{
            nums1[mm + nn - 1] = nums2[nn - 1]
            nn--
        }
    }

    while (nn>0){
        nums1[nn-1] = nums2[nn-1]
        nn--
    }
}

fun main() {
    println("Hello")
}