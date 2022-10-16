package LeetCode.SquaresOfASortedArray_977;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[]{-7,-3,2,3,11} , new int[]{4,9,9,49,121}),
                Arguments.of(new int[]{2} , new int[]{4}),
                Arguments.of(new int[]{0, 2} , new int[]{0, 4}),
                Arguments.of(new int[]{-7,-3,2,3,11} , new int[]{4,9,9,49,121})
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testSolution(int [] nums, int [] expected){
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }
}