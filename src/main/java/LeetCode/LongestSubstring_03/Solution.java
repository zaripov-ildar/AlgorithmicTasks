package LeetCode.LongestSubstring_03;

class Solution {
//    public int naiveLengthOfLongestSubstring(String s) {
//        if (s == null || s.length() == 0){
//            return 0;
//        }
//        if (s.length()==1){
//            return 1;
//        }
//        Map<Character, Integer> map = new HashMap<>();
//        int left = 0;
//        int max = 0;
//        map.put(s.charAt(left), left);
//        for (int i = 1; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (map.containsKey(c) && map.get(c) >= left) {
//                left = map.get(c);
//                left++;
//            }
//            int subLength = i - left + 1;
//            if (subLength > max) {
//                max = subLength;
//            }
//            map.put(c, i);
//        }
//        return max;
//    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int[] chars = new int[256];
        int left = 1;
        int max = 0;
        chars[s.charAt(0)] = left;
        for (int i = 2; i <= s.length(); i++) {
            char c = s.charAt(i - 1);
            if (chars[c] != 0 && chars[c] >= left) {
                left = chars[c];
                left++;
            }
            int subLength = i - left + 1;
            if (subLength > max) {
                max = subLength;
            }
            chars[c] = i;
        }
        return max;
    }
}