package org.khun.leetcode.LinkedList

class LRUCache(capacity: Int) {
    /**
     * Using Queue
     */
//    private val capacity = capacity
//    private val cache = mutableMapOf<Int, Int>()
//    private val queue = ArrayDeque<Int>()
//
//    fun get(key: Int): Int{
//        val value = cache[key]
//        if (value != null){
//            queue.remove(key)
//            queue.addFirst(key)
//            return value
//        }
//        else return -1
//    }
//
//    fun put(key: Int, value: Int){
//        val data = cache[key]
//        if(data == null){
//            cache[key] = value
//            queue.addFirst(key)
//            if(cache.size > capacity){
//                val k =queue.removeLast()
//                cache.remove(k)
//            }
//        }else{
//            queue.remove(key)
//            queue.addFirst(key)
//            cache[key] = value
//        }
//    }

    /**
     * Using Doubly Linked List
     */
    class Node(val key: Int, var value: Int) {
        var prev: Node? = null
        var next: Node? = null
    }

    private val capacity = capacity
    private val head = Node(0, 0)
    private val tail = Node(0, 0)
    private val cache = mutableMapOf<Int, Node>()

    init {
        head.next = tail
        tail.prev = head
    }

    private fun addFirst(node: Node) {
        node.next = head.next
        node.prev = head
        head.next!!.prev = node
        head.next = node
    }

    private fun deleteNode(node: Node) {
        val PRE = node.prev
        val NEXT = node.next
        PRE!!.next = NEXT
        NEXT!!.prev = PRE
    }

    private fun deleteLast(): Node {
        val lastNode = tail.prev
        deleteNode(lastNode!!)
        return lastNode
    }

    private fun moveToFirst(node: Node) {
        deleteNode(node)
        addFirst(node)
    }

    fun get(key: Int): Int {
        val node = cache[key] ?: return -1
        moveToFirst(node)
        return node.value
    }

    fun put(key: Int, value: Int) {
        val node = cache[key]
        if (node == null) {
            val newNode = Node(key, value)
            addFirst(newNode)
            cache[key] = newNode
            if (cache.size > capacity) {
                val lastNode = deleteLast()
                cache.remove(lastNode.key)
            }
        } else {
            node.value = value
            moveToFirst(node)
        }
    }
}

fun main() {
    val lruCache = LRUCache(2)
    lruCache.put(1, 1) // cache is {1=1}
    lruCache.put(2, 2) // cache is {1=1, 2=2}
    println(lruCache.get(1)) // returns 1
    lruCache.put(3, 3) // evicts key 2, cache is {1=1, 3=3}
    println(lruCache.get(2)) // returns -1 (not found)
    lruCache.put(4, 4) // evicts key 1, cache is {4=4, 3=3}
    println(lruCache.get(1)) // returns -1 (not found)
    println(lruCache.get(3)) // returns 3
    println(lruCache.get(4)) // returns 4
}