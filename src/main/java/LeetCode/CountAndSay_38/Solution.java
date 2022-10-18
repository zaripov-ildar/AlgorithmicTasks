package LeetCode.CountAndSay_38;

class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 0; i < n - 1; i++) {
            s = say(s);
        }
        return s;
    }

    private String say(String s) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < s.length(); ) {
            char c = s.charAt(j);
            int counter = 0;
            while (j < s.length() && c == s.charAt(j)) {
                counter++;
                j++;
            }
            sb.append(counter);
            sb.append(c);
        }
        return sb.toString();
    }
}
