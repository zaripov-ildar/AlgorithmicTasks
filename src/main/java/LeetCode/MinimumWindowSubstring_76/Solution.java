package LeetCode.MinimumWindowSubstring_76;


class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int['z' + 1];
        for (int i = 0; i < t.length(); i++) {
            map[t.charAt(i)]++;
        }

        int left = 0;
        int bestLeft = 0;
        int bestRight = Integer.MAX_VALUE;
        int matches = t.length();
        int right = 0;
        while (right < s.length()) {
            if (map[s.charAt(right)] > 0) {
                matches--;
            }
            map[s.charAt(right)]--;
            right++;
            while (matches == 0) {
                if (bestRight - bestLeft > right - left) {
                    bestRight = right;
                    bestLeft = left;
                }
                map[s.charAt(left)]++;
                if (map[s.charAt(left)] > 0) {
                    matches++;
                }
                left++;
            }
        }
        return bestRight == Integer.MAX_VALUE ? "" : s.substring(bestLeft, bestRight);
    }
}
