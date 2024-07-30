package org.khun.leetcode.Heap

import java.util.PriorityQueue

fun findKthLargest(nums: IntArray, k: Int): Int {
    val minHeap = PriorityQueue<Int>()

    for(n in nums){
        minHeap.offer(n)
        if (minHeap.size > k) minHeap.poll()
    }

    return minHeap.poll()
}

fun main() {
    val nums1 = intArrayOf(3,2,1,5,6,4)
    val k1 = 2
    println(findKthLargest(nums1, k1))

    val nums2 = intArrayOf(3,2,3,1,2,4,5,5,6)
    val k2 = 4
    println(findKthLargest(nums2, k2))
}