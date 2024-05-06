package org.khun.leetcode.BinaryTreeGeneral;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return  null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
    public static void main(String[] args) {

    }
}
