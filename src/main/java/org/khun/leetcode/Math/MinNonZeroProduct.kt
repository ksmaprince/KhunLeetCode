package org.khun.leetcode.Math

fun minNonZeroProduct(p: Int): Int {
    val MOD = 1_000_000_007L
    val maxVal = (1L shl p) - 1
    val pairsCount = (maxVal - 1) / 2
    val product = powMod(maxVal - 1, pairsCount, MOD)
    return (product * (maxVal % MOD) % MOD).toInt()
}

fun powMod(base: Long, exp: Long, mod: Long): Long {
    var result = 1L
    var b = base % mod
    var e = exp
    while (e > 0) {
        if (e % 2 == 1L) {
            result = (result * b) % mod
        }
        b = (b * b) % mod
        e /= 2
    }
    return result
}

fun main() {
    val p = 3
    println(minNonZeroProduct(p))  // Output: 1512
}