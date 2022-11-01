package LeetCode.WhereWilltheBallFall_1706;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[][]{
                                {1, 1, 1, -1, -1},
                                {1, 1, 1, -1, -1},
                                {-1, -1, -1, 1, 1},
                                {1, 1, 1, 1, -1},
                                {-1, -1, -1, -1, -1}},
                        new int[]{1, -1, -1, -1, -1}),
                Arguments.of(new int[][]
                                {{-1}},
                        new int[]{-1}),
                Arguments.of(new int[][]{
                                {1, 1, 1, 1, 1, 1},
                                {-1, -1, -1, -1, -1, -1},
                                {1, 1, 1, 1, 1, 1},
                                {-1, -1, -1, -1, -1, -1}},
                        new int[]{0, 1, 2, 3, 4, -1})
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][] input, int[] expected) {
        assertArrayEquals(expected, solution.findBall(input));
    }
}