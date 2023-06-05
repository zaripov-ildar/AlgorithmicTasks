package LeetCode.SpiralMatrixII_59;

class Solution {
    public int[][] generateMatrix(int n) {
        int [][] result= new int[n][n];
        int i = 0,
                j = 0,
                xStep = 0,
                yStep = 1;
        for (int k = 1; k <= n * n; k++) {
            result[i][j] = k;
            if (result[(i + xStep + n) % n][(j + yStep + n) % n] != 0) {
                int temp = xStep;
                xStep = yStep;
                yStep = -temp;
            }
            i += xStep;
            j += yStep;
        }
        return result;
    }
}