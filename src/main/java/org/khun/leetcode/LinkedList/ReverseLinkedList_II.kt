package org.khun.leetcode.LinkedList

/**
 * Leetcode: 92. Reverse Linked List II
 */

fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
    val dummy = ListNode(0)
    dummy.next = head
    var PRE = dummy
    for (i in 1 until left){
        PRE = PRE.next!!
    }
    var CUR = PRE.next
    for (i in left until right){
        val NEXT = CUR?.next
        CUR?.next = NEXT?.next
        NEXT?.next = PRE.next
        PRE.next = NEXT
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
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val head = createLinkedList(arr)

    println("Original list:")
    printLinkedList(head)

    val left = 2
    val right = 4
    val reversedHead = reverseBetween(head, left, right)

    println("Reversed list between position $left and $right:")
    printLinkedList(reversedHead)
}
