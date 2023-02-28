package LeetCode.LongestCommonPrefix_14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int prefixLength = strs[0].length();
        for (int i = 0; i < strs.length - 1; i++) {
            prefixLength = Math.min(prefixLength, getLongestPrefixButLessThanPrevious(strs[i], strs[i + 1], prefixLength));
            if (prefixLength == 0) {
                return "";
            }
        }
        return strs[0].substring(0, prefixLength);
    }

    private int getLongestPrefixButLessThanPrevious(String s1, String s2, int previousLength) {
        int prefixLength = 0;
        int minPrefixLen = Math.min(s1.length(), s2.length());
        while (prefixLength < previousLength && prefixLength < minPrefixLen && s1.charAt(prefixLength) == s2.charAt(prefixLength)) {
            prefixLength++;
        }
        return prefixLength;
    }
}
