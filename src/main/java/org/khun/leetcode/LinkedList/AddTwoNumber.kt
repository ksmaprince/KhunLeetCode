import org.khun.leetcode.LinkedList.ListNode
// Leetcode : 2. Add Two Numbers
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var L1 = l1
    var L2 = l2
    val head = ListNode(0)
    var cur = head
    var carry = 0

    while (L1 != null || L2 != null) {
        val x = L1?.`val` ?: 0
        val y = L2?.`val` ?: 0
        val r = (carry + x + y) % 10
        carry = (carry + x + y) / 10

        cur.next = ListNode(r)
        cur = cur.next!!

        L1 = L1?.next
        L2 = L2?.next
    }
    if(carry > 0){
        cur.next = ListNode(carry)
        cur = cur.next!!
    }
    return head.next
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
    val arr1 = intArrayOf(2, 4, 3)
    val arr2 = intArrayOf(5, 6, 4)
    val l1 = createLinkedList(arr1)
    val l2 = createLinkedList(arr2)

    println("List 1:")
    printLinkedList(l1)

    println("List 2:")
    printLinkedList(l2)

    val result = addTwoNumbers(l1, l2)
    println("Sum:")
    printLinkedList(result)
}
