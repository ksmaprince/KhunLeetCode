package org.khun.leetcode.TwoDimensionDynamicProgramming

/**
 * Leetcode: 221. Maximal Square
 */

fun maximalSquare(matrix: Array<CharArray>): Int {
    if (matrix.isEmpty() || matrix[0].isEmpty()) return 0

    val rows = matrix.size
    val cols = matrix[0].size
    val DP = Array(rows){IntArray(cols)}
    var maxSide = 0

    for (r in 0 until rows){
        for (c in 0 until cols){
            if (matrix[r][c] == '1'){
                if (r == 0 || c == 0) DP[r][c] = 1
                else DP[r][c] = minOf(DP[r-1][c], DP[r][c-1], DP[r-1][c-1]) + 1
                maxSide = maxOf(maxSide, DP[r][c])
            }
        }
    }
    return maxSide * maxSide
}

// Test the function
fun main() {
    val matrix1 = arrayOf(
        charArrayOf('1', '0', '1', '0', '0'),
        charArrayOf('1', '0', '1', '1', '1'),
        charArrayOf('1', '1', '1', '1', '1'),
        charArrayOf('1', '0', '0', '1', '0')
    )
    println(maximalSquare(matrix1)) // Output: 4

    val matrix2 = arrayOf(
        charArrayOf('0', '1'),
        charArrayOf('1', '0')
    )
    println(maximalSquare(matrix2)) // Output: 1

    val matrix3 = arrayOf(
        charArrayOf('0')
    )
    println(maximalSquare(matrix3)) // Output: 0
}