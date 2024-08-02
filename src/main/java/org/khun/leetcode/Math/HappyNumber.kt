package org.khun.leetcode.Math

/**
 * Leetcode 202. Happy Number
 */
fun isHappy(n: Int): Boolean {
    var num = n
    val seen = mutableSetOf<Int>()
    while (true) {
        var sum = 0
        while (num != 0) {
            val d = num % 10
            sum += (d * d)
            num /= 10
        }
        if (sum == 1) return true

        num = sum
        if (seen.contains(sum)) return false
        seen.add(sum)
    }
}

fun main() {
    val n1 = 19
    println(isHappy(19)) // Output: true

    val n2 = 2
    println(isHappy(2)) // Output: false
}