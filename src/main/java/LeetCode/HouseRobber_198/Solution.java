package LeetCode.HouseRobber_198;

import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {

        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i + 1] = Math.max(nums[i] + dp[i - 1], dp[i]);
        }
        return dp[nums.length];
    }
//
//    int[] dp;
//
//    public int robRec(int[] rob) {
//        dp = new int[rob.length];
//        Arrays.fill(dp, -1);
//        return rec(rob, rob.length - 1);
//    }
//
//    private int rec(int[] rob, int i) {
//        if (i <0){
//            return 0;
//        }
//        if (dp[i] >= 0) {
//            return dp[i];
//        }
//        return dp[i] = Math.max(rob[i] + rec(rob, i - 2), rec(rob, i - 1));
//    }


}