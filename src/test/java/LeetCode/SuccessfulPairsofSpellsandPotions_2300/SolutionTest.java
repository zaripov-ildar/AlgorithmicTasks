package LeetCode.SuccessfulPairsofSpellsandPotions_2300;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7, new int[]{4, 0, 3}),
                Arguments.of(new int[]{3, 1, 2}, new int[]{8, 5, 8}, 16, new int[]{2, 0, 2}),
                Arguments.of(new int[]{1,2,3,4,5,6,7}, new int[]{1,2,3,4,5,6,7}, 25, new int[]{0,0,0,1,3,3,4}),
                Arguments.of(new int[]{15,8,19}, new int[]{38,36,23}, 328, new int[]{3,0,3})
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] spells, int[] potions, int success, int[] expected) {
        assertArrayEquals(expected, solution.successfulPairs(spells, potions, success));
    }
}