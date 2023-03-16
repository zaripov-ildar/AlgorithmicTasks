package LeetCode.ConstructBinaryTreefromInorderandPostorderTraversal_106;

import LeetCode.TreeNode;

import java.util.HashMap;

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < postorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }

    private TreeNode helper(int[] inorder, int iLeft, int iRight, int[] postorder, int pLeft, int pRight, HashMap<Integer, Integer> map) {
        if (iLeft > iRight || pLeft > pRight) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[pRight]);

        int inorderRootIndex = map.get(root.val);

        int leftSubTreeSize = inorderRootIndex - iLeft;
        int rightSubTreeSize = iRight - inorderRootIndex;
        root.left = helper(
                inorder,
                iLeft, inorderRootIndex - 1,
                postorder,
                pLeft, pLeft + leftSubTreeSize - 1,
                map);
        root.right = helper(
                inorder,
                inorderRootIndex + 1, iRight,
                postorder,
                pRight - rightSubTreeSize, pRight - 1,
                map);
        return root;
    }
}