package LeetCode.Maximum69Number_1323;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(9669, 9969),
                Arguments.of(9996, 9999),
                Arguments.of(9999, 9999),
                Arguments.of(6, 9),
                Arguments.of(9, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int input, int expected) {
        assertEquals(expected, solution.maximum69Number(input));
    }
}