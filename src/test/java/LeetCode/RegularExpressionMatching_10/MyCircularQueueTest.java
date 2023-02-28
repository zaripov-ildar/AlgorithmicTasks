package LeetCode.RegularExpressionMatching_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {

    private final Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("aa", "a", false),
                Arguments.of("aa", "a*", true),
                Arguments.of("aa", ".*", true),
                Arguments.of("salavat", "s*a*.t", true),
                Arguments.of("aab", "c*a*b", false)
        );
    }

//    @Test
//    void checkInsert(){
//        char[] pattern = {'w','*','e','0','0'};
//        char[] expected = {'w','*','.','e','0'};
//        pattern = solution.insert(pattern,1);
//        System.out.println(pattern);
//        assertArrayEquals(expected, pattern);
//    }
    @ParameterizedTest
    @MethodSource("testArguments")
    void check(String s, String p, boolean result) {
        assertEquals(result, solution.isMatch(s, p));
    }
}