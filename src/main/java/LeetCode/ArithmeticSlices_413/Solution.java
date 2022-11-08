package LeetCode.ArithmeticSlices_413;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int result = 0;
        int counter = 0;
        for (int i = 2; i < nums.length; i++) {
            counter = nums[i - 1] - nums[i - 2] == nums[i] - nums[i - 1]? counter + 1: 0;
            result += counter;
        }
        return result;
    }
}
