package LeetCode.ToeplitzMatrix_766;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}}, true),
                Arguments.of(new int[][]{{1,2}, {2,2}}, false)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][] input, boolean expected){
        assertEquals(expected, solution.isToeplitzMatrix(input));
    }

}