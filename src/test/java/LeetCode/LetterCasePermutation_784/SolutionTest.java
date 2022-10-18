package LeetCode.LetterCasePermutation_784;

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
                Arguments.of("a1b2", List.of("a1b2","a1B2","A1b2","A1B2")),
                Arguments.of("3z4", List.of("3z4","3Z4"))
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String s, List<String> expected){
        List<String> res = solution.letterCasePermutation(s);
        System.out.println(res);
        assertTrue(res.containsAll(expected) && expected.containsAll(res));
    }
}