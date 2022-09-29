package LeetCode.StringToInteger_08;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private final Map<Character, Integer> map;

    {
        map = new HashMap<>();
        char a = '0';
        for (int i = 0; i < 10; i++) {
            map.put((char) (a + i), i);
        }
    }

    public int myAtoi(String s) {
        if (s.isBlank()){
            return 0;
        }
        long result = 0;
        boolean positive = true;
        int index = 0;
        while (s.charAt(index) == ' ') {
            index++;
        }


        if (s.charAt(index) == '-') {
            positive = false;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }

//        while (index < s.length() && map.containsKey(s.charAt(index))) {
//            result = result * 10 + map.get(s.charAt(index++));
//        }
        while (index < s.length() && s.charAt(index)<='9' && s.charAt(index)>='0'){
            result = result*10 + (s.charAt(index++) - '0');
        }
        if (result > Integer.MAX_VALUE) {
            return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return (int) result * (positive ? 1 : -1);
    }


}
