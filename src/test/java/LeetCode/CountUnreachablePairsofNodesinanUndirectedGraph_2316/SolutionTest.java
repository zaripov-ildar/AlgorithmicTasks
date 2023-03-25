package LeetCode.CountUnreachablePairsofNodesinanUndirectedGraph_2316;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(3, new int[][]{new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 2},}, 0),
                Arguments.of(7, new int[][]{new int[]{0, 2}, new int[]{0, 5}, new int[]{2, 4}, new int[]{1, 6}, new int[]{5, 4},}, 14)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n, int[][] edges, int expected) {
        assertEquals(expected, solution.countPairs(n, edges));
    }
}