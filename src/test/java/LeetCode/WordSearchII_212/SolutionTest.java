package LeetCode.WordSearchII_212;

import LeetCode.HandsomeMethods;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        List<String> l1 = new ArrayList<>();
        l1.add("eat");
        l1.add("oath");
        List<String> l2 = new ArrayList<>();
        l2.add("oa");
        l2.add("oaa");
        List<String> l3 = new ArrayList<>(Arrays.stream(new String[]{"abcdefg", "befa", "eaabcdgfa", "gfedcbaaa"})
                .toList());

        return Stream.of(
//                Arguments.of(new char[][]{
//                                {'o', 'a', 'a', 'n'},
//                                {'e', 't', 'a', 'e'},
//                                {'i', 'h', 'k', 'r'},
//                                {'i', 'f', 'l', 'v'}},
//                        new String[]{"eat", "oath", "rain", "pea"},
//                        l1
//                ),
//                Arguments.of(new char[][]{
//                                {'a', 'b'},
//                                {'c', 'd'}},
//                        new String[]{"abcb"},
//                        new ArrayList<>()
//                ),
//                Arguments.of(new char[][]{
//                                {'o', 'a', 'b', 'n'},
//                                {'o', 't', 'a', 'e'},
//                                {'a', 'h', 'k', 'r'},
//                                {'a', 'f', 'l', 'v'}},
//                        new String[]{"oa", "oaa"},
//                        l2
//                ),
                Arguments.of(new char[][]{
                                {'a', 'b', 'c'},
                                {'a', 'e', 'd'},
                                {'a', 'f', 'g'}},
                        new String[]{"gfedcbaaa", "eaabcdgfa", "abcdefg", "befa", "dgc", "ade"},
                        l3
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(char[][] input, String[] words, List<String> expected) {
        boolean result = HandsomeMethods.equals(expected, solution.findWords(input, words));
        assertTrue(result);
    }
}