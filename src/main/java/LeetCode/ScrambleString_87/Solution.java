package LeetCode.ScrambleString_87;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private final Map<String, Boolean> map = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        int len = s1.length();
        if (s2.length() != len) {
            return false;
        }
        if (len == 1)
            return false;
        String key = s1 + " " + s2;
        if (map.containsKey(key))
            return map.get(key);
        for (int i = 1; i < len; i++) {
            boolean noSwap = (
                    isScramble(s1.substring(0, i), s2.substring(0, i))
                            && isScramble(s1.substring(i), s2.substring(i))
            );
            if (noSwap) {
                map.put(key, true);
                return true;
            }
            boolean swap = (
                    isScramble(s1.substring(0, i), s2.substring(len - i))
                            && isScramble(s1.substring(i), s2.substring(0, len - i))
            );
            if (swap) {
                map.put(key, true);
                return true;
            }
        }
        map.put(key, false);
        return false;
    }
}