package LeetCode.HouseRobberII_213;

class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        return Math.max(rob(nums, 0, len - 1), rob(nums, 1, len));
    }

    private int rob(int[] nums, int start, int end) {
        int first = 0;
        int second = 0;
        for (int i = start; i < end; i++) {
            int sum = Math.max(nums[i] + first, second);
            first = second;
            second = sum;
        }
        return second;
    }
}
