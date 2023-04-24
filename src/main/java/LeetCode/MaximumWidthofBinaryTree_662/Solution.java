package LeetCode.MaximumWidthofBinaryTree_662;

import LeetCode.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode, Integer> map = new HashMap<>();
        queue.offer(root);
        map.put(root, 1);
        int curW;
        int maxW = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int start = 0;
            int end = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == 0) start = map.get(node);
                if (i == size - 1) end = map.get(node);
                if (node.left != null) {
                    map.put(node.left, map.get(node) * 2);
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    map.put(node.right, map.get(node) * 2 + 1);
                    queue.offer(node.right);
                }
            }
            curW = end - start + 1;
            maxW = Math.max(curW, maxW);
        }
        return maxW;
    }
}