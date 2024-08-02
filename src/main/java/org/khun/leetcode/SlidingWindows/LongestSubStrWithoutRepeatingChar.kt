package org.khun.leetcode.SlidingWindows

/**
 * LeetCode 3. Longest Substring Without Repeating Characters
 */
fun lengthOfLongestSubstring(s: String): Int {
    val seen = mutableSetOf<Char>()
    var index = 0
    var len = 0
    for (ch in s) {
        while (seen.contains(ch)) {
            seen.remove(s[index++])
        }
        seen.add(ch)
        len = maxOf(len, seen.size)
    }
    return len
}

fun main() {
    val s1 = "abcabcbb"
    println(lengthOfLongestSubstring(s1))

    val s2 = "bbbbb"
    println(lengthOfLongestSubstring(s2))

    val s3 = "pwwkew"
    println(lengthOfLongestSubstring(s3))
}