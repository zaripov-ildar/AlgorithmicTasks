package LeetCode.DetermineifaCellIsReachableataGivenTime_2849;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(2, 4, 7, 7, 6, true),
                Arguments.of(3, 1, 7, 3, 3, false),
                Arguments.of(3, 4, 3, 4, 1, false),
                Arguments.of(3, 4, 3, 4, 100, true)

        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int sx, int sy, int fx, int fy, int t, boolean expected) {
        assertEquals(expected, solution.isReachableAtTime(sx, sy, fx, fy, t));
    }
}