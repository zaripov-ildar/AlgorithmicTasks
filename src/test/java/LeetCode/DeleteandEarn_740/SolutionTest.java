package LeetCode.DeleteandEarn_740;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 2}, 6),
                Arguments.of(new int[]{2, 2, 3, 3, 3, 4}, 9),
                Arguments.of(new int[]{3,1},4),
                Arguments.of(new int[]{13}, 13)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] input, int expected) {
        assertEquals(expected, solution.deleteAndEarn(input));
    }

}