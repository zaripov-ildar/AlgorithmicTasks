package LeetCode.CanPlaceFlowers_605;

import LeetCode.Timer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {

        return Stream.of(
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 1, true),
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 2, false),
                Arguments.of(new int[]{1}, 1, false),
                Arguments.of(new int[]{0}, 1, true)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] flowerbed, int n, boolean expected) {
        assertEquals(expected, solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void timeTest() {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() > .75 ? 1 : 0;
        }
        Timer timer = new Timer();
        timer.compareFunctions(
                250_000,
                () -> solution.canPlaceFlowers2(arr, 1500),
                () -> solution.canPlaceFlowers(arr, 1500)
        );
    }
}