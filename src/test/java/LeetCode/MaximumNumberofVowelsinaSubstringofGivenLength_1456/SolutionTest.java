package LeetCode.MaximumNumberofVowelsinaSubstringofGivenLength_1456;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("abciiidef", 3, 3),
                Arguments.of("aeiou", 2, 2),
                Arguments.of("leetcode", 3, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String s, int k, int expected) {
        assertEquals(expected, solution.maxVowels(s, k));
    }
}