package org.khun.leetcode.ArrayAndString

fun vowelStrings(words: Array<String>, queries: Array<IntArray>): IntArray {
    val vowel = "aeiou"
    var count = 0
    var prefix = IntArray(words.size + 1)
    var result = IntArray(queries.size)

    for ((i,word) in words.withIndex()){
        prefix[i + 1] = prefix[i] +
                if(vowel.contains(word.first()) && vowel.contains(word.last())) 1 else 0
    }

    for ((i, q) in queries.withIndex()){
        val (left, right) = q
        result[i] = prefix[right+1] - prefix[left]
    }
    return result
}

fun main() {
    val nums1 = arrayOf("aba","bcb","ece","aa","e")
    val queries1 = arrayOf(intArrayOf(0,2), intArrayOf(1,4), intArrayOf(1,1))
    println(vowelStrings(nums1, queries1).toList())

    val nums2 = arrayOf("a","e","i")
    val queries2 = arrayOf(intArrayOf(0, 2), intArrayOf(0, 1), intArrayOf(2,2))
    println(vowelStrings( nums2, queries2).toList())
}