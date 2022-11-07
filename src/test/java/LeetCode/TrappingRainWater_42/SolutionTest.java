package LeetCode.TrappingRainWater_42;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        int [] in1 = new int[40000];
        Arrays.fill(in1, 1);
        return Stream.of(
                Arguments.of(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}, 6),
                Arguments.of(new int[]{4,2,0,3,2,5}, 9),
                Arguments.of(in1, 0)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] input, int expected){
        assertEquals(expected, solution.trap(input));
    }
}