package LeetCode.ReverseWordsinaString_151;

class Solution {
//    public String reverseWords(String s) {
//        String[] words = s.trim().split("\\s+");
//        StringBuilder sb = new StringBuilder(words.length * 2 - 1);
//        for (int i = words.length - 1; i > 0; i--) {
//            sb.append(words[i]).append(' ');
//        }
//        sb.append(words[0]);
//        return sb.toString();
//    }

    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        reverse(arr, 0, arr.length - 1);
        int start = 0,
                end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                arr[end] = arr[i];
                end++;
            } else if (i > 0 && arr[i - 1] != ' ') {
                reverse(arr, start, end - 1);
                arr[end] = ' ';
                end++;
                start = end;
            }
        }
        reverse(arr, start, end - 1);
        end = arr[end - 1] == ' ' ? end - 1 : end;
        return new String(arr, 0, end);
    }

    private void reverse(char[] arr, int from, int to) {
        while (from < to) {
            char temp = arr[from];
            arr[from] = arr[to];
            arr[to] = temp;
            from++;
            to--;
        }
    }
}
