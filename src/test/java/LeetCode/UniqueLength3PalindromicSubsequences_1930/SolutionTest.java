package LeetCode.UniqueLength3PalindromicSubsequences_1930;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {

        return Stream.of(
                Arguments.of("aabca", 3),
                Arguments.of("adc", 0),
                Arguments.of("ckafnafqo", 4),
                Arguments.of("bbcbaba", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String input, int expected) {
        assertEquals(expected, solution.countPalindromicSubsequence(input));    }

}