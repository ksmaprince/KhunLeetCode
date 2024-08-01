package org.khun.leetcode.Math

fun findInteger(k: Int, digit1: Int, digit2: Int): Int{
    val min = minOf(digit1, digit2)
    val max = maxOf(digit1, digit2)

    val queue = ArrayDeque<Int>().apply {
        if (min != max){
            add(min)
            add(max)
        }else{
            add(min)
        }
    }

    while (queue.isNotEmpty()){
        val cur = queue.removeFirst()
        if(cur == 0 || cur > Int.MAX_VALUE) continue
        if (cur > k && cur%k == 0){
            return cur
        }
        queue.add(cur * 10 + min)
        if (min != max){
            queue.add(cur * 10 + max)
        }
    }
    return -1
}

fun main() {
    val k1 = 2
    val digit1 = 0
    val digit2 = 2
    println(findInteger(k1, digit1, digit2))
}