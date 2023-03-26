package LeetCode.LongestCycleinaGraph_2360;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{3, 3, 4, 2, 3}, 3),
                Arguments.of(new int[]{2, -1, 3, 1}, -1),
                Arguments.of(new int[]{3, 4, 0, 2, -1, 2}, 3),
//               LeetCode test 57/76
                Arguments.of(new int[]{5, 8, -1, 5, -1, 6, 1, 6, 6, 5}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] edges, int expected) {
        assertEquals(expected, solution.longestCycle(edges));
    }
}