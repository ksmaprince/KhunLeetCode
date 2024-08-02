package org.khun.leetcode.Graph

/**
 * Leetcode: 200. Number of Islands
 */

fun numIslands(grid: Array<CharArray>): Int {
    val rows = grid.size
    val cols = grid[0].size
    var numIsland = 0

    fun dfs(grid: Array<CharArray>, r: Int, c: Int) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == '0') return

        grid[r][c] = '0'

        dfs(grid, r - 1, c)
        dfs(grid, r + 1, c)
        dfs(grid, r, c - 1)
        dfs(grid, r, c + 1)
    }

    for (r in 0 until rows) {
        for (c in 0 until cols) {
            if (grid[r][c] == '1') {
                numIsland++
                dfs(grid, r, c)
            }
        }
    }
    return numIsland
}

fun main() {
    val grid1 = arrayOf(
        charArrayOf('1', '1', '1', '1', '0'),
        charArrayOf('1', '1', '0', '1', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '0', '0', '0')
    )
    println(numIslands(grid1)) // Output 1

    val grid2 = arrayOf(
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '1', '0', '0'),
        charArrayOf('0', '0', '0', '1', '1')
    )

    println(numIslands(grid2)) // Output: 3
}