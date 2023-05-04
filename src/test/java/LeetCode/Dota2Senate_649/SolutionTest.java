package LeetCode.Dota2Senate_649;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("RD", "Radiant"),
                Arguments.of("RDD", "Dire"),
                Arguments.of("DDRRR", "Dire")
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String senate, String expected) {
        assertEquals(expected, solution.predictPartyVictory(senate));
    }
}