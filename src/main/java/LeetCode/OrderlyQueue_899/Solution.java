package LeetCode.OrderlyQueue_899;

import java.util.Arrays;

class Solution {

    public String orderlyQueue(String s, int k) {
        char[] arr = s.toCharArray();
        if (k > 1) {
            Arrays.sort(arr);
            return new String(arr);
        }

        String res = s;
        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(i) + s.substring(0, i);
            if (temp.compareTo(res) < 0) {
                res = temp;
            }
        }
        return res;
    }
}
