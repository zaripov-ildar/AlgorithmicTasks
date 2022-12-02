package LeetCode.DetermineifTwoStringsAreClose_1657;

import java.util.Arrays;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] frequency1 = getFreq(word1);
        int[] frequency2 = getFreq(word2);
        return isEqual(frequency1, frequency2);
    }

    private int[] getFreq(String word) {
        int[] frequency = new int[26];
        for (int i = 0; i < word.length(); i++) {
            frequency[word.charAt(i) - 'a']++;
        }
        return frequency;
    }

    private boolean isEqual(int[] frequency1, int[] frequency2) {
        for (int i = 0; i < frequency1.length; i++) {
            if (frequency1[i] == 0 & frequency2[i] != 0 ||
                    frequency1[i] != 0 & frequency2[i] == 0) {
                return false;
            }
        }
        Arrays.sort(frequency1);
        Arrays.sort(frequency2);
        for (int i = 0; i < frequency1.length; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }
        return true;
    }
}