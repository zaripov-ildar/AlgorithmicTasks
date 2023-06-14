package LeetCode.MinimumAbsoluteDifferenceinBST_530;

import LeetCode.TreeNode;

class Solution {
    private TreeNode any;
    private Integer res = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return res;
    }

    private void helper(TreeNode node) {
        if (node == null || res == 1) return;
        helper(node.left);

        if (any != null) {
            res = Math.min(res, node.val - any.val);
        }

        any = node;
        helper(node.right);
    }
}