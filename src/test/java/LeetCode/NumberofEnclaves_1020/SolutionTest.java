package LeetCode.NumberofEnclaves_1020;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
	return Stream.of(
		Arguments.of(
			new int[][] {
				{ 0, 0, 0, 0 },
				{ 1, 0, 1, 0 },
				{ 0, 1, 1, 0 },
				{ 0, 0, 0, 0 } },
			3),
		Arguments.of(
			new int[][] {
				{ 0, 1, 1, 0 },
				{ 0, 0, 1, 0 },
				{ 0, 0, 1, 0 },
				{ 0, 0, 0, 0 } },
			0),
		Arguments.of(
			new int[][] {
				{ 0, 0, 0, 1, 1, 1, 0, 1, 0, 0 },
				{ 1, 1, 0, 0, 0, 1, 0, 1, 1, 1 },
				{ 0, 0, 0, 1, 1, 1, 0, 1, 0, 0 },
				{ 0, 1, 1, 0, 0, 0, 1, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 0, 0, 1, 0 },
				{ 0, 0, 1, 0, 1, 1, 1, 1, 0, 1 },
				{ 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 },
				{ 0, 0, 1, 0, 0, 1, 0, 1, 0, 1 },
				{ 1, 0, 1, 0, 1, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 1, 0, 0, 0, 1 } },
			3)

	);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][] grid, int expected) {
	assertEquals(expected, solution.numEnclaves(grid));
    }
}