package LeetCode.NumberOfDiceRollsWithTargetSum_1155;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();;
    static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(1,6,3,1),
                Arguments.of(2,6,7,6),
                Arguments.of(30,30,500, 222616187)
        );
    }
    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n, int k, int target, int expected){
        assertEquals(expected, solution.numRollsToTarget(n,k,target));
    }
}