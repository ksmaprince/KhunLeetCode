package org.khun.leetcode.Stack

/*
Leetcode: 155. Min Stack
 */
class MinStack {
    private val stack = mutableListOf<Int>()
    private val minStack = mutableListOf<Int>()

    fun push(`val`: Int) {
        stack.add(`val`)
        if (minStack.isEmpty() || `val` <= minStack.last())
            minStack.add(`val`)
    }

    fun pop() {
        val removeElement = stack.removeLast()
        if (removeElement == minStack.last())
            minStack.removeLast()
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
}

fun main() {
    val minStack = MinStack()
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    println(minStack.getMin()) // return -3
    minStack.pop()
    println(minStack.top())    // return 0
    println(minStack.getMin()) // return -2
}