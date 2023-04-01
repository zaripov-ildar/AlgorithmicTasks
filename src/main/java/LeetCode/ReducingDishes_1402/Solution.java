package LeetCode.ReducingDishes_1402;

import java.util.Arrays;

class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int len = satisfaction.length;
        int sum = 0;
        int taleSum = 0;
        for (int i = len - 1; i >= 0; i--) {
            taleSum += satisfaction[i];
            if (taleSum < 0) {
                return sum;
            }
            sum += taleSum;
        }
        return sum;
    }
}