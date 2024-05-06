package org.khun.leetcode.BinaryTreeGeneral

fun isSameTree(p: TreeNode, q: TreeNode): Boolean{
    if (p == null && q == null) return true
    if (p == null || q==null) return false
    return p.`val` == q.`val` && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
}
fun main() {

}