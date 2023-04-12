package LeetCode.SimplifyPath_71;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("/home/", "/home"),
                Arguments.of("/../", "/"),
                Arguments.of("/home//foo/", "/home/foo"),
                Arguments.of("/a//b////c/d//././/..", "/a/b/c"));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String s, String expected) {
        assertEquals(expected, solution.simplifyPath(s));
    }
}