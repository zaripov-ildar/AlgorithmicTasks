package LeetCode.RegularExpressionMatching_10;

class Solution {
    private int stars = 0;

    public boolean isMatch(String s, String p) {
        return s.matches(p);
//        countStars(p);
//        return check(s, p);
    }

    private void countStars(String p) {
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*') {
                stars++;
            }
        }
    }

    private boolean check(String s, String p) {
        if (s.length() < p.length() - stars) {
            return false;
        }
        if (equals(s, p)) {
            return true;
        }
        for (int i = 0, j = 0; i < s.length() && j < p.length(); i++, j++) {
            if (p.charAt(j) == '*') {
                if (check(s, insert(p, j))) {
                    return true;
                }
            }
        }

        return false;
    }

    protected String insert(String pattern, int index) {
        return pattern.substring(0, index + 1) + '.' + pattern.substring(index + 1);

    }

    private boolean equals(String s, String pattern) {
        int i, j;
        for (i = 0, j = 0; i < s.length() && j < pattern.length();) {
            char temp =pattern.charAt(j);
            if (temp=='*'){
                j++;
                continue;
            }
            if (temp=='.'){
                i++;
                j++;
                continue;
            }
            if (pattern.charAt(j)
                    != s.charAt(i)) {
                return false;
            }
            i++;
            j++;
        }

        return i == s.length();
    }
}