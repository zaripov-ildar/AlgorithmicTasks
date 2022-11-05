package LeetCode.BestTimetoBuyandSellStock_121;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[]{7,1,5,3,6,4}, 5),
                Arguments.of(new int[]{7,6,4,3,1}, 0),
                Arguments.of(new int[]{7}, 0)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int [] input, int expected){
        assertEquals(expected, solution.maxProfit(input));
    }

}