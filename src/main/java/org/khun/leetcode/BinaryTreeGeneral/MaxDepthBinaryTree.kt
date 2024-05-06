package org.khun.leetcode.BinaryTreeGeneral

fun maxDepth(root: TreeNode): Int{
    if (root==null) return 0
    val leftDepth = maxDepth(root.left)
    val rightDepth = maxDepth(root.right)

    if (leftDepth>rightDepth) return leftDepth+1
    else return rightDepth+1
}

fun main() {

}