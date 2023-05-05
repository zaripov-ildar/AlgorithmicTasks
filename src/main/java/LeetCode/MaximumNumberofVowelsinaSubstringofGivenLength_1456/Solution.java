package LeetCode.MaximumNumberofVowelsinaSubstringofGivenLength_1456;


class Solution {
    public int maxVowels(String s, int right) {
        int left = 0;
        int vowels = 0;
        for (int i = 0; i < right; i++) {
            if (isVowel(s.charAt(i))) {
                vowels++;
            }
        }
        int result = vowels;
        while (right < s.length()) {
            if (isVowel(s.charAt(left))) {
                vowels--;
            }
            if (isVowel(s.charAt(right))) {
                vowels++;
            }
            result = Math.max(result, vowels);
            left++;
            right++;
        }
        return result;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}