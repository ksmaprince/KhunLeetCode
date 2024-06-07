package org.khun.leetcode.ArrayAndString

fun convert(s: String, numRows: Int): String {
    if (numRows == 1 || s.length < numRows) return s

    val arr = Array(numRows) { StringBuilder() }
    for (i in arr.indices) arr[i] = StringBuilder()

    var direction = false
    var count = 0

    for (i in s.indices) {
        arr[count].append(s[i])
        if (count == 0 || count == numRows - 1) direction = !direction
        if (direction) count++ else count--
    }

    val result = StringBuilder()
    for (i in arr.indices) result.append(arr[i])

    return result.toString()
}

fun main() {
    println(convert("PAYPALISHIRING", 3))
    println(convert("PAYPALISHIRING", 4))
    println(convert("A", 1))
}