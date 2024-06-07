package org.khun.leetcode.ArrayAndString

fun longestCommonPrefix(strs: Array<String>): String {
    strs.sort()
    var i = 0
    while (i<strs.first().length && i<strs.last().length && strs.first()[i] == strs.last()[i]) i++
    return strs.first().substring(0, i)
}

fun main() {
    val strs1 = arrayOf("flower", "flow", "flight")
    println(longestCommonPrefix(strs1)) // Output: "fl"

    val strs2 = arrayOf("dog", "racecar", "car")
    println(longestCommonPrefix(strs2))
}