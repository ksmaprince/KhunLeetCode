package org.khun.leetcode.BackTracking

/**
 * Leetcode: 79. Word Search
 */

fun exist(board: Array<CharArray>, word: String): Boolean {
    if (board.isEmpty() || board[0].isEmpty()) return false

    val rows = board.size
    val cols = board[0].size

    fun dfs(r: Int, c: Int, index: Int): Boolean {
        if (index == word.length) return true

        if (r < 0 || r >= rows || c < 0 || c >= cols || board[r][c] != word[index])
            return false

        val temp = board[r][c]
        board[r][c] = '#'

        val found = dfs(r - 1, c, index + 1) ||
                dfs(r + 1, c, index + 1) ||
                dfs(r, c - 1, index + 1) ||
                dfs(r, c + 1, index + 1)

        board[r][c] = temp
        return found
    }

    for (r in 0 until rows) {
        for (c in 0 until cols) {
            if (dfs(r, c, 0)) return true
        }
    }
    return false
}

fun main() {
    val board = arrayOf(
        charArrayOf('A', 'B', 'C', 'E'),
        charArrayOf('S', 'F', 'C', 'S'),
        charArrayOf('A', 'D', 'E', 'E')
    )
    val word1 = "ABCCED"
    val word2 = "SEE"
    val word3 = "ABCB"

    println(exist(board, word1)) // Output: true
    println(exist(board, word2)) // Output: true
    println(exist(board, word3)) // Output: false
}