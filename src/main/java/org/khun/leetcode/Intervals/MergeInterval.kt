package org.khun.leetcode.Intervals

fun merge(intervals: Array<IntArray>): Array<IntArray>{
    if(intervals.isEmpty()) return arrayOf()

    intervals.sortBy { it[0] }

    val mergeInterval = mutableListOf<IntArray>()
    var curInterval = intervals[0]
    for (interval in intervals){
        if(interval[0] <= curInterval[1]){
            curInterval[1] = maxOf(interval[1], curInterval[1])
        }else{
            mergeInterval.add(curInterval)
            curInterval = interval
        }
    }
    mergeInterval.add(curInterval)
    return mergeInterval.toTypedArray()
}

fun main() {
    val testCases = arrayOf(
        arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)), // Normal case
        arrayOf(intArrayOf(1, 4), intArrayOf(4, 5)), // Edge case where intervals touch
        arrayOf(intArrayOf(1, 10), intArrayOf(2, 6), intArrayOf(8, 10)), // Contained intervals
        arrayOf(intArrayOf(1, 4), intArrayOf(5, 6)), // Non-overlapping intervals
        arrayOf(intArrayOf(1, 4), intArrayOf(2, 3)), // Fully overlapping interval
        arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6)), // Completely non-overlapping intervals
        arrayOf(intArrayOf(1, 4), intArrayOf(0, 4)), // Overlapping intervals with one starting before
        arrayOf(intArrayOf(1, 4)), // Single interval
        arrayOf<IntArray>(), // Empty input
        arrayOf(intArrayOf(1, 4), intArrayOf(0, 2), intArrayOf(3, 5)) // Multiple overlaps
    )

    for (testCase in testCases) {
        val result = merge(testCase)
        println("Merged intervals:")
        result.forEach { interval -> println("[${interval[0]}, ${interval[1]}]") }
        println()
    }
}