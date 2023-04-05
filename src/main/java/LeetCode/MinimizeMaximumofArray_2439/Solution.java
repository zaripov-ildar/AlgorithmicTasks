package LeetCode.MinimizeMaximumofArray_2439;

class Solution {
    public int minimizeArrayValue(int[] nums) {
	long sum = 0;
	long max = 0;
	for (int i = 1; i <= nums.length; i++) {
	    sum += nums[i - 1];
	    max = Math.max(sum / i + (sum % i == 0 ? 0 : 1), max);	   
	}
	 return (int) max;
    }
}