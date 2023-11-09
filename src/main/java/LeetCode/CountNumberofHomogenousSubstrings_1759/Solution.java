package LeetCode.CountNumberofHomogenousSubstrings_1759;

class Solution {
    public int countHomogenous(String s) {
        long modulo = 1_000_000_007;
        int subStrLen = 1;
        long totalSum = 1;
        for (int i = 1; i < s.length(); i++) {
            subStrLen = (s.charAt(i - 1) == s.charAt(i)) ? ++subStrLen : 1;
            totalSum += subStrLen;
        }
        return (int) (totalSum % modulo);
    }
}