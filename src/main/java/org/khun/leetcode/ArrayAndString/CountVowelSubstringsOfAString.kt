package org.khun.leetcode.ArrayAndString

fun countVowelSubStrings(word: String): Int {
    val vowel = "aeiou"
    var count = 0
    for(i in word.indices){
        val seen = mutableSetOf<Char>()
        for (j in i until word.length) {
            if (!vowel.contains(word[j])) break
            seen.add(word[j])
            if (seen.size == 5) count++
        }
    }
    return count
}

fun main() {
    val word1 = "aeiouu"
    println(countVowelSubStrings(word1))

    val word2 = "unicornarihan"
    println(countVowelSubStrings(word2))

    val word3 = "cuaieuouac"
    println(countVowelSubStrings(word3))
}