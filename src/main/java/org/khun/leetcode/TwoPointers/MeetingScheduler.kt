package org.khun.leetcode.TwoPointers

fun minAvailableDuration(slots1: Array<IntArray>, slots2: Array<IntArray>, duration: Int): List<Int>{
    slots1.sortBy { it[0] }
    slots2.sortBy { it[0] }
    var i = 0
    var j = 0
    while (i < slots1.size && j < slots2.size){
        val start = maxOf(slots1[i][0], slots2[j][0])
        val end = minOf(slots1[i][1], slots2[j][1])
        if(end - start >= duration) return listOf(start, start+duration)

        if(slots1[i][1] < slots2[j][1]){
            i++
        }else {
            j++
        }
    }
    return listOf()
}
fun main() {
    val slots1 = arrayOf(intArrayOf(10, 50), intArrayOf(60, 120), intArrayOf(140, 210))
    val slots2 = arrayOf(intArrayOf(0, 15), intArrayOf(60, 70))
    val duration1 = 8
    println(minAvailableDuration(slots1, slots2, duration1))

    val slots3 = arrayOf(intArrayOf(10,50), intArrayOf(60, 120), intArrayOf(140, 210))
    val slots4 = arrayOf(intArrayOf(0, 15), intArrayOf(60, 70))
    val duration2 = 12
    println(minAvailableDuration(slots3, slots4, duration2))
}