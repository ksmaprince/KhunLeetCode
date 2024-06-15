package org.khun.leetcode.HashMap

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = HashMap<String,MutableList<String>>()
    for (s in strs){
        val chars = s.toCharArray()
        chars.sort()
        val str = String(chars)
        if (!map.containsKey(str)){
            map[str] = arrayListOf()
        }
        map[str]?.add(s)
    }
    return ArrayList(map.values)
}

fun main() {
    val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    println(groupAnagrams(input).toString())
}