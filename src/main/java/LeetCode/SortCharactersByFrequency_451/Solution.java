package LeetCode.SortCharactersByFrequency_451;

import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }
        List<Letter> list = new ArrayList<>();
        map.keySet().forEach(k -> list.add(new Letter(k, map.get(k))));
        list.sort(Comparator.comparingInt(o -> -o.frequency));
        StringBuilder sb = new StringBuilder();
        list.forEach(letter -> sb.append((letter.c + "").repeat(letter.frequency)));
        return sb.toString();
    }

    private static class Letter {
        char c;
        int frequency;

        public Letter(char c, int frequency) {
            this.c = c;
            this.frequency = frequency;
        }
    }
}