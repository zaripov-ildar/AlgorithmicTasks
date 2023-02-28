package LeetCode.FindOriginalArrayFromDoubledArray_2007;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[]{4,4,16,20,8,8,2,10}, new int[]{2,4,8,10}),
                Arguments.of(new int[]{1,2,2,3,4,2,4,4,6,8}, new int[]{1,2,2,3,4}),
                Arguments.of(new int[]{1,3,4,2,6,8}, new int[]{1,3,4}),
                Arguments.of(new int[]{1}, new int[]{}),
                Arguments.of(new int[]{}, new int[]{})
        );
    }
    @ParameterizedTest
    @MethodSource("testArguments")
    void findOriginalArray(int[] input, int [] expected) {
        int [] result = solution.findOriginalArray(input);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }
}