package org.khun.leetcode.ArrayAndString

fun strStr(haystack: String, needle: String): Int {
    val end = needle.length
    for (i in 0..haystack.length-end){
        if(haystack.substring(i, i+end)==needle) return i
    }
    return -1
}

fun main() {
    println(strStr("sadbutsad", "sad"))
    println(strStr("leetcode", "leeto"))
}