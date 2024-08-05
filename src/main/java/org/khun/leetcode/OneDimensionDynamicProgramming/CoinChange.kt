package org.khun.leetcode.OneDimensionDynamicProgramming

/*
Leetcode: 322. Coin Change
 */
fun coinChange(coins: IntArray, amount: Int): Int {
    val DP = IntArray(amount + 1) { amount + 1 }
    DP[0] = 0

    for (i in 1..amount) {
        for (coin in coins) {
            if (i - coin >= 0) {
                DP[i] = minOf(DP[i], DP[i - coin] + 1)
            }
        }
    }
    return if (DP[amount] == amount + 1) -1 else DP[amount]
}

fun main() {
    val coins1 = intArrayOf(1, 2, 5)
    val amount1 = 11
    println(coinChange(coins1, amount1))

    val coin2 = intArrayOf(2)
    val amount2 = 3
    println(coinChange(coin2, amount2))

    val coin3 = intArrayOf(1)
    val amount3 = 0
    println(coinChange(coin3, amount3))
}