package LeetCode.MinimizeMaximumPairSuminArray_1877;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 2, 3}, 7),
                Arguments.of(new int[]{3, 5, 4, 2, 4, 6}, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] arr, int expected) {
        assertEquals(expected, solution.minPairSum(arr));
    }
}