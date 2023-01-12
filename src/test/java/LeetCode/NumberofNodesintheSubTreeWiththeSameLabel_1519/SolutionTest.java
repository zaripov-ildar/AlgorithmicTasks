package LeetCode.NumberofNodesintheSubTreeWiththeSameLabel_1519;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(7, new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}}, "abaedcd", new int[]{2, 1, 1, 1, 1, 1, 1}),
                Arguments.of(4, new int[][]{{0, 1}, {1, 2}, {0, 3}}, "bbbb", new int[]{4, 2, 1, 1}),
                Arguments.of(5, new int[][]{{0, 1}, {1, 2}, {1, 3}, {0, 4}}, "aabab", new int[]{3, 2, 1, 1, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n, int[][] edges, String labels, int[] expected) {
        assertArrayEquals(expected, solution.countSubTrees(n, edges, labels));
    }
}