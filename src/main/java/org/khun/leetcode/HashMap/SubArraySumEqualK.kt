package org.khun.leetcode.HashMap
fun subarraySum(nums: IntArray, k: Int) : Int{
    val map = mutableMapOf<Int, Int>()
    map[0] = 1
    var count = 0
    var sum = 0

    for (n in nums){
        sum += n
        if(map.containsKey(sum - k))
            count += map.getOrDefault(sum - k, 0)
        map[sum] = map.getOrDefault(sum, 0) + 1
    }
    return count
}

fun main() {
    val nums1 = intArrayOf(1,1,1)
    val k1 = 2
    println(subarraySum(nums1, k1))

    val nums2 = intArrayOf(1,2, 3)
    val k2 = 3
    println(subarraySum(nums2, k2))
}

