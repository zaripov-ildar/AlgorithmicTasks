package LeetCode.TrappingRainWater_42;

class Solution {
    public int trap(int[] height) {
        int maxLeft = 0;
        int maxRight = 0;
        int sum = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            maxLeft = Math.max(maxLeft, height[i]);
            maxRight = Math.max(maxRight, height[j]);
            if (height[j] > height[i]) {
                i++;
                sum += Math.max(0, maxLeft - height[i]);
            } else {
                j--;
                sum += Math.max(0, maxRight - height[j]);
            }
        }
        return sum;
    }
}
