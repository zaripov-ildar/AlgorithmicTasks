package LeetCode.NumberofZeroFilledSubarrays_2348;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 0, 0, 2, 0, 0, 4}, 6),
                Arguments.of(new int[]{0, 0, 0, 2, 0, 0}, 9),
                Arguments.of(new int[]{2, 10, 2019}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int [] nums, long expected) {
        assertEquals(expected, solution.zeroFilledSubarray(nums));
    }
}