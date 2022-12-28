package LeetCode.RemoveStonestoMinimizetheTotal_1962;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{5, 4, 9}, 2, 12),
                Arguments.of(new int[]{4, 3, 6, 7}, 3, 12)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] piles, int k, int exp) {
        assertEquals(exp, solution.minStoneSum(piles, k));
    }
}