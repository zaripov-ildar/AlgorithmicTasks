package LeetCode.SquaresOfASortedArray_977;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int lSquare = nums[left] * nums[left];
        int rSquare = nums[right] * nums[right];
        if (right == 0) {
            result[0] = rSquare;
            return result;
        }
        for (int index = right; index >= 0 && left < right; index--) {
            if (rSquare >= lSquare) {
                result[index] = rSquare;
                right--;
                rSquare = nums[right] * nums[right];
            } else {
                result[index] = lSquare;
                left++;
                lSquare = nums[left] * nums[left];
            }
        }
        rSquare = nums[right] * nums[right];
        result[0] = rSquare;
        return result;
    }
}
