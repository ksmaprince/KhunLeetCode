package org.khun.leetcode.ArrayAndString

/**
 * 1328. Break a Palindrome
 */

fun breakPalindrome(palindrome: String): String {
    val n = palindrome.length
    if (n == 1) return ""
    val chars = palindrome.toCharArray()

    for (i in 0 until n / 2) {
        if (chars[i] != 'a') {
            chars[i] = 'a'
            return String(chars)
        }
    }
    chars[n - 1] = 'b'
    return String(chars)
}

fun main() {
    println(breakPalindrome("abccba")) // Output: "aaccba"
    println(breakPalindrome("a"))      // Output: ""
}