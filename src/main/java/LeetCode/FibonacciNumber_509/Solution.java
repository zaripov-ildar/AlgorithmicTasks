package LeetCode.FibonacciNumber_509;

public class Solution {

    //three values method
    public int threeValues(int n) {
        if (n == 0) return 0;
        int a = 0,
                b = 1;
        for (int i = 1; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    //    common recursion
    public int rec(int n) {
        if (n == 0) return 0;
        return n == 1 ? 1 : rec(n - 1) + rec(n - 2);
    }

    //    recursion with memoization
    private int counter;
    public long memoRec(int n) {
        counter = 0;
        long[] memo = new long[n + 1];
        long res = helper(n, memo);
        System.out.println(n + " => " + counter);
        return res;
    }

    private long helper(int n, long[] memo) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (memo[n] != 0) {
            counter++;
//            return memo[n];
        }
        return memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
    }

    public int dp(int n) {
        int[] arr = new int[n + 2];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    //    and some kind of magic called the "Acco-Bazzi method".
    public int akra(int n) {
        return (int) Math.round(Math.pow(1.618034, n) / Math.sqrt(5));
    }
}
