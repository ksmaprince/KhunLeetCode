package org.khun.leetcode.SlidingWindows

fun lengthOfLongestSubstring(s: String): Int{
    val charSet = HashSet<Char>()
    var left = 0
    var maxLength = 0
    for (right in 0 until s.length){
        while (charSet.contains(s[right])){
            charSet.remove(s[left])
            left++
        }
        charSet.add(s[right])
        maxLength = Math.max(maxLength,charSet.size)
    }
    return maxLength
}

fun main() {

}