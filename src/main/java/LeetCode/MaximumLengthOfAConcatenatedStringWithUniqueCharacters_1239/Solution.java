package LeetCode.MaximumLengthOfAConcatenatedStringWithUniqueCharacters_1239;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    private int maxLen = 0;
    private List<String> arr;

    public int maxLength(List<String> arr) {
        Set<Character> set = new HashSet<>(26);
//let's kick out all the words with repeated letters
        arr = arr.stream()
                .filter(word -> {
                    set.clear();
                    for (int i = 0; i < word.length(); i++) {
                        if (set.contains(word.charAt(i))) {
                            return false;
                        }
                        set.add(word.charAt(i));
                    }
                    return true;
                }).collect(Collectors.toList());
        set.clear();
        this.arr = arr;
//the usual method of backtracking. we will use our set to store the letters of the combined words
        backTracking(0, set);
        return maxLen;
    }

    private void backTracking(int index, Set<Character> set) {
//stop torturing our recursion when it reaches its maximum value
        if (maxLen == 26) {
            return;
        }
        for (int i = index; i < arr.size(); i++) {
            String word = arr.get(i);
            if (isWordValid(word, set)) {
                addWordToSet(word, set);
                maxLen = Math.max(set.size(), maxLen);
                backTracking(i + 1, set);
                removeWordFromSet(word, set);
            }
        }
    }

    private void removeWordFromSet(String s, Set<Character> set) {
        for (int i = 0; i < s.length(); i++) {
            set.remove(s.charAt(i));
        }
    }

    private void addWordToSet(String s, Set<Character> set) {
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
    }

    private boolean isWordValid(String s, Set<Character> set) {
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}