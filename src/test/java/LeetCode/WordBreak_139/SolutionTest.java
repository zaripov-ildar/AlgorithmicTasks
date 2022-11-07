package LeetCode.WordBreak_139;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of("leetcode", List.of("leet","code"), true),
                Arguments.of("applepenapple", List.of("apple","pen"), true),
                Arguments.of("catsandog", List.of("cats","dog","sand","and","cat"), false),
                Arguments.of("aaaaaaa", List.of("aaa","aaaa"), true)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String s, List<String> wordDict, boolean expected){
        assertEquals(expected, solution.wordBreak(s, wordDict));
    }
}