package LeetCode.MinimumAverageDifference_2256;

class Solution {
    public int minimumAverageDifference(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 0;
        }
        long[] sum = new long[len];
        sum[0] = nums[0];
        for (int i = 1; i < len; i++) {
            sum[i] = nums[i] + sum[i - 1];
        }
        long minDiff = Long.MAX_VALUE;
        int id = -1;
        for (int i = 0; i < len - 1; i++) {
            long avgDiff = Math.abs(sum[i] / (i + 1) - (sum[len - 1] - sum[i]) / (len - i - 1));
            if (minDiff > avgDiff) {
                minDiff = avgDiff;
                id = i;
            }
        }
        if (minDiff > sum[len - 1] / len) {
            return len - 1;
        }
        return id;
    }
}
