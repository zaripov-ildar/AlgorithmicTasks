package LeetCode.JumpGameII_45;

class Solution {
    public int jump(int[] nums) {
        int last = 0;
        int current = 0;
        int jumps = 0;
        for (int i = 0; i < nums.length-1; i++) {
            current = Math.max(nums[i] + i, current);
            if (last == i) {
                last = current;
                jumps++;
                if (current >= nums.length-1) {
                    break;
                }
            }
        }
        return jumps;
    }
}
