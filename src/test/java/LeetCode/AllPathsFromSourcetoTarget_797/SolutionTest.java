package LeetCode.AllPathsFromSourcetoTarget_797;

import LeetCode.HandsomeMethods;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2}, {3}, {3}, {}},
                        List.of(
                                List.of(0, 1, 3),
                                List.of(0, 2, 3))
                ),
                Arguments.of(new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}},
                        List.of(
                                List.of(0, 4),
                                List.of(0, 3, 4),
                                List.of(0, 1, 3, 4),
                                List.of(0, 1, 4),
                                List.of(0, 1, 2, 3, 4)
                        ))
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][] in , List<List<Integer>> exp) {
    }
}