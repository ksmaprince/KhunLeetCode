package org.khun.leetcode.Heap

import java.util.PriorityQueue

fun reorganizeString(s: String): String{
    val countMap = mutableMapOf<Char, Int>()

    for (ch in s) countMap[ch] = countMap.getOrDefault(ch, 0) + 1

    val maxHeap = PriorityQueue<Pair<Char, Int>>(
        compareByDescending { it.second }
    )

    for ((ch, freq) in countMap){
        maxHeap.offer(ch to freq)
    }
    val result = StringBuilder()
    var prev: Pair<Char, Int>? = null
    while (maxHeap.isNotEmpty()){
        val (ch, freq) = maxHeap.poll()
        result.append(ch)
        prev?.let {
            if(it.second>0) maxHeap.offer(it)
        }
        prev = ch to freq - 1
    }
    return if(result.length == s.length) result.toString() else ""
}

fun main() {
    val s1 = "aab"
    println(reorganizeString(s1))

    val s2 = "aaab"
    println(reorganizeString(s2))

    val s3 = "aaabc"
    println(reorganizeString(s3))
}