package org.khun.leetcode.LinkedList

/**
 * Leetcode: 138. Copy List with Random Pointer
 */

fun copyRandomList(node: Node?): Node? {
    val map = mutableMapOf<Node, Node>()

    var cur = node
    while (cur != null) {
        map[cur] = Node(cur.`val`)
        cur = cur.next
    }

    cur = node
    while (cur != null) {
        map[cur]!!.next = map[cur.next]
        map[cur]!!.random = map[cur.random]
        cur = cur.next
    }
    return map[node]
}

fun main() {
    // Helper function to print a linked list
    fun printLinkedList(head: Node?) {
        var current = head
        while (current != null) {
            val randomVal = current.random?.`val`?.toString() ?: "null"
            println("Node val: ${current.`val`}, Random val: $randomVal")
            current = current.next
        }
    }

    // Example usage
    val node1 = Node(1)
    val node2 = Node(2)
    node1.next = node2
    node1.random = node2
    node2.random = node2

    println("Original list:")
    printLinkedList(node1)

    val copiedList = copyRandomList(node1)
    println("Copied list:")
    printLinkedList(copiedList)
}
