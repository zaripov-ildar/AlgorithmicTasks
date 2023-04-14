package LeetCode.LongestPalindromicSubsequence_516;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("bbbab", 4),
                Arguments.of("cbbd", 2));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String s, int expected) {
        assertEquals(expected, solution.longestPalindromeSubseq(s));
    }
}