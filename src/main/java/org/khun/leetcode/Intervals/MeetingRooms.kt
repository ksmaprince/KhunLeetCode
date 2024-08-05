package org.khun.leetcode.Intervals

/**
 * Leetcode 252. MeetingRooms
 */

fun canAttendMeeting(intervals: Array<IntArray>): Boolean{

    intervals.sortBy { it[0] }

    for (i in 1 until intervals.size){
        if (intervals[i][0] < intervals[i - 1][1]) return false
    }
    return true
}

fun main() {
    val interval1 = arrayOf(intArrayOf(0, 30), intArrayOf(5, 10), intArrayOf(15, 20))
    println(canAttendMeeting(interval1))// false

    val interval2 = arrayOf(intArrayOf(7, 10), intArrayOf(2, 4))
    println(canAttendMeeting(interval2))// true

    val inteval3 = arrayOf(intArrayOf())
    println(canAttendMeeting( inteval3)) // true
}