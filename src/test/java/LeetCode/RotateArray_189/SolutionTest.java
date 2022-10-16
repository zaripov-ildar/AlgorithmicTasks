package LeetCode.RotateArray_189;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    static Stream<Arguments> testArguments(){
        return  Stream.of(
                Arguments.of(new int[]{1,2,3,4,5,6,7}, 3, new int []{5,6,7,1,2,3,4}),
                Arguments.of(new int[]{-1,-100,3,99}, 2,  new int []{3,99,-1,-100}),
                Arguments.of(new int[]{1}, 0,  new int []{1}),
                Arguments.of(new int[]{1}, 1,  new int []{1}),
                Arguments.of(new int[]{1,2,3,4,5,6}, 4,  new int []{3,4,5,6,1,2})

        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testRotate(int[] nums, int k, int [] expected){
        solution.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

}