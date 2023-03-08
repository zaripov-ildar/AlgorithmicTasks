package LeetCode.KokoEatingBananas_875;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[]{3,6,7,11}, 8, 4),
                Arguments.of(new int[]{30,11,23,4,20}, 5, 30),
                Arguments.of(new int[]{30,11,23,4,20},6, 23)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] piles, int h, int expected){
        assertEquals(expected, solution.minEatingSpeed(piles, h));
    }
}