package LeetCode.SumofDistancesinTree_834;

import LeetCode.Timer;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(6, new int[][]{{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}}, new int[]{8, 12, 6, 10, 10, 10}),
                Arguments.of(1, new int[][]{}, new int[]{0}),
                Arguments.of(2, new int[][]{{1, 0}}, new int[]{1, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n, int[][] edges, int[] exp) {
        int[] result = solution.sumOfDistancesInTree(n, edges);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(exp, result);
    }

//    @ParameterizedTest
//    @MethodSource("testArguments")
//    void timeTest(int n, int[][] edges, int[] exp) {
//        Timer timer = new Timer();
//        timer.compareFunctions(100_000, () -> solution.sumOfDistancesInTree2(n, edges),
//                () -> solution.sumOfDistancesInTree(n, edges));
//    }
}