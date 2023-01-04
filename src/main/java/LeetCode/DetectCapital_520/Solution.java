package LeetCode.DetectCapital_520;

class Solution {

    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) return true;
        boolean secondLetterIsCapital = isCapital(word.charAt(1));
        if (word.length() == 2 &&
                !isCapital(word.charAt(0)) && secondLetterIsCapital) {
            return false;
        }
        for (int i = 2; i < word.length(); i++) {
            if (secondLetterIsCapital != isCapital(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isCapital(char c) {
        return c <= 'Z' && c >= 'A';
    }
}
