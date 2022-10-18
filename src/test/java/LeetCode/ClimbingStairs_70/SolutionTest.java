package LeetCode.ClimbingStairs_70;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(1, 1),
                Arguments.of(4, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int input, int expected) {
        assertEquals(expected, solution.climbStairs(input));
    }

//    @Test
//    void recursionMethodTimeTest() {
//        long start = System.currentTimeMillis();
//        solution.climbStairsRec(45);
//        long diff = System.currentTimeMillis() - start;
//        System.out.println(diff);
//        assertTrue(diff < 100);
//    }

    @Test
    void loopMethodTimeTest() {
        long start = System.currentTimeMillis();
        solution.climbStairs(45);
        long diff = System.currentTimeMillis() - start;
        System.out.println(diff);
        assertTrue(diff < 100);
    }

}