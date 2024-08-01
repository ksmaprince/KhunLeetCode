package org.khun.leetcode.LinkedList

/**
 *  LeetCode 206. Reverse Linked List
 */
fun reverseList(head: ListNode?): ListNode? {
    var prev : ListNode? = null
    var cur = head

    while (cur != null){
        val tempNode = cur.next
        cur.next = prev
        prev = cur
        cur = tempNode
    }
    return prev
}

fun main() {
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

    val reversedHead = reverseList(head)
    println("Reversed list (iterative):")
    printLinkedList(reversedHead)
}