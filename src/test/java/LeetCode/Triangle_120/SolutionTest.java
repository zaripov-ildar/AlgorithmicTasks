package LeetCode.Triangle_120;

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
                Arguments.of(List.of(List.of(2),List.of(3,4), List.of(6,5,7), List.of(4,1,8,3)), 11),
                Arguments.of(List.of(List.of(-10)), -10)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(List<List<Integer>> input, int expected){
        assertEquals(expected, solution.minimumTotal(input));
    }

}