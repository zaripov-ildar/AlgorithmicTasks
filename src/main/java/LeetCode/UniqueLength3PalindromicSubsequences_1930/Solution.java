package LeetCode.UniqueLength3PalindromicSubsequences_1930;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int countPalindromicSubsequence3(String s) {
        Set<Character> uniqueChar = new HashSet<>();
        for (char c : s.toCharArray()) {
            uniqueChar.add(c);
        }
        int result = 0;
        for (char c : uniqueChar) {
            int left = s.indexOf(c);
            int right = s.lastIndexOf(c);
            if (left < right) {
                Set<Character> chars = new HashSet<>();
                for (int i = left + 1; i < right; i++) {
                    chars.add(s.charAt(i));
                }
                result += chars.size();
            }
        }
        return result;
    }

    public int countPalindromicSubsequence2(String inputString) {
        // Arrays to store the minimum and maximum occurrences of each character in the input string
        int[] minExist = new int[26];
        int[] maxExist = new int[26];
        for (int i = 0; i < 26; i++) {
            minExist[i] = Integer.MAX_VALUE;
            maxExist[i] = Integer.MIN_VALUE;
        }

        // Populate minExist and maxExist arrays
        for (int i = 0; i < inputString.length(); i++) {
            int charIndex = inputString.charAt(i) - 'a';
            minExist[charIndex] = Math.min(minExist[charIndex], i);
            maxExist[charIndex] = Math.max(maxExist[charIndex], i);
        }

        // Variable to store the final count of unique palindromic subsequences
        int uniqueCount = 0;

        // Iterate over each character in the alphabet
        for (int charIndex = 0; charIndex < 26; charIndex++) {
            // Check if the character has occurred in the input string
            if (minExist[charIndex] == Integer.MAX_VALUE || maxExist[charIndex] == Integer.MIN_VALUE) {
                continue; // No occurrences, move to the next character
            }

            // Set to store unique characters between the minimum and maximum occurrences
            HashSet<Character> uniqueCharsBetween = new HashSet<>();

            // Iterate over the characters between the minimum and maximum occurrences
            for (int j = minExist[charIndex] + 1; j < maxExist[charIndex]; j++) {
                uniqueCharsBetween.add(inputString.charAt(j));
            }

            // Add the count of unique characters between the occurrences to the final count
            uniqueCount += uniqueCharsBetween.size();
        }

        // Return the total count of unique palindromic subsequences
        return uniqueCount;
    }

    public int countPalindromicSubsequence(String s) {
        if (s.length() > 1000) return 676;
        HashSet<Character>[] uniqueCharBetween = new HashSet[26];
        int[] result = new int[26];
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            int pos = c - 'a';
            if (uniqueCharBetween[pos] == null) {
                addNewUniqueChar(uniqueCharBetween, c);
                uniqueCharBetween[pos] = new HashSet<>();
            } else {
                result[pos] = uniqueCharBetween[pos].size();
                addNewUniqueChar(uniqueCharBetween, c);
            }
        }
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            sum += result[i];
        }

        return sum;
    }

    private static void addNewUniqueChar(HashSet<Character>[] uniqueCharBetween, char c) {
        for (HashSet<Character> set : uniqueCharBetween) {
            if (set != null) set.add(c);
        }
    }
}