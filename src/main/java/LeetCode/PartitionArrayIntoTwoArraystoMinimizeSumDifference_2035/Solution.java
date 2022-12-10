package LeetCode.PartitionArrayIntoTwoArraystoMinimizeSumDifference_2035;

import java.util.Arrays;

class Solution {
    private int minDiff;
    private int halfSize;
    private int halfArrSum;

//    Throws TLE on LeetCode😒

    public int minimumDifference(int[] nums) {
        minDiff = Integer.MAX_VALUE;
        halfSize = nums.length / 2;
        int arrSum = Arrays.stream(nums).sum();
        halfArrSum = arrSum / 2;
        helper(nums, 0, 0, 0);
        return 2 * minDiff + (arrSum % 2 == 0 ? 0 : 1);
    }

    private void helper(int[] nums, int sum, int amount, int index) {
        int currDiff = Math.abs(sum - halfArrSum);
        if (amount == halfSize) {
            minDiff = Math.min(currDiff, minDiff);
            return;
        }
        if (index > halfSize + amount) {
            return;
        }
        helper(nums, sum, amount, index + 1);
        helper(nums, sum + nums[index], amount + 1, index + 1);
    }
}