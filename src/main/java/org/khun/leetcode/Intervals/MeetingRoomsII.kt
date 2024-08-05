package org.khun.leetcode.Intervals

import java.util.PriorityQueue
import kotlin.math.min

/**
 * Leetcode 253.Meeting Room II
 */
fun minMeetingRooms(intervals: Array<IntArray>): Int{
//     if(intervals.isEmpty()) return 0
//
//     intervals.sortBy { it[0] }
//     val minHeap = PriorityQueue<Int>()
//
//     minHeap.add(intervals[0][1])
//
//     for (i in 1 until intervals.size){
//          if (intervals[i][0] >= minHeap.peek()) minHeap.poll()
//          minHeap.add(intervals[i][1])
//     }
//     return minHeap.size

     // 2nd Way
     if (intervals.isEmpty()) return 0

     intervals.sortBy { it[0] }
     var count = 1
     for (i in 1 until intervals.size){
          if (intervals[i][0] < intervals[i-1][1]) count++
     }
     return count
}

fun main() {
     val interval1 = arrayOf(intArrayOf(0, 30), intArrayOf(5, 10), intArrayOf(15, 20))
     println(minMeetingRooms(interval1))// 2

     val interval2 = arrayOf(intArrayOf(7, 10), intArrayOf(2, 4))
     println(minMeetingRooms(interval2))// 2
}