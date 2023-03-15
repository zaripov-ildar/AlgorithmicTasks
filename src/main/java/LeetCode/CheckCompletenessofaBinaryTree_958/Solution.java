package LeetCode.CheckCompletenessofaBinaryTree_958;

import LeetCode.TreeNode;

import java.util.BitSet;

class Solution {

    private boolean existsTheLeftNull = false;
    private int maxLevel = 0;

    public boolean isCompleteTree(TreeNode root) {
        //The number of nodes in the levels is in the range [1, 100]
        //means it has no more than 7 levels: 2^7 = 128 nodes
        BitSet levels = new BitSet(7);
        levels.set(0, 7);
        helper(root, levels, 0);
        if (existsTheLeftNull) {
            return false;
        }
//        Check whether zero nodes have been encountered at levels earlier than the lowest.
        boolean noNullBetweenLevels = true;
        for (int i = 0; i < maxLevel; i++) {
            noNullBetweenLevels &= levels.get(i);
        }
        return noNullBetweenLevels;
    }

    private void helper(TreeNode root, BitSet levels, int levelNumber) {
        if (existsTheLeftNull) return;
        if (root == null) {
            levels.set(levelNumber, false);
            return;
        }
        if (!levels.get(levelNumber)) {
            existsTheLeftNull = true;
            return;
        }
        maxLevel = Math.max(levelNumber, maxLevel);
        levelNumber++;
        helper(root.left, levels, levelNumber);
        helper(root.right, levels, levelNumber);
    }
}