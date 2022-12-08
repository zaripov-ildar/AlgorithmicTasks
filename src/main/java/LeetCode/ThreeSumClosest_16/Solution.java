
package LeetCode.ThreeSumClosest_16;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);

        int bestRes = Integer.MAX_VALUE;
        int minDif = Integer.MAX_VALUE;
        while (left < right - 1) {
            int tempSum = nums[left] + nums[right];
            int midValue = binary(nums, target - tempSum, left+1, right-1);
            tempSum += midValue;
            int dif = Math.abs(target - tempSum);

            if (dif < minDif) {
                minDif = dif;
                bestRes = tempSum;
            }

            if (tempSum == target) {
                return tempSum;
            } else if (tempSum < target) {
                left++;
            } else {
                right--;
            }
        }
//        System.out.println(Arrays.toString(nums));
        return bestRes;
    }

    private int binary(int[] nums, int target, int left, int right) {
        int bestRes = Integer.MAX_VALUE;
        int minDif = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = (right + left) / 2;
            int dif = Math.abs(target - nums[mid]);
            if (dif < minDif) {
                minDif = dif;
                bestRes = nums[mid];
            }
            if (target == nums[mid]) {
                return nums[mid];
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return bestRes;
    }
}
