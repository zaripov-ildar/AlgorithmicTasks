package LeetCode.MinimumRoundstoCompleteAllTasks_2244;

import LeetCode.Timer;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 3, 3, 2, 4, 4, 4, 4, 4}, 4),
                Arguments.of(new int[]{2, 3, 3}, -1)
        );
    }

//    @ParameterizedTest
//    @MethodSource("testArguments")
//    void test(int[] in, int expected) {
//        assertEquals(expected, solution.minimumRounds(in));
//    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void timeTest(int[] in, int expected) {
        Timer timer = new Timer();
        timer.compareFunctions(() -> solution.minimumRounds(in), () -> solution.minimumRounds2(in));
    }
}