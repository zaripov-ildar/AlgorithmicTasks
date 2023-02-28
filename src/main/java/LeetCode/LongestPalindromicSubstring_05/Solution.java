package LeetCode.LongestPalindromicSubstring_05;

class Solution {
    String result = "";

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return result;
        }

        for (int frame = s.length(); frame >= 1; frame--) {
            checkFrameInString(frame, s);
            if (result.length() > 0) {
                return result;
            }
        }
        return result;
    }

    private void checkFrameInString(int frame, String s) {
        for (int i = 0; i <= s.length() - frame; i++) {
            if (isPalindrome(s, i, i + frame-1)) {
                result = s.substring(i, i+frame);
                return;
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

}