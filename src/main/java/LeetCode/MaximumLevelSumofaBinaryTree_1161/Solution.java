package LeetCode.MaximumLevelSumofaBinaryTree_1161;

import LeetCode.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Integer> map;

    public int maxLevelSum(TreeNode root) {
        map = new HashMap<>();
        helper(root, 1);
        int max = Integer.MIN_VALUE;
        int lvl = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                lvl = entry.getKey();
            }
        }
        return lvl;
    }

    private void helper(TreeNode root, int lvl) {
        if (root == null) return;
        if (!map.containsKey(lvl)) {
            map.put(lvl, 0);
        }
        map.put(lvl, map.get(lvl) + root.val);
        helper(root.left, lvl + 1);
        helper(root.right, lvl + 1);
    }
}