package org.khun.leetcode.BackTracking

/**
 * Leetcode: 39. Combination Sum
 */

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val combination = mutableListOf<Int>()
    getCombinations(candidates, target, 0, combination, result)
    return result
}

fun getCombinations(
    candidates: IntArray,
    target: Int,
    start: Int,
    combination: MutableList<Int>,
    result: MutableList<List<Int>>
) {
    if (target == 0) {
        result.add(ArrayList(combination))
        return
    }
    if (target < 0) {
        return
    }
    for (i in start until candidates.size) {
        combination.add(candidates[i])
        getCombinations(candidates, target - candidates[i], i, combination, result)
        combination.removeLast()
    }
}

fun main() {
    println(combinationSum(intArrayOf(2, 3, 6, 7), 7))  // Output: [[2, 2, 3], [7]]
    println(combinationSum(intArrayOf(2, 3, 5), 8))     // Output: [[2, 2, 2, 2], [2, 3, 3], [3, 5]]
    println(combinationSum(intArrayOf(2), 1))           // Output: []
}