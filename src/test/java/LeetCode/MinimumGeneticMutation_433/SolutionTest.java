package LeetCode.MinimumGeneticMutation_433;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"}, 1),
                Arguments.of("AACCGGTT", "AAACGGTA", new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"}, 2),
                Arguments.of("AAAAACCC", "AACCCCCC", new String[]{"AAAACCCC", "AAACCCCC", "AACCCCCC",}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String start, String end, String[] bank, int expected) {
        assertEquals(expected, solution.minMutation(start, end, bank));
    }
}