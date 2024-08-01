package org.khun.leetcode.LinkedList

/**
 * Leetcode: 19. Remove Nth Node From End of List
 */

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val dummy = ListNode(0)
    dummy.next = head

    var first: ListNode? = dummy
    var second: ListNode? = dummy

    for (i in 0..n){
        first = first?.next
    }

    while (first != null){
        first = first.next
        second = second?.next
    }
    second?.next = second?.next?.next
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

    val n = 2
    val newHead = removeNthFromEnd(head, n)

    println("List after removing $n-th node from the end:")
    printLinkedList(newHead)
}



