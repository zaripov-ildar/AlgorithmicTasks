package LeetCode.ContinuousSubarraySum_523;

/*
Explanation.
Solution based on a math.
The first observation: the sum of a subarray starting at the index l
and ending at index r (0-based) is a multiple of k when its remainder modulo k is 0,
i.e. (nums[l]+nums[l+1]+ ⋯ +nums[r])%k=0.

Let pref[i] denote the sum of the first i elements of the array nums,
i.e. pref[i]=nums[0]+nums[1]+ ⋯ +nums[i−1].
In particular pref[0]=0.

We can represent the sum of the subarray in terms of pref:
nums[l]+nums[l+1]+ ⋯ +nums[r]=pref[r+1]−pref[l].
From the properties of modulo operation, the equality (pref[r+1]−pref[l])%k=0
is equivalent to pref[l]%k=pref[r+1]%k. The value pref[0]=0 allows us
to consider subarrays starting at the beginning of the entire array.
 */

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] dp = new int[nums.length + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i - 1] + nums[i - 1];
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i < dp.length; i++) {
            set.add(dp[i - 2] % k);
            if (set.contains(dp[i] % k)) {
                return true;
            }
        }
        return false;
    }
}