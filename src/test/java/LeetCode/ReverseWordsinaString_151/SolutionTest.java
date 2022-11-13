package LeetCode.ReverseWordsinaString_151;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of("the sky is blue", "blue is sky the"),
                Arguments.of("  hello world  ","world hello"),
                Arguments.of("a good   example", "example good a"),
                Arguments.of("aqwe", "aqwe")

                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String in, String exp){
        assertEquals(exp, solution.reverseWords(in));
    }

}