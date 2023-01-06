package LeetCode.MaximumIceCreamBars_1833;

import LeetCode.Timer;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        int[] costs = new int[50_000];
        Random rnd = new Random();
        for (int i = 0; i < costs.length; i++) {
            costs[i] = rnd.nextInt(5);
        }

        return Stream.of(
                Arguments.of(costs, 100_000_000, 50_000),
                Arguments.of(new int[]{1, 3, 2, 4, 1}, 7, 4),
                Arguments.of(new int[]{10, 6, 8, 7, 7, 8}, 5, 0),
                Arguments.of(new int[]{1, 6, 3, 1, 2, 5}, 20, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] cost, int coins, int expected) {
        assertEquals(expected, solution.maxIceCream(cost, coins));
        assertEquals(expected, solution.maxIceCream2(cost, coins));
        assertEquals(expected, solution.maxIceCream3(cost, coins));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void timerTest(int[] cost, int coins, int expected) {
        Timer timer = new Timer();
        timer.compareFunctions(()-> solution.maxIceCream(cost, coins),
                ()-> solution.maxIceCream2(cost, coins),
                ()-> solution.maxIceCream3(cost,coins));
    }

}