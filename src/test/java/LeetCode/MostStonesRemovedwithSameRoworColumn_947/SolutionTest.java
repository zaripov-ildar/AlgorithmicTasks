package LeetCode.MostStonesRemovedwithSameRoworColumn_947;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[][]{{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}}, 5),
                Arguments.of(new int[][]{{0,0},{0,2},{1,1},{2,0},{2,2}}, 3),
                Arguments.of(new int[][]{{0}}, 0)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][] in, int exp){
        assertEquals(exp, solution.removeStones(in));
    }

}