package LeetCode.ReverseInteger_07;

public class Solution {
    public int reverse2(int x) {
        StringBuilder result = new StringBuilder();
        result.append(Math.abs(x));
        result.reverse();
        try {
            return (int) Math.signum(x) * Integer.parseInt(result.toString());
        } catch (NumberFormatException exception) {
            return 0;
        }
    }

    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            int rem = x % 10;
            result = result * 10 + rem;
            x /= 10;
        }
        if (isOutOfBounds(result)) {
            return 0;
        }
        return (int) result;
    }

    private boolean isOutOfBounds(long num) {
        return
                num > Integer.MAX_VALUE || num < Integer.MIN_VALUE;
    }

}
