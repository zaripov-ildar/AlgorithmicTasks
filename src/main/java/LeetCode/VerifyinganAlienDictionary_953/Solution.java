package LeetCode.VerifyinganAlienDictionary_953;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> dic = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            dic.put(order.charAt(i), i);
        }
        for (int i = 1; i < words.length; i++) {
            if (!firstEarlierThanSecond(words[i - 1], words[i], dic)) {
                return false;
            }
        }
        return true;
    }

    private boolean firstEarlierThanSecond(String w1, String w2, Map<Character, Integer> dic) {
        for (int i = 0; i < w1.length(); i++) {
            if (w2.length() == i
                    || dic.get(w1.charAt(i)) > dic.get(w2.charAt(i))) {
                return false;
            }
            if (dic.get(w1.charAt(i)) < dic.get(w2.charAt(i))) {
                break;
            }
        }
        return true;
    }
}