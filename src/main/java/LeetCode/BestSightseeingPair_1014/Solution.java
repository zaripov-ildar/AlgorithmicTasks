package LeetCode.BestSightseeingPair_1014;

class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int bestVal = 0;
        int bestScore = 0;
        for (int i = 0; i < values.length; i++) {
            bestScore = Math.max(bestScore, bestVal + values[i] - i);
            bestVal = Math.max(bestVal, values[i] + i);
        }
        return bestScore;
    }
}
