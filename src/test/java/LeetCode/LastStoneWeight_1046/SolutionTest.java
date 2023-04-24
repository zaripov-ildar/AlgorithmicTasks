package LeetCode.LastStoneWeight_1046;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int []{2,7,4,1,8,1}, 1),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{2,2}, 0)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int [] stones, int expected){
        assertEquals(expected, solution.lastStoneWeight(stones));
    }
}