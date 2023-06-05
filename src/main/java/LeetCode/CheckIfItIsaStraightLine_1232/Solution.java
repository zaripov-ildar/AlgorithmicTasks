package LeetCode.CheckIfItIsaStraightLine_1232;

class Solution {
    public boolean checkStraightLine(int[][] coord) {
        int A = coord[1][1] - coord[0][1];
        int B = coord[1][0] - coord[0][0];
        int C = coord[0][1] * coord[1][0] - coord[0][0] * coord[1][1];
        for (int i = 2; i < coord.length; i++) {
            if (A * coord[i][0] + C != B * coord[i][1]) {
                return false;
            }
        }
        return true;
    }
}