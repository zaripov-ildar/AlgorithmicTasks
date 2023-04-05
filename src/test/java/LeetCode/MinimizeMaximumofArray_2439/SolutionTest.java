package LeetCode.MinimizeMaximumofArray_2439;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
	return Stream.of(
		Arguments.of(new int[] { 3, 7, 1, 6 }, 5), 
		Arguments.of(new int[] { 10, 1 }, 10),
		Arguments.of(new int[] {4,7,2,2,9,19,16,0,3,15}, 9)
		);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] nums, int expected) {
	assertEquals(expected, solution.minimizeArrayValue(nums));
    }
}