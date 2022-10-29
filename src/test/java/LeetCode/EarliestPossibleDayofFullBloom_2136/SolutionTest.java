package LeetCode.EarliestPossibleDayofFullBloom_2136;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[]{1,2,3,2}, new int[]{2,1,2,1}, 9),
                Arguments.of(new int[]{1,4,3}, new int[]{2,3,1}, 9)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] plantTime, int [] growTime, int expected){
        assertEquals(expected, solution.earliestFullBloom(plantTime, growTime));
    }

}