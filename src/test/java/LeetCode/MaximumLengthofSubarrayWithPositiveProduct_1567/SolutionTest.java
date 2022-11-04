package LeetCode.MaximumLengthofSubarrayWithPositiveProduct_1567;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[]{1,-2,-3,4}, 4),
                Arguments.of(new int[]{0,1,-2,-3,-4}, 3),
                Arguments.of(new int[]{-1,-2,-3,0,1}, 2),
                Arguments.of(new int[]{-1,2}, 1)

                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] input, int expected){
        assertEquals(expected, solution.getMaxLen(input));
    }
}