package LeetCode.GroupAnagrams_49;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String orderedString = orderString(str);
            if (!map.containsKey(orderedString)) {
                map.put(orderedString, new ArrayList<>());
            }
            map.get(orderedString).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private String orderString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
