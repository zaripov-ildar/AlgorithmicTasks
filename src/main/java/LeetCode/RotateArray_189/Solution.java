package LeetCode.RotateArray_189;

import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int last = nums.length - 1;
        k %= nums.length;
        reverse(nums, 0, last);
        reverse(nums, 0, k - 1);
        reverse(nums, k, last);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
