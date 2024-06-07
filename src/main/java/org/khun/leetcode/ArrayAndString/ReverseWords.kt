package org.khun.leetcode.ArrayAndString

fun reverseWords(s: String): String {
    return s.trim().split("\\s+".toRegex()).reversed().joinToString(" ")
}

fun main() {
    println(reverseWords("the sky is blue")) // Output: "blue is sky the"
    println(reverseWords("  hello world  ")) // Output: "world hello"
    println(reverseWords("a good   example"))
}