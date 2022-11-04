package LeetCode.MaximumProductSubarray_152;

class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int currMin ,currMax;
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMin = min * nums[i];
            currMax = max * nums[i];
            min = Math.min(Math.min(currMax, currMin), nums[i]);
            max = Math.max(Math.max(currMax, currMin), nums[i]);
            res = Math.max(max, res);
        }
        return res;
    }
}
