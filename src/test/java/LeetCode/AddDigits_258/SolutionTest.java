package LeetCode.AddDigits_258;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(357, 6),
                Arguments.of(65536, 7),
                Arguments.of(9,9)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int num, int expected){
        assertEquals(expected,  solution.addDigits(num));
    }
}