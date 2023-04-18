package LeetCode.MergeStringsAlternately_1768;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("ab", "pqrs", "apbqrs"),
                Arguments.of("abcd", "pq", "apbqcd"));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String w1, String w2, String expected) {
        assertEquals(expected, solution.mergeAlternately(w1, w2));
    }
}