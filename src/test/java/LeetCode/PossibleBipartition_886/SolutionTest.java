package LeetCode.PossibleBipartition_886;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(10, new int[][]{{1,2},{3,4},{5,6},{6,7},{8,9},{7,8}}, true)
//                Arguments.of(4, new int[][]{{1, 2}, {1, 3}, {2, 4}}, true),
//                Arguments.of(3, new int[][]{{1, 2}, {1, 3}, {2, 3}}, false),
//                Arguments.of(5, new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n, int[][] dislikes, boolean exp){
        assertEquals(exp, solution.possibleBipartition(n, dislikes));
    }
}