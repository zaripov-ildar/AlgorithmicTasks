package LeetCode.SearchInsertPosition_35;

import LeetCode.Timer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
                Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
                Arguments.of(new int[]{1, 3}, 2, 1),
                Arguments.of(new int[]{1, 3, 5, 6}, 7, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] nums, int target, int expected) {
        assertEquals(expected, solution.searchInsert(nums, target));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void timerTest(int[] nums, int target, int expected){
        Timer timer = new Timer();
        timer.compareFunctions(
                500_000_000,
                ()-> solution.searchInsert(nums, target),
                ()-> solution.searchInsert2(nums, target)

        );
    }
}