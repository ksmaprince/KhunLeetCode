package org.khun.leetcode.LinkedList

/**
 * 141. Linked List Cycle
 */
fun hasCycle(head: ListNode?): Boolean {
    if(head?.next == null) return false

    var slow = head
    var fast = head.next
    while (slow != fast){
        if (fast?.next == null) return false
        slow = slow?.next
        fast = fast.next?.next
    }
    return true
}

fun main() {
    // Helper function to create a linked list from an array with optional cycle
    fun createLinkedList(arr: IntArray, pos: Int): ListNode? {
        if (arr.isEmpty()) return null
        val head = ListNode(arr[0])
        var current = head
        val nodes = mutableListOf<ListNode>(head)

        for (i in 1 until arr.size) {
            val newNode = ListNode(arr[i])
            current.next = newNode
            current = newNode
            nodes.add(newNode)
        }

        if (pos >= 0) {
            current.next = nodes[pos]
        }

        return head
    }

    // Example usage
    val arr = intArrayOf(3, 2, 0, -4)
    val pos = 1  // Cycle starts at node with value 2
    val head = createLinkedList(arr, pos)

    val result = hasCycle(head)
    println("Has cycle: $result")
}
