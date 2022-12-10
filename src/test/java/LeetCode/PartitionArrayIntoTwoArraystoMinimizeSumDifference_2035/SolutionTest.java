package LeetCode.PartitionArrayIntoTwoArraystoMinimizeSumDifference_2035;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[]{42,41,59,43,69,67}, 13),
                Arguments.of(new int[] {3,9,7,3}, 2),
                Arguments.of(new int[]{-36,36}, 72),
                Arguments.of(new int[]{2,-1,0,4,-2,-9}, 0),
                Arguments.of(new int[]{7772197,4460211,-7641449,-8856364,546755,
                        -3673029,527497,-9392076,3130315,-5309187,
                        -4781283,5919119,3093450,1132720,6380128,
                        -3954678,-165199,-7944388,-3056827,1610628,
                        7711173,6595873,302974,7656726,-2572679,
                        0,2121026,-5743797,-8897395,-9699694}, 1)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int [] in, int exp){
        assertEquals(exp, solution.minimumDifference(in));
    }
}