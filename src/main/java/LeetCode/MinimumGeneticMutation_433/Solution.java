package LeetCode.MinimumGeneticMutation_433;

class Solution {
    private int res = Integer.MAX_VALUE;

    public int minMutation(String start, String end, String[] bank) {
        boolean[] usedStep = new boolean[bank.length];
        helper(start, end, bank, usedStep, 0);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private void helper(String start, String end, String[] bank, boolean[] usedStep, int step) {
        if (start.equals(end)) {
            res = Math.min(res, step);
        }
        for (int i = 0; i < bank.length; i++) {
            if (usedStep[i]) {
                continue;
            }
            if (isOneStepBetween(start, bank[i])) {
                usedStep[i] = true;
                helper(bank[i], end, bank, usedStep, step + 1);
                usedStep[i] = false;
            }
        }
    }

    private boolean isOneStepBetween(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
        }
        return diff == 1;
    }
}
