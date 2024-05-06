package org.khun.leetcode.BinaryTreeGeneral

fun isSymmetric(root: TreeNode?): Boolean{
    if (root == null) return true
    return isMirror(root.left, root.right)
}

fun isMirror(p: TreeNode?, q: TreeNode?) : Boolean{
    if (p == null && q == null) return true
    if (p == null || q == null) return false
    return p.`val` == q.`val` && isMirror(p.left, q.right) && isMirror(p.right, q.left)
}

fun main() {

}