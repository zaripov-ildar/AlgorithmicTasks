package LeetCode.LongestZigZagPathinaBinaryTree_1372;

import LeetCode.TreeNode;

class Solution {
    private int result = 0;

    private void helper(TreeNode root, boolean isRight, int len) {
        if (root == null) return;
        result = Math.max(result, len);
        if (isRight) {
            helper(root.left, false, len + 1);
            helper(root.right, true, 1);
        } else {
            helper(root.left, false, 1);
            helper(root.right, true, len + 1);
        }
    }

    public int longestZigZag(TreeNode root) {
        helper(root, false, 0);
        helper(root, true, 0);
        return result;
    }
}