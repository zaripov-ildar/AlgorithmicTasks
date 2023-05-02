package LeetCode.SignoftheProductofanArray_1822;

class Solution {
    public int arraySign(int[] nums) {
        int sum = 1;
        for (int num : nums) {
            if (num == 0) return 0;
            sum ^= num;
        }
        return sum >>> 31 == 1 ? -1 : 1;
    }
}