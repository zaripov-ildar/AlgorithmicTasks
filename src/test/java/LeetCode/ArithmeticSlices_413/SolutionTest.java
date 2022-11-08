package LeetCode.ArithmeticSlices_413;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,8,9,10}, 2),
                Arguments.of(new int[]{1,2,3}, 1),
                Arguments.of(new int[]{3, -1, -5, -9}, 3),
                Arguments.of(new int[]{7, 7, 7, 7}, 3),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 6),
                Arguments.of(new int[]{1, 3, 5, 7, 9}, 6),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, 10),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 15),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 21),
                Arguments.of(new int[]{1}, 0),
                Arguments.of(new int[]{1, 2}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] input, int expected) {
        assertEquals(expected, solution.numberOfArithmeticSlices(input));
    }
}