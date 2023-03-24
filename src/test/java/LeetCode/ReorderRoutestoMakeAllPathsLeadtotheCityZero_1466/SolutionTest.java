package LeetCode.ReorderRoutestoMakeAllPathsLeadtotheCityZero_1466;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(5, new int[][]{new int[]{1, 0}, new int[]{1, 2}, new int[]{3, 2}, new int[]{3, 4}}, 2),
                Arguments.of(3, new int[][]{new int[]{1, 0}, new int[]{2, 0}}, 0),
                Arguments.of(3, new int[][]{new int[]{1, 0}, new int[]{2, 0}}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n, int[][] connections, int expected) {
        assertEquals(expected, solution.minReorder(n, connections));
    }
}