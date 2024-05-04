package org.khun.leetcode.TwoPointers

fun isPalindrome(s: String): Boolean {
    if (s.isNullOrEmpty()) return true;
    val str = s.lowercase().replace(Regex("[^a-z0-9]"), "")
    var left = 0
    var right = str.length - 1
    while (left < right) {
        if (str[left] != str[right]) return false
        left++
        right--
    }
    return true
}

fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
    println(isPalindrome("race a car"))
    println(isPalindrome(" "))
}

