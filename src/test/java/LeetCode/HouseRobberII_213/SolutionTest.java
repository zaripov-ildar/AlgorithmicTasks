package LeetCode.HouseRobberII_213;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 2}, 3),
                Arguments.of(new int[]{1, 2, 3, 1}, 4),
                Arguments.of(new int[]{0}, 0),

//                I think it should be 0 but leetcode's test doesn't agree
                Arguments.of(new int[]{2,3}, 3),

                Arguments.of(new int[]{1, 2, 3}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int [] input, int expected) {
        assertEquals(expected, solution.rob(input));
    }

}