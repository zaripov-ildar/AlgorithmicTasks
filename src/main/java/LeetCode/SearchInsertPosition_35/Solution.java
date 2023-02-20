package LeetCode.SearchInsertPosition_35;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0,
                right = nums.length - 1,
                mid;
        while (left <= right) {
            mid = (right + left >> 1);
            if (target == nums[mid]) return mid;

            if (target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
    public int searchInsert2(int[] nums, int target) {
        int left = 0,
                right = nums.length - 1,
                mid;
        while (left <= right) {
            mid = (right - left)/2 + left;
            if (target == nums[mid]) return mid;

            if (target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
}