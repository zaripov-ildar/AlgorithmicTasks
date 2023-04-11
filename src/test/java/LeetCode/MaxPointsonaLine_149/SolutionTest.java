package LeetCode.MaxPointsonaLine_149;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[][] { { 1, 1 }, { 2, 2 }, { 3, 3 } }, 3),
                Arguments.of(new int[][] { { 1, 1 }, { 3, 2 }, { 5, 3 }, { 4, 1 }, { 2, 3 }, { 1, 4 } }, 4),
                Arguments.of(new int[][] { { 1, 1 } }, 1));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][] points, int expected) {
        assertEquals(expected, solution.maxPoints(points));
    }

    // @ParameterizedTest
    // @MethodSource("testArguments")
    // void timeTest(int[][] points, int expected) {
    // Timer timer = new Timer();
    // timer.compareFunctions(()->solution.maxPoints2(points),
    // ()->solution.maxPoints(points));
    // }
}