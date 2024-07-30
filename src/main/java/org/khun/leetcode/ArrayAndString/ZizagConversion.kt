package org.khun.leetcode.ArrayAndString

fun convert(s: String, numRows: Int): String {
    if(numRows == 1 || s.length < numRows) return s

    val rows = Array(numRows){StringBuilder()}
    var curRow = 0
    var direction = false

    for(ch in s){
        rows[curRow].append(ch)
        if(curRow == 0 || curRow == numRows-1) direction = !direction
        curRow += if(direction) 1 else -1
    }

    val result = StringBuilder()
    for(row in rows){
        result.append(row)
    }

    return result.toString()
}

fun main() {
    println(convert("PAYPALISHIRING", 3))
    println(convert("PAYPALISHIRING", 4))
    println(convert("AB", 1))
}