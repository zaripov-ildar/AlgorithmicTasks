package LeetCode.EditDistance_72;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("horse", "ros", 3),
                Arguments.of("intention", "execution", 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String w1, String w2, int expected) {
        assertEquals(expected, solution.minDistance(w1, w2));
    }
}