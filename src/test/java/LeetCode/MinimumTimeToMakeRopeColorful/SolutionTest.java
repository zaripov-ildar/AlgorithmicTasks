package LeetCode.MinimumTimeToMakeRopeColorful;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    static Stream<Arguments> testArguments(){
        return  Stream.of(
                Arguments.of("abaac",new int[] {1,2,3,4,5}, 3),
                Arguments.of("abc",new int[] {1,2,3}, 0),
                Arguments.of("aabaa",new int[] {1,2,3,4,1}, 2)

        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testMinCost(String colors, int[] neededTime, int expected){
        assertEquals(expected, solution.minCost(colors,neededTime));
    }

}