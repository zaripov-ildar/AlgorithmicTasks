package LeetCode.BusRoutes_815;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 7}, {3, 6, 7}}, 1, 6, 2),
                Arguments.of(new int[][]{{7, 12}, {4, 5, 15}, {6}, {15, 19}, {9, 12, 13}}, 15, 12, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][] routes, int source, int target, int expected) {
        assertEquals(expected, solution.numBusesToDestination(routes, source, target));
    }
}