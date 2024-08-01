package org.khun.leetcode.LinkedList

/**
 * Leetcode 708. Insert into a Sorted Circular Linked List
 */

fun insert(head: Node?, insertVal: Int): Node?{
    val node = Node(insertVal)
    if (head == null){
        node.next = node
        return node
    }

    var cur = head
    while (cur?.next != head){
        if (cur!!.`val` <= insertVal && insertVal <= cur.next!!.`val`) break
        if (cur.`val` > cur.next!!.`val`){
            if (cur.`val`<= insertVal || insertVal <= cur.next!!.`val`) break
        }
        cur = cur.next
    }
    val tempNode = cur!!.next
    cur.next = node
    node.next = tempNode

    return head
}

fun main() {
    // Helper function to create a circular linked list from an array
    fun createCircularLinkedList(arr: IntArray): Node? {
        if (arr.isEmpty()) return null
        val head = Node(arr[0])
        var current = head
        for (i in 1 until arr.size) {
            current.next = Node(arr[i])
            current = current.next!!
        }
        current.next = head // Making it circular
        return head
    }

    // Helper function to print a circular linked list
    fun printCircularLinkedList(head: Node?, count: Int) {
        var current = head
        for (i in 0 until count) {
            if (current != null) {
                print("${current!!.`val`} -> ")
                current = current!!.next
            }
        }
        println("... (circular)")
    }

    // Example usage
    val arr = intArrayOf(3, 4, 1)
    val head = createCircularLinkedList(arr)

    println("Original circular list:")
    printCircularLinkedList(head, 6) // Printing more elements to show circular nature

    val insertVal = 2
    val newHead = insert(head, insertVal)

    println("Circular list after inserting $insertVal:")
    printCircularLinkedList(newHead, 6) // Printing more elements to show circular nature
}
