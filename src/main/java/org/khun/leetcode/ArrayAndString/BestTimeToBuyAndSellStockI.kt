package org.khun.leetcode.ArrayAndString

fun maxProfix(prices: IntArray): Int{
    var minPrice = Int.MAX_VALUE
    var maxProfix = 0

    for(price in prices){
        if(price < minPrice) minPrice = price
        val profit = price - minPrice
        if (profit > maxProfix) maxProfix = profit
    }
    return maxProfix
}

fun main(){
    val prices1 = intArrayOf(7,1,5,3,6,4)
    println(maxProfix(prices1))

    val prices2 = intArrayOf(7,6,4,3,1)
    println(maxProfix(prices2))
}