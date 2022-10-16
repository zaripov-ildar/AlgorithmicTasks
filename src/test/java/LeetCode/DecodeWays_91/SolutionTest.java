package LeetCode.DecodeWays_91;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of("12", 2),
                Arguments.of("226", 3),
                Arguments.of("06", 0),
                Arguments.of("10", 1)

        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String s, int expected){
        assertEquals(expected, solution.numDecodings(s));
    }

}