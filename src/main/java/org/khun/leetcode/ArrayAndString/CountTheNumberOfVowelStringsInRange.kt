package org.khun.leetcode.ArrayAndString
//Leetcode - 2586
fun vowelStrings(words:Array<String>, left: Int, right: Int): Int{
    val vowel = "aeiou"
    var count = 0
    for (i in left..right){
        if(vowel.contains(words[i].first()) && vowel.contains(words[i].last()))
            count++
    }
    return count
}

fun main(){
    val words1 = arrayOf("are","amy","u")
    val left1 = 0
    val right1 = 2
    println(vowelStrings(words1, left1, right1))

    val words2 = arrayOf("hey","aeo","mu","ooo","artro")
    val left2 = 1
    val right2 = 4
    println(vowelStrings(words2, left2, right2))
}