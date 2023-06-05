package LeetCode.CheckIfItIsaStraightLine_1232;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[][] {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}, true),
                Arguments.of(new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}, false)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][]coordinates, boolean expected){
        assertEquals(expected, solution.checkStraightLine(coordinates));
    }
}