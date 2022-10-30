package LeetCode.NthTribonacciNumber_1137;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(4, 4),
                Arguments.of(5, 7),
                Arguments.of(7, 24),
                Arguments.of(14, 1705),
                Arguments.of(25, 1389537),
                Arguments.of(2, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n, int expected) {
        assertEquals(expected, solution.tribonacci(n));
    }

}