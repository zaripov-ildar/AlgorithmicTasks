package LeetCode.DominoandTrominoTiling_790;

class Solution {
    public int numTilings(int n) {
        if (n == 2) return 2;
        long modulo = 1_000_000_007;
        long a = 1;
        long b = 1;
        long c = 2;
        long tempSum = a;
        for (int i = 3; i <= n; i++) {
            tempSum = (2 * c + a) % modulo;
            a = b;
            b = c;
            c = tempSum;
        }
        return (int) tempSum;
    }
}
