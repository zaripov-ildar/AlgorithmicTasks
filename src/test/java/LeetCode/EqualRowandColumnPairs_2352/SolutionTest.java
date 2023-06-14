package LeetCode.EqualRowandColumnPairs_2352;

import LeetCode.HandsomeMethods;
import LeetCode.Timer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}, 1),
                Arguments.of(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[][] grid, int expected) {
        assertEquals(expected, solution.equalPairs(grid));
    }

//    @Test
//    void timeTest() {
//        int[][] arr = new int[500][500];
//        Random rnd = new Random();
//        for (int i = 0; i < 500; i++) {
//            for (int j = 0; j < 500; j++) {
//                arr[i][j] = rnd.nextInt();
//            }
//        }
//        System.out.println(solution.equalPairs(arr));
//        System.out.println(solution.equalPairs2(arr));
//        Timer timer = new Timer();
//        timer.compareFunctions(
//                () -> solution.equalPairs(arr),
//                () -> solution.equalPairs2(arr)
//        );
//    }
}