package LeetCode.MinimumPathSum_64;

class Solution {

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = initDp(grid, m, n);

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }

    private int[][] initDp(int[][] grid, int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }
        return dp;
    }
}