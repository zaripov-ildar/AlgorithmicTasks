package LeetCode.MinimumCostForTickets_983;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15}, 11),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, new int[]{2, 7, 15}, 17),
                Arguments.of(new int[]{3}, new int[]{7, 15, 23}, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] days, int[] cost, int expected) {
        assertEquals(expected, solution.mincostTickets(days, cost));
    }
}