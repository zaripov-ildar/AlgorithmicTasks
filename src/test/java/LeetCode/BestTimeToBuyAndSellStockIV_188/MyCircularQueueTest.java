package LeetCode.BestTimeToBuyAndSellStockIV_188;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {
    private Solution solution = new Solution();

    private static Stream<Arguments> argumentsForNextComposition() {
        return Stream.of(
                Arguments.of(2, new int[]{2, 4, 1}),
                Arguments.of(7, new int[]{3, 2, 6, 5, 0, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsForNextComposition")
    void testForNextComposition(int k, int[] price) {
        assertEquals(k, solution.maxProfit(k, price));
    }

}