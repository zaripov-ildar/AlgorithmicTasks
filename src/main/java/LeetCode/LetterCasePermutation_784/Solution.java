package LeetCode.LetterCasePermutation_784;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private final List<String> result = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        char[] arr = s.toCharArray();
        backtrack(arr, arr.length - 1);
        return result;
    }

    private void backtrack(char[] arr, int n) {
        if (n < 0) {
            result.add(new String(arr));
            return;
        }
        if (Character.isLetter(arr[n])) {
            for (int i = 0; i < 2; i++) {
                switchCase(arr, n);
                backtrack(arr, n - 1);
            }
        } else {
            backtrack(arr, n - 1);
        }
    }

    private void switchCase(char[] arr, int ind) {
        if (Character.isLowerCase(arr[ind])) {
            arr[ind] = Character.toUpperCase(arr[ind]);
        } else {
            arr[ind] = Character.toLowerCase(arr[ind]);
        }
    }
}