package LeetCode.SignoftheProductofanArray_1822;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{-1, -2, -3, -4, 3, 2, 1}, 1),
                Arguments.of(new int[]{1, 5, 0, 2, -3}, 0),
                Arguments.of(new int[]{-1, 1, -1, 1, -1}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] nums, int sign) {
        assertEquals(sign, solution.arraySign(nums));
    }
}