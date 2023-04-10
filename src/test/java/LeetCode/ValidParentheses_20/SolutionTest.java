package LeetCode.ValidParentheses_20;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String s, boolean expected){
	assertEquals(expected, solution.isValid(s));
    }
}