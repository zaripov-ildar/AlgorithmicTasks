package LeetCode.MaximumElementAfterDecreasingandRearranging_1846;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 1, 2, 1}, 2),
                Arguments.of(new int[]{100, 1, 1000}, 3),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] arr, int expected) {
        assertEquals(expected, solution.maximumElementAfterDecrementingAndRearranging(arr));
    }
}