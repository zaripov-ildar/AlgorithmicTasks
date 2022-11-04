package LeetCode.ReverseVowelsofaString_345;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class   SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of("hello", "holle"),
                Arguments.of("leetcode", "leotcede"),
                Arguments.of("aA", "Aa")
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String input,  String expected){
        assertEquals(expected, solution.reverseVowels(input));
    }

}