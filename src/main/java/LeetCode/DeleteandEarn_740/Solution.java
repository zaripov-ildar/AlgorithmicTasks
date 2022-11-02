package LeetCode.DeleteandEarn_740;

class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] dp = new int[10_001];
        for (int num : nums) {
            dp[num] += num;
        }
        int first = 0;
        int second = 0;
        for (int i : dp) {
            int temp = Math.max(i + first, second);
            first = second;
            second = temp;
        }
        return second;
    }
}
