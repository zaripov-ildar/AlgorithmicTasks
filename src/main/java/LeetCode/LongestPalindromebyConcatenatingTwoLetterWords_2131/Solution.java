package LeetCode.LongestPalindromebyConcatenatingTwoLetterWords_2131;


class Solution {
    public int longestPalindrome(String[] words) {
        int res = 0;
        int[][] arr = new int[26][26];
        for (String word : words) {
            int x = word.charAt(0) - 'a';
            int y = word.charAt(1) - 'a';
            if (arr[y][x] > 0) {
                arr[y][x]--;
                res += 4;
            } else {
                arr[x][y]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i][i] > 0){
                return res +2;
            }
        }
        return res;
    }
}