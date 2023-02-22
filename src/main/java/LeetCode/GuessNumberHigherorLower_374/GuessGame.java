package LeetCode.GuessNumberHigherorLower_374;

public class GuessGame {
    private int expected;

    int guess(int num) {
        return (int) Math.signum(expected - num);
    }

    public void setExpected(int expected) {
        this.expected = expected;
    }
}
