package LeetCode.MaximumValueofKCoinsFromPiles_2218;

import java.util.List;

class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int amount = piles.size();

        int[][] dp = new int[amount + 1][k + 1];

        for (int i = 1; i <= amount; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = dp[i - 1][j];
                List<Integer> pile = piles.get(i - 1);
                int coinSum = 0;
                for (int l = 0; l < Math.min(pile.size(), j); l++) {
                    coinSum += pile.get(l);
                    dp[i][j] = Math.max(dp[i][j], coinSum + dp[i - 1][j - l - 1]);
                }
            }
        }
        return dp[amount][k];
    }
}