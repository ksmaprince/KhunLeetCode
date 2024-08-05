package org.khun.leetcode.ArrayAndString

/**
 * Leetcode: 1823. Find the Winner of the Circular Game
 */

fun findTheWinner(n: Int, k: Int): Int {
    var winner = 0

    for (i in 1..n){
        winner = (winner + k) % i
    }

    return winner + 1
}

fun main() {
    println(findTheWinner(5, 2)) // Output: 3
    println(findTheWinner(6, 5)) // Output: 1
}