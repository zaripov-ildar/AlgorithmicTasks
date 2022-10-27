package LeetCode.ContinuousSubarraySum_523;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[]{23,2,4,6,7}, 6, true),
                Arguments.of(new int[]{23,2,6,4,7}, 6, true),
                Arguments.of(new int[]{23,2,6,4,7}, 13, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int [] nums, int k, boolean expected){
        assertEquals(expected, solution.checkSubarraySum(nums, k));
    }

    @Test
    void bigSizeTest(){
        int[] arr = new int[100_000];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }
        assertFalse(solution.checkSubarraySum(arr, 13));
    }

}