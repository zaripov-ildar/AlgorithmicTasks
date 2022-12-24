package LeetCode.DominoandTrominoTiling_790;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(3, 5),
                Arguments.of(1, 1),
                Arguments.of(4, 11),
                Arguments.of(1000, 979232805)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int in, int exp) {
        assertEquals(exp, solution.numTilings(in));
    }
}