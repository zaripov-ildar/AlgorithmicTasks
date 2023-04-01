package LeetCode.ScrambleString_87;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("great", "rgeat", true),
                Arguments.of("abcde", "caebd", false),
                Arguments.of("a", "a", true)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String s1, String s2, boolean expected) {
        assertEquals(expected, solution.isScramble(s1, s2));
    }
}