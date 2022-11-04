package LeetCode.MaximumLengthofSubarrayWithPositiveProduct_1567;

class Solution {
    public int getMaxLen(int[] nums) {
        int neg = 0;
        int pos = 0;
        int result = 0;
        for (int num : nums) {
            if (num > 0) {
                pos++;
                neg = neg == 0 ? 0 : neg + 1;
            } else if (num < 0) {
                int temp = pos;
                pos = neg == 0 ? 0 : neg + 1;
                neg = temp + 1;
            } else {
                neg = 0;
                pos = 0;
            }
            result = Math.max(result, pos);
        }
        return result;
    }
}
