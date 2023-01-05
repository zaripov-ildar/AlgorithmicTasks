package LeetCode.MinimumNumberofArrowstoBurstBalloons_452;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[][]{{10,16},{2,8},{1,6},{7,12}}, 2),
                Arguments.of(new int[][]{{1,2},{3,4},{5,6},{7,8}}, 4),
                Arguments.of(new int[][]{{1,2},{2,3},{3,4},{4,5}}, 2)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][] in, int expected){
        assertEquals(expected, solution.findMinArrowShots(in));
    }
}