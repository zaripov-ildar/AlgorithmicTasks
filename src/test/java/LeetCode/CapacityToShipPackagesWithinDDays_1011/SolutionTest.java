package LeetCode.CapacityToShipPackagesWithinDDays_1011;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(15, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5),
                Arguments.of(6, new int[]{3, 2, 2, 4, 1, 4}, 3),
                Arguments.of(3, new int[]{1, 2, 3, 1, 1}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int expected, int[] weights, int days) {
        assertEquals(expected, solution.shipWithinDays(weights, days));
    }
}