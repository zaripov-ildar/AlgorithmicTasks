package LeetCode.DetectCapital_520;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of("USA", true),
                Arguments.of("FlaG", false),
                Arguments.of("leetcode", true),
                Arguments.of("a", true),
                Arguments.of("mL", false)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String word, boolean exp){
        assertEquals(exp, solution.detectCapitalUse(word));
    }
}