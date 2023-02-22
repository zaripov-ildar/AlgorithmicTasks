package LeetCode.GuessNumberHigherorLower_374;

public class Solution extends GuessGame {

    public int guessNumber(int right) {
        int left = 1;
        while (left < right) {
            int middle = (right - left >> 1) + left;
            int attempt = guess(middle);
            if (attempt == 1) left = middle + 1;
            if (attempt == -1) right = middle - 1;
            if (attempt == 0) return middle;

        }
        return left;
    }

    public int guessNumber2(int n) {
        return rec(1, n);
    }

    private int rec(int from, int to) {
        int middle = (to - from) / 2 + from;
        int attempt = guess(middle);
        if (attempt == 1) {
            return rec(middle + 1, to);
        }
        if (attempt == -1) {
            return rec(from, middle);
        }
        return middle;
    }



    public int guessNumber3(int right) {
        int left = 1;
        while (left < right) {
            int middle = (right - left >> 1) + left;
            switch (guess(middle)) {
                case 1 -> left = middle + 1;
                case -1 -> right = middle - 1;
                default ->  {
                    return middle;
                }
            }
        }
        return left;
    }
}
