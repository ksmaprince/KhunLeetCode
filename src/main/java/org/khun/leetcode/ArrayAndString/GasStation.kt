package org.khun.leetcode.ArrayAndString

fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
    var totalGas = gas.sum()
    var totalCost = cost.sum()
    var tank = 0
    var start = 0

    if (totalGas < totalCost) return -1
    for (i in 0 until gas.size) {
        tank += (gas[i] - cost[i])
        if (tank < 0) {
            tank = 0
            start = i + 1
        }
    }
    return start
}

fun main() {
    val gas1 = intArrayOf(1, 2, 3, 4, 5)
    val cost1 = intArrayOf(3, 4, 5, 1, 2)
    println(canCompleteCircuit(gas1, cost1))

    val gas2 = intArrayOf(2, 3, 4)
    val cost2 = intArrayOf(3, 4, 3)
    println(canCompleteCircuit(gas2, cost2))
}