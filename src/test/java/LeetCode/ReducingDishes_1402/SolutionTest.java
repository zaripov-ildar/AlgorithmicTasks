package LeetCode.ReducingDishes_1402;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{-1, -8, 0, 5, -9}, 14),
                Arguments.of(new int[]{4, 3, 2}, 20),
                Arguments.of(new int[]{-1, -4, -5}, 0),
                Arguments.of(new int[]{-5,-7,8,-2,1,3,9,5,-10,4,-5,-2,-1,-6}, 260)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] satisfactions, int expected) {
        assertEquals(expected, solution.maxSatisfaction(satisfactions));
    }
}