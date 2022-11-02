package LeetCode.JumpGameII_45;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1, 1, 4}, 2),
                Arguments.of(new int[]{2, 3, 0, 1, 4}, 2),
                Arguments.of(new int[]{0}, 0)

        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] input, int expected) {
        assertEquals(expected, solution.jump(input));
    }

}