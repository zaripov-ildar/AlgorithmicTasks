package LeetCode.Combinations_77;

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
                Arguments.of(4, 2, List.of(
                        List.of(1, 2),
                        List.of(1, 3),
                        List.of(1, 4),
                        List.of(2, 3),
                        List.of(2, 4),
                        List.of(3, 4))),
                Arguments.of(1, 1, List.of(List.of(1)))
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int n, int k, List<List<Integer>> list){
        List<List<Integer>> res = solution.combine(n,k);
        for (List<Integer> re : res) {
            System.out.println(re);
        }
    }
}