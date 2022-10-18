package LeetCode.HouseRobber_198;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    private static int[] arrForTimeTest;

    @BeforeAll
    static void arrPrepare() {
        int size = 10;
        arrForTimeTest = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            arrForTimeTest[i] = rnd.nextInt();
        }
    }

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, 4),
                Arguments.of(new int[]{1, 1}, 1),
                Arguments.of(new int[]{2, 7, 9, 3, 1}, 12)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] input, int expected) {
        assertEquals(expected, solution.rob(input));
    }

//    @Test
//    void recTimeTest() {
//        long start = System.nanoTime();
//        solution.robRec(arrForTimeTest);
//        long diff = System.nanoTime() - start;
//        System.out.println(diff);
//        assertTrue(diff < 700000);
//    }
//
//    @Test
//    void loopTimeTest() {
//        long start = System.nanoTime();
//        solution.rob(arrForTimeTest);
//        long diff = System.nanoTime() - start;
//        System.out.println(diff);
//        assertTrue(diff < 700000);
//    }

}