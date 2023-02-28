package Yandex.Task_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(2, 1, 4, new int[]{10, 52, 42, 11}, 2),
                Arguments.of(13, 0, 5, new int[]{42, 47, 40, 49, 42}, 4),
                Arguments.of(0, 1, 1, new int[]{49}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n10, int n50, int amount, int[] m, int expected) {
        assertEquals(expected, solution.calculate(n10, n50, amount, m));
    }
}