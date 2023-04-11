package LeetCode.BinarySearch_704;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.stream.Stream;

import static LeetCode.HandsomeMethods.getSortedRandomArray;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[] { -1, 0, 3, 5, 9, 12 }, 9, 4),
                Arguments.of(new int[] { -1, 0, 3, 5, 9, 12 }, 2, -1));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] nums, int target, int expected) {
        assertEquals(expected, solution.search(nums, target));
    }

    @Test
    void randomArrayTest() {
        Random rnd = new Random();
        for (int i = 0; i < 1000; i++) {
            int length = rnd.nextInt(1, 10_000);
            int[] nums = getSortedRandomArray(length);
            int expected = rnd.nextInt(0, length);
            int target = nums[expected];
            assertEquals(expected, solution.search(nums, target));
        }
    }
}