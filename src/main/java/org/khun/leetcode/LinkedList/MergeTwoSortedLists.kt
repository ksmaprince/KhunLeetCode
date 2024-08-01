package org.khun.leetcode.LinkedList

/**
 * Leetcode: 21. Merge Two Sorted Lists
 */

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

    var l1 = list1
    var l2 = list2

    val dummy = ListNode(0)
    var cur = dummy

    while (l1 != null && l2 != null){
        if (l1.`val` < l2.`val`){
            cur.next = ListNode(l1.`val`)
            l1 = l1.next
        }else{
            cur.next = ListNode(l2.`val`)
            l2 = l2.next
        }
        cur = cur.next!!
    }
    if(l1 != null){
        cur.next = l1
    }
    if (l2 != null){
        cur.next = l2
    }
    return dummy.next
}

fun main() {
    // Helper function to create a linked list from an array
    fun createLinkedList(arr: IntArray): ListNode? {
        if (arr.isEmpty()) return null
        val head = ListNode(arr[0])
        var current = head
        for (i in 1 until arr.size) {
            current.next = ListNode(arr[i])
            current = current.next!!
        }
        return head
    }

    // Helper function to print a linked list
    fun printLinkedList(head: ListNode?) {
        var current = head
        while (current != null) {
            print("${current!!.`val`} -> ")
            current = current!!.next
        }
        println("null")
    }

    // Example usage
    val arr1 = intArrayOf(1, 2, 4)
    val arr2 = intArrayOf(1, 3, 4)
    val list1 = createLinkedList(arr1)
    val list2 = createLinkedList(arr2)

    println("List 1:")
    printLinkedList(list1)

    println("List 2:")
    printLinkedList(list2)

    val mergedList = mergeTwoLists(list1, list2)
    println("Merged List:")
    printLinkedList(mergedList)
}
