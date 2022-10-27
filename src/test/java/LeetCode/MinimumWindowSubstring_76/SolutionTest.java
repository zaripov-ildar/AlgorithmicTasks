package LeetCode.MinimumWindowSubstring_76;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("ADOBECODEBANC", "ABC", "BANC"),
                Arguments.of("a", "a", "a"),
                Arguments.of("a", "aa", ""),
                Arguments.of("ab", "a", "a"),
                Arguments.of("a", "b", "")
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String s, String t, String expected) {
        assertEquals(expected, solution.minWindow(s,t));
    }
}