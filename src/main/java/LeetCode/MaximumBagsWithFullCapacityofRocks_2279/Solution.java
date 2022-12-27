package LeetCode.MaximumBagsWithFullCapacityofRocks_2279;

import java.util.Arrays;

class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for (int i = 0; i < capacity.length; i++) {
            capacity[i] -= rocks[i];
        }
        Arrays.sort(capacity);
        for (int i = 0; i < capacity.length; i++) {
            additionalRocks -= capacity[i];
            if (additionalRocks <= 0) {
                return i + 1 + (int) Math.signum(additionalRocks);
            }
        }
        return capacity.length;
    }
}
