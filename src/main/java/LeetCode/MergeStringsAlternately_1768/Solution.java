package LeetCode.MergeStringsAlternately_1768;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();

        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++))
                    .append(word2.charAt(j++));
        }

        if (i == word1.length())
            addRestOf(word2, sb, j);
        else
            addRestOf(word1, sb, i);

        return sb.toString();
    }

    private void addRestOf(String word, StringBuilder sb, int index) {
        for (int j = index; j < word.length(); j++) {
            sb.append(word.charAt(j));
        }
    }
}