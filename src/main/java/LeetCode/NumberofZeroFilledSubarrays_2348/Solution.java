package LeetCode.NumberofZeroFilledSubarrays_2348;


class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sum = 0;
        int subIndex = 0;
        for (int num : nums) {
            if (num == 0) {
                subIndex++;
                sum += subIndex;
            } else {
                subIndex = 0;
            }
        }
        return sum;
    }
}