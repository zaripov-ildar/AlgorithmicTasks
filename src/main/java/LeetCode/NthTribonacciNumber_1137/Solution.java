package LeetCode.NthTribonacciNumber_1137;

class Solution {
    public int tribonacci(int n) {
        if (n < 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 1;

        while (n-- > 2) {
            int temp = a + b + c;
            a = b;
            b = c;
            c = temp;
        }
        return c;
    }
}
