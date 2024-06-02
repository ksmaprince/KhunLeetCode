fun removeDuplicates(nums: IntArray): Int {
    var index = 0
    for (i in 0 until nums.size) {
        if (index < 2 || nums[index - 2] != nums[i]) nums[index++] = nums[i]
    }
    return index
}

fun main() {
    val nums1 = intArrayOf(1, 1, 1, 2, 2, 3)
    val k1: Int = removeDuplicates(nums1)
    println(k1) // Output should be 5
    for (i in 0 until k1) {
        print(nums1[i].toString() + " ") // Output should be [1, 1, 2, 2, 3]
    }
    println()

    val nums2 = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
    val k2: Int = removeDuplicates(nums2)
    println(k2) // Output should be 7
    for (i in 0 until k2) {
        print(nums2[i].toString() + " ") // Output should be [0, 0, 1, 1, 2, 3, 3]
    }
    println()
}