package LeetCode.MaximumValueofKCoinsFromPiles_2218;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(List.of(
                        List.of(1, 100, 3),
                        List.of(7, 8, 9)), 2, 101),
                Arguments.of(
                        List.of(
                                List.of(100),
                                List.of(100),
                                List.of(100),
                                List.of(100),
                                List.of(100),
                                List.of(100),
                                List.of(1, 1, 1, 1, 1, 1, 700)),
                        7, 706));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(List<List<Integer>> piles, int k, int expected) {
        assertEquals(expected, solution.maxValueOfCoins(piles, k));
    }
}