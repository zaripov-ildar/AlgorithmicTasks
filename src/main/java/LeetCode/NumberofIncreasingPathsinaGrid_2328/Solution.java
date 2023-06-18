package LeetCode.NumberofIncreasingPathsinaGrid_2328;

import java.util.Arrays;

public class Solution {
    private static final int MOD = 1_000_000_007;
    private int[][] mem;

    public int countPaths(int[][] grid) {
        mem = new int[grid.length][grid[0].length];
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                res += helper(i, j, grid, 0);
                res %= MOD;
            }
        }
        return res;
    }

    private int helper(int i, int j, int[][] grid, int prev) {
        if (i < 0 || i >= grid.length ||
                j < 0 || j >= grid[0].length ||
                prev >= grid[i][j]) {
            return 0;
        }

        if (mem[i][j] != 0) {
            return mem[i][j];
        }

        mem[i][j] = (1 + helper(i, j - 1, grid, grid[i][j])
                +
                helper(i, j + 1, grid, grid[i][j])
                +
                helper(i - 1, j, grid, grid[i][j])
                +
                helper(i + 1, j, grid, grid[i][j])) % MOD;

        return mem[i][j];
    }
}
