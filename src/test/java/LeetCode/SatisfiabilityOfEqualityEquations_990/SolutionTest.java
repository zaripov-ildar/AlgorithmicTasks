package LeetCode.SatisfiabilityOfEqualityEquations_990;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(false, new String[]{"a==b","b!=c","c==a"}),
                Arguments.of(false, new String[]{"a==b","b!=a"}),
                Arguments.of(true, new String[]{"b==a","a==b"}),
                Arguments.of(true, new String[]{"a==b","b==c", "a==c"}),
                Arguments.of(false, new String[]{"a==b","b==c", "a!=c"})
        );
    }
    @ParameterizedTest
    @MethodSource("testArguments")
    void mainTest(boolean expected, String[] provided ){
        assertEquals(expected, solution.equationsPossible(provided));
    }

}