package LeetCode.ImageOverlap_835;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[][]{{1,1,0},{0,1,0},{0,1,0}},
                        new int[][]{{0,0,0},{0,1,1},{0,0,1}}, 3),
                Arguments.of(new int[][]{{0,1},{1,1}},
                        new int[][]{{1,1},{1,0}}, 2),
                Arguments.of(new int[][]{{1}}, new int[][]{{1}}, 1),
                Arguments.of(new int[][]{{0}}, new int[][]{{0}}, 0)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][] img1, int [][] img2, int expected){
        assertEquals(expected, solution.largestOverlap(img1, img2));
    }
}