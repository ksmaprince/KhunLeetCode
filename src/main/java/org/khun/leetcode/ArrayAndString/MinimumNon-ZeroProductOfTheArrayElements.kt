package org.khun.leetcode.ArrayAndString

/**
 * Leetcode ;
 * 1969. Minimum Non-Zero Product of the Array Elements
 */

fun secondsToRemoveOccurrences(s: String): Int {
    var seconds = 0
    var prefix = 0
    var prev = 0
    for ((i, ch) in s.withIndex()) {
        if (ch == '1') {
            seconds = maxOf(prev, i - prefix)
            prefix++
            if (seconds > 0) prev = seconds + 1
        }
    }
    return seconds
}

fun main() {
    val s1 = "0110101"
    println(secondsToRemoveOccurrences(s1)) // Output: 4

    val s2 = "11100"
    println(secondsToRemoveOccurrences(s2)) // Output: 0
}