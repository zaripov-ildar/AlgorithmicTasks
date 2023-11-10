package LeetCode.RestoretheArrayFromAdjacentPairs_1743;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{2, 1}, {3, 4}, {3, 2}}, new int[]{1, 2, 3, 4}),
                Arguments.of(new int[][]{{4, -2}, {1, 4}, {-3, 1}}, new int[]{-2, 4, 1, -3}),
                Arguments.of(new int[][]{{100000, -100000}}, new int[]{100000, -100000})
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][] input, int[] expected) {
        assertArrayEquals(expected, solution.restoreArray(input));
    }
}