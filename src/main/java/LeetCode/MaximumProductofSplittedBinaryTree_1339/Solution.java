package LeetCode.MaximumProductofSplittedBinaryTree_1339;

//class Solution {
//    private long maxProd;
//
//    public int maxProduct(TreeNode root) {
//        long sum = calcSum(root);
//        maxProd = 0;
//        long totalSum = calcSum(root);
//        findMax(totalSum, root);
//        return mode(maxProd);
//
//    }
//
//    private int mode(long n) {
//        if (n >= 1_000_000_007) {
//            n %= 1_000_000_007;
//        }
//        return (int) n;
//    }
//
//    private long findMax(long totalSum, TreeNode node) {
//        if (node == null) return 0;
//        long lSum = findMax(totalSum, node.left);
//        long rSum = findMax(totalSum, node.right);
//        long currSum = node.val + lSum + rSum;
//        maxProd = Math.max(maxProd, (totalSum - currSum) * currSum);
//        return currSum;
//
//    }
//
//    private long calcSum(TreeNode node) {
//        if (node == null) return 0;
//        return node.val + calcSum(node.left) + calcSum(node.right);
//    }
//}

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<Long> sumList;
    private long mod = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        sumList = new ArrayList<>(50_001);
        long max = 0;
        long sum = calcSum(root);
        for (Long aLong : sumList) {
            max = Math.max(max, (sum - aLong) * aLong);
        }
        return (int) (max % mod);

    }

    private long calcSum(TreeNode node) {
        if (node == null) return 0;
        long sum = node.val + calcSum(node.left) + calcSum(node.right);
        sumList.add(sum);
        return sum;
    }
}




