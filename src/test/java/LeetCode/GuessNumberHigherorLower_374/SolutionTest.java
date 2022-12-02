package LeetCode.GuessNumberHigherorLower_374;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(10, 6),
                Arguments.of(1, 1),
                Arguments.of(2, 1)
        );
    }


    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n, int num) {
        assertTrue(helper(n, num));
    }

    private boolean helper(int n, int num) {
        int guess = solution.guessNumber(n);
        for (int i = 0; i < n / 2 + 1; i++) {
            if (guess < num) {
                guess = solution.guessNumber(-1);
            } else if (guess > num) {
                guess = solution.guessNumber(1);
            } else return true;
        }
        return false;
    }
}