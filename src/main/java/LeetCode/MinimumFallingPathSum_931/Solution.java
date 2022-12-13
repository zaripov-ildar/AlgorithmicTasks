package LeetCode.MinimumFallingPathSum_931;

import java.util.Arrays;

class Solution {

    public int minFallingPathSum1(int[][] A) {
        int n = A.length;
        int[][] paths = new int[2][n];
        for (int i = 0, k = 0; i < n; ++i, k ^= 1) {
            for (int j = 0; j < n; ++j) {
                int minOfAbove3 = paths[k][j]; // paths[k] - previous path value.
                if (j > 0 && paths[k][j - 1] < minOfAbove3) { minOfAbove3 = paths[k][j - 1]; }
                if (j + 1 < n && paths[k][j + 1] < minOfAbove3) { minOfAbove3 = paths[k][j + 1]; }
                paths[k ^ 1][j] = minOfAbove3 + A[i][j]; // paths[k ^ 1] - current path value.
            }
        }
        return Arrays.stream(paths[n % 2]).min().getAsInt();
    }
    private Integer[][] memo;

    public int minFallingPathSum2(int[][] matrix) {
        int n = matrix.length;
        memo = new Integer[n][n];
        int result = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            result = Math.min(getSum(matrix, 0, j), result);
        }
        return result;
    }

    private int getSum(int[][] matrix, int i, int j) {
        if (j < 0 || j == matrix.length) return Integer.MAX_VALUE;
        if (i == matrix.length - 1) return matrix[i][j];
        if (memo[i][j] != null) {
            return memo[i][j];
        }
        int left = getSum(matrix, i + 1, j - 1);
        int right = getSum(matrix, i + 1, j + 1);
        int bottom = getSum(matrix, i + 1, j);
        return memo[i][j] = matrix[i][j] +
                Math.min(left,
                        Math.min(right, bottom));
    }
}
