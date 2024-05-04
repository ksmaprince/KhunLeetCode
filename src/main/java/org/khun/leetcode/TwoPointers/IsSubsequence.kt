package org.khun.leetcode.TwoPointers

fun isSubsequence(s: String, t: String): Boolean {
    var pointerS = 0
    var pointerT = 0

    while (pointerS<s.length && pointerT<t.length){
        if (s[pointerS] == t[pointerT]) pointerS++
        pointerT++
    }
    return pointerS == s.length
}

fun main() {
    println(isSubsequence("abc", "ahbgdc"))
    println(isSubsequence("axc", "ahbgdc"))
    println(isSubsequence("bb", "ahbgdc"))
    println(isSubsequence("ab", "baab"))
}