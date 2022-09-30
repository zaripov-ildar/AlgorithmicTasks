package LeetCode.FindKClosestElement_658;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4, 3, List.of(1, 2, 3, 4)),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4, -1, List.of(1, 2, 3, 4)),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4, 6, List.of(2, 3, 4, 5))
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testSolution(int[] arr, int k, int x, List<Integer> expected) {
        assertEquals(expected, solution.findClosestElements(arr, k, x));
    }
}