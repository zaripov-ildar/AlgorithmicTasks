package LeetCode.CountAndSay_38;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "11"),
                Arguments.of(3, "21"),
                Arguments.of(4, "1211"),
                Arguments.of(5, "111221"),
                Arguments.of(6, "312211")
        );
    }
    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int input, String expected){
        assertEquals(expected, solution.countAndSay(input));
    }
}