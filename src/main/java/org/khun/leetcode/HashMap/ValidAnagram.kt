package org.khun.leetcode.HashMap

fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length) return false

    val map = mutableMapOf<Char, Int>()
    for(ch in s){
        map[ch] = map.getOrDefault(ch, 0) + 1
    }

    for (ch in t){
        if(!map.containsKey(ch) || map[ch] == 0) return false
        map[ch] = map[ch]!! - 1
    }
    return true
}
fun main(){
    val s1 = "anagram"
    val t1 = "nagaram"
    println(isAnagram(s1, t1))

    val s2 = "rat"
    val t2 = "car"
    println(isAnagram(s2, t2))
}