package LeetCode.MaximumProductSubarray_152;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, -2, 4}, 6),
                Arguments.of(new int[]{-2, 0, -1}, 0),
                Arguments.of(new int[]{3, 4, -2, 5, 3}, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] input, int expected) {
        assertEquals(expected, solution.maxProduct(input));
    }

}