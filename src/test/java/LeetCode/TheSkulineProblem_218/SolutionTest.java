package LeetCode.TheSkulineProblem_218;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}},
                        List.of(List.of(2, 10), List.of(3, 15), List.of(7, 12), List.of(12, 0), List.of(15, 10), List.of(20, 8), List.of(24, 0))),
                Arguments.of(new int[][]{{0, 2, 3}, {2, 5, 3}},
                        List.of(List.of(0, 3), List.of(5, 0)))
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testSkyline(int[][] input, List<List<Integer>> expected) {
        assertEquals(expected, solution.getSkyline(input));
    }
}