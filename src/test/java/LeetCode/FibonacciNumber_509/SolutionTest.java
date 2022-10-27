package LeetCode.FibonacciNumber_509;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3),
                Arguments.of(5, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n, int expected) {

    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void threeValues(int n, int expected) {
        assertEquals(expected, solution.threeValues(n));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void rec(int n, int expected) {
        assertEquals(expected, solution.rec(n));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void memoRec(int n, int expected) {
        assertEquals(expected, solution.memoRec(n));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void akra(int n, int expected) {
        assertEquals(expected, solution.akra(n));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void dp(int n, int expected) {
        assertEquals(expected, solution.dp(n));
    }

    @Test
    void memo(){
        solution.memoRec(5);
        solution.memoRec(10);
        solution.memoRec(20);
        solution.memoRec(30);
    }
}