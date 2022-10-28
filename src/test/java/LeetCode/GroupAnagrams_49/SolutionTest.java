package LeetCode.GroupAnagrams_49;

import org.junit.jupiter.api.Test;
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
                Arguments.of(new String[]{"eat","tea","tan","ate","nat","bat"},
                        List.of(
                                List.of("bat"),
                                List.of("nat","tan"),
                                List.of("ate","eat","tea")
                        )),
                Arguments.of(new String[]{""}, List.of(List.of(""))),
                Arguments.of(new String[]{"abbbbbbbbbbb","aaaaaaaaaaab"},
                        List.of(List.of("\"abbbbbbbbbbb\""), List.of("aaaaaaaaaaab"))),
                Arguments.of(new String[]{"a"}, List.of(List.of("a")))
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String[] input, List<List<String>> expected){
        List<List<String>> res = solution.groupAnagrams(input);
        for (int i = 0; i < expected.size(); i++) {
            System.out.print(expected.get(i));
            System.out.println("\t" + res.get(i));
        }
    }
}