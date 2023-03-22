package LeetCode.MinimumScoreofaPathBetweenTwoCities_2492;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(4, new int[][]{new int[]{1, 2, 9}, new int[]{2, 3, 6}, new int[]{2, 4, 5}, new int[]{1, 4, 7},}, 5),
                Arguments.of(4, new int[][]{new int[]{1, 2, 2}, new int[]{1, 3, 4}, new int[]{3, 4, 7}}, 2)

        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n, int [][] roads, int expected) {
        assertEquals(expected, solution.minScore(n, roads));
    }
}