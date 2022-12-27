package LeetCode.MaximumBagsWithFullCapacityofRocks_2279;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 4, 5}, new int[]{1, 2, 4, 4}, 2, 3),
                Arguments.of(new int[]{10, 2, 2}, new int[]{2, 2, 0}, 100, 3),
                Arguments.of(new int[]{91, 54, 63, 99, 24, 45, 78}, new int[]{35, 32, 45, 98, 6, 1, 25}, 17, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] capacity, int[] rocks, int additionalRocks, int exp) {
        assertEquals(exp, solution.maximumBags(capacity, rocks, additionalRocks));
    }
}