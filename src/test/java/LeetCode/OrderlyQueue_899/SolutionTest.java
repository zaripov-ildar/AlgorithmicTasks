package LeetCode.OrderlyQueue_899;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("cba", 1, "acb"),
                Arguments.of("baaca", 3, "aaabc")
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String s, int k, String expected) {
        assertEquals(expected, solution.orderlyQueue(s, k));
    }

}