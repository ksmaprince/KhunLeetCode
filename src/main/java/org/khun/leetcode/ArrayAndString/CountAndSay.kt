package org.khun.leetcode.ArrayAndString

/**
 * Leetcode: 38. Count and Say
 */

fun countAndSay(n: Int): String {
    if (n == 1) return "1"

    var result = "1"
    for (i in 2..n){
        result = getNextSequence(result)
    }
    return result
}

fun getNextSequence(seq: String) : String{
    var count = 1
    var say = seq[0]
    val sb = StringBuilder()
    for (i in 1 until seq.length){
        if (seq[i] == say) count++
        else{
            sb.append(count).append(say)
            say = seq[i]
            count = 1
        }
    }
    sb.append(count).append(say)
    return sb.toString()
}

fun main() {
    println(countAndSay(1)) // Output: "1"
    println(countAndSay(2)) // Output: "11"
    println(countAndSay(3)) // Output: "21"
    println(countAndSay(4)) // Output: "1211"
    println(countAndSay(5)) // Output: "111221"
}