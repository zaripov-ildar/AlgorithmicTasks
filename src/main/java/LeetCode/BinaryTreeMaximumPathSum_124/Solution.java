package LeetCode.BinaryTreeMaximumPathSum_124;

import LeetCode.MaximumProductofSplittedBinaryTree_1339.TreeNode;

class Solution {
//    private int max;
//
//    public int maxPathSum(TreeNode root) {
//        max = Integer.MIN_VALUE;
//        helper(root);
//        return max;
//    }
//
//    private int helper(TreeNode node) {
//        if (node == null) return 0;
//        int leftSum = Math.max(helper(node.left), 0);
//        int rightSum = Math.max(helper(node.right), 0);
//        max = Math.max(max, node.val + leftSum + rightSum);
//        return node.val + Math.max(leftSum, rightSum);
//    }

    private class Node {
        int branch;
        int head;

        public Node(int branch, int head) {
            this.branch = branch;
            this.head = head;
        }
    }

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root).head;
    }

    public Node helper(TreeNode root) {
        if (root == null) {
            return new Node(0, Integer.MIN_VALUE);
        }
        Node left = helper(root.left);
        Node right = helper(root.right);
        int branch = root.val + Math.max(0, Math.max(left.branch, right.branch));
        int head = Math.max(root.val + left.branch + right.branch,
                Math.max(branch, Math.max(left.head, right.head)));
        return new Node(branch, head);
    }
}
