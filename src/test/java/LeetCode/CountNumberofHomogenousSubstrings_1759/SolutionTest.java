package LeetCode.CountNumberofHomogenousSubstrings_1759;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        String s = "a".repeat(100_000);
        return Stream.of(
                Arguments.of("abbcccaa", 13),
                Arguments.of("xy", 2),
                Arguments.of("zzzzz", 15),
                Arguments.of(s, 49965)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String input, int expected) {
        assertEquals(expected, solution.countHomogenous(input));
    }
}