package LeetCode.SingleElementinaSortedArray_540;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            //I don't use overflow protection because constraint is only 10^5
            int mid = right + left >> 1;
            if (nums[mid] == nums[mid + 1]) {
                mid = mid - 1;
            }
            if ((mid - left + 1 & 1) != 0) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
