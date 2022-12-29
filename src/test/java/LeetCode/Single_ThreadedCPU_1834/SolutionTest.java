package LeetCode.Single_ThreadedCPU_1834;

import LeetCode.Timer;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2}, {2, 4}, {3, 2}, {4, 1}}, new int[]{0, 2, 3, 1}),
                Arguments.of(new int[][]{{7, 10}, {7, 12}, {7, 5}, {7, 4}, {7, 2}}, new int[]{4, 3, 2, 0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][] in, int[] exp) {
        assertArrayEquals(exp, solution.getOrder(in));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testTime(int[][] in, int[] exp) {
        Timer timer = new Timer();
        timer.compareFunctions(()->solution.getOrder2(in) ,()-> solution.getOrder(in));
    }
}