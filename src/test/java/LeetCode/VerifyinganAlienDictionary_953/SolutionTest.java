package LeetCode.VerifyinganAlienDictionary_953;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz", true),
                Arguments.of(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz", false),
                Arguments.of(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz", false),
                Arguments.of(new String[]{"kuvp","q"}, "ngxlkthsjuoqcpavbfdermiywz", true)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String[] words, String order, boolean expected) {
        assertEquals(expected, solution.isAlienSorted(words, order));
    }
}