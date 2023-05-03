package LeetCode.FindtheDifferenceofTwoArrays_2215;

import LeetCode.HandsomeMethods;
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
                Arguments.of(new int[]{1, 2, 3}, new int[]{2, 4, 6}, List.of(List.of(1, 3), List.of(4, 6))),
                Arguments.of(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}, List.of(List.of(3), List.of()))
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] num1, int[] num2, List<List<Integer>> expected) {
        List<List<Integer>> res = solution.findDifference(num1, num2);
        assertTrue(HandsomeMethods.equals(res.get(0), expected.get(0)));
        assertTrue(HandsomeMethods.equals(res.get(1), expected.get(1)));
    }
}