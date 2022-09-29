package LeetCode.PushDominoes_838;

class Solution {
    private char[] result;

    public String pushDominoes(String dominoes) {
        int len = dominoes.length();
        result = dominoes.toCharArray();
        for (int i = 0; i < len; i++) {
            char temp = dominoes.charAt(i);
            if (temp == '.') {
                int left = i;
                while (i < len && dominoes.charAt(i) == '.') {
                    i++;
                }
                int right = i - 1;
                char rChar = right == len - 1 ? '.' : dominoes.charAt(right + 1);
                char lChar = left == 0 ? '.' : dominoes.charAt(left - 1);
                if (lChar != 'R' && rChar == 'L') {
                    fillSubstringBy(left, right, 'L');
                } else if (rChar != 'L' && lChar == 'R') {
                    fillSubstringBy(left, right, 'R');
                } else if (lChar == 'R') {
                    fillSubstring(left, right);
                }
            }
        }
        return new String(result);
    }

    private void fillSubstring(int left, int right) {
        while (right > left) {
            result[right--] = 'L';
            result[left++] = 'R';
        }
    }

    private void fillSubstringBy(int left, int right, char c) {
        for (int i = left; i <= right; i++) {
            result[i] = c;
        }
    }
}
