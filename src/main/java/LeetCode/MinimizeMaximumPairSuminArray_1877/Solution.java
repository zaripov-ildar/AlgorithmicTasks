package LeetCode.MinimizeMaximumPairSuminArray_1877;

import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int max = Integer.MIN_VALUE;
        while (left < right) {
            max = Math.max(nums[left++] + nums[right--], max);
        }
        return max;
    }
}