package LeetCode.SortVowelsinaString_2785;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String sortVowels(String s) {
        char[] chars = s.toCharArray();
        List<Character> characters = new ArrayList<>();
        for (char c : chars) {
            if (isVowel(c)) characters.add(c);
        }

        characters.sort(Comparator.comparingInt(a -> a));
        int pos = 0;
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) chars[i] = characters.get(pos++);
        }
        return new String(chars);
    }

    private boolean isVowel(char c) {
        return -1 < "AEIOUaeiou".indexOf(c);
    }
}