package LeetCode.NumberofOperationstoMakeNetworkConnected_1319;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(4, new int[][]{new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 2}}, 1),
                Arguments.of(6, new int[][]{new int[]{0, 1}, new int[]{0, 2}, new int[]{0, 3}, new int[]{1, 2}, new int[]{1, 3}}, 2),
                Arguments.of(6, new int[][]{new int[]{0, 1}, new int[]{0, 2}, new int[]{0, 3}, new int[]{1, 2}}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n, int[][] connections, int expected) {
        assertEquals(expected, solution.makeConnected(n, connections));
    }
}