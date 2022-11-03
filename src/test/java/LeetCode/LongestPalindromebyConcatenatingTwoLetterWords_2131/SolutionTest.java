package LeetCode.LongestPalindromebyConcatenatingTwoLetterWords_2131;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new String[]{"lc","cl","gg"}, 6),
                Arguments.of(new String [] {"ab","ty","yt","lc","cl","ab"}, 8),
                Arguments.of(new String [] {"qo","fo","fq","qf","fo","ff","qq","qf","of","of","oo","of","of","qf","qf","of"}, 14),
                Arguments.of(new String[]{"cc","ll","xx"}, 2)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String [] input, int expected){
        assertEquals(expected, solution.longestPalindrome(input));
        System.out.println();
    }

}