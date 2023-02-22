package LeetCode.GuessNumberHigherorLower_374;

import LeetCode.Timer;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.sql.Time;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(10, 6),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(Integer.MAX_VALUE, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n, int expected) {
        solution.setExpected(expected);
        assertEquals(expected, solution.guessNumber3(n));
    }

//    @ParameterizedTest
//    @MethodSource("testArguments")
//    void timeTest(int n, int expected) {
//        solution.setExpected(expected);
//        Timer timer = new Timer();
//        timer.compareFunctions(
//                50_000_000,
//                ()->solution.guessNumber(n),
//                ()->solution.guessNumber2(n),
//                ()->solution.guessNumber3(n)
//                );
//    }
}