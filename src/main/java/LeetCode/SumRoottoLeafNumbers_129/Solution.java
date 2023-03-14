package LeetCode.SumRoottoLeafNumbers_129;

import LeetCode.TreeNode;

class Solution {

    private int result;

    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return result;
    }

    private void helper(TreeNode root, int branchSum) {
        if (root == null) return;
        branchSum = 10 * branchSum + root.val;
        if (root.left == null && root.right == null) {
            result += branchSum;
            return;
        }
        helper(root.right, branchSum);
        helper(root.left, branchSum);
    }
}