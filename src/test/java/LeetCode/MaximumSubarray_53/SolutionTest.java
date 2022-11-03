package LeetCode.MaximumSubarray_53;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[]{-2,1,-3,4,-1,2,1,-5,4}, 6),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{5,4,-1,7,8}, 23)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int [] input, int expected){
        assertEquals(expected, solution.maxSubArray(input));
    }

}