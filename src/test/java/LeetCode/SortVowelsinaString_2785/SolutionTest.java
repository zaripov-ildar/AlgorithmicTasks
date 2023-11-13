package LeetCode.SortVowelsinaString_2785;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of("lEetcOde", "lEOtcede"),
                Arguments.of("lYmpH","lYmpH")
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String input, String expected){
        assertEquals(expected, solution.sortVowels(input));
    }
}