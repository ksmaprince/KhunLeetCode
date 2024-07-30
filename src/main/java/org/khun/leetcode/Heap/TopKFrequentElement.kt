package org.khun.leetcode.Heap

import java.util.PriorityQueue

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val countMap = mutableMapOf<Int, Int>()
    for (n in nums) countMap[n] = countMap.getOrDefault(n, 0) + 1
    val minHeap = PriorityQueue<Pair<Int, Int>>(
        compareBy { it.second }
    )

    for ((n, freq) in countMap){
        minHeap.offer(n to freq)
        if (minHeap.size > k) minHeap.poll()
    }
    val result = IntArray(k)
    for (i in k-1 downTo 0) result[i] = minHeap.poll().first

    return result
}

fun main() {
    val nums1 = intArrayOf(1,1,1,2,2,3)
    val k1 = 2
    println(topKFrequent(nums1, k1).toList())

    val nums2 = intArrayOf(1)
    val k2 = 1
    println(topKFrequent(nums2, k2).toList())
}