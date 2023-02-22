package LeetCode.SingleElementinaSortedArray_540;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}, 2),
                Arguments.of(new int[]{3, 3, 7, 7, 10, 11, 11}, 10)
//                Arguments.of(new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] nums, int expected) {
        assertEquals(expected, solution.singleNonDuplicate(nums));
    }
}