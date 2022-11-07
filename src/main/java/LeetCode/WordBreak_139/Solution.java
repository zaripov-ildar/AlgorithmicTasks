package LeetCode.WordBreak_139;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        int len = s.length();
        boolean[] res = new boolean[len + 1];
        res[0] = true;
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if (res[j] && set.contains(s.substring(j, i))) {
                    res[i] = true;
                    break;
                }
            }
        }
        return res[len];
    }
}
