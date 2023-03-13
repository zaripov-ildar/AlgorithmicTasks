package LeetCode.SymmetricTree_101;

import LeetCode.TreeNode;

class Solution {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public boolean isSymmetric(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if (tree1 == null || tree2 == null) {
            return false;
        }
        return tree1.val == tree2.val
                && isSymmetric(tree1.right, tree2.left)
                && isSymmetric(tree1.left, tree2.right);
    }
}