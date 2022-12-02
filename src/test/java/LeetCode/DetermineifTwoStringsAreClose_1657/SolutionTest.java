package LeetCode.DetermineifTwoStringsAreClose_1657;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("abc", "bca", true),
                Arguments.of("a", "aa", false),
                Arguments.of("cabbba", "abbccc", true),
                Arguments.of("uau", "ssx", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String s1, String s2, boolean expected) {
        assertEquals(expected, solution.closeStrings(s1, s2));
    }

}