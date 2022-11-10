package LeetCode.PascalsTriangle_118;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(5, List.of(
                        List.of(1),
                        List.of(1, 1),
                        List.of(1, 2, 1),
                        List.of(1, 3, 3, 1),
                        List.of(1, 4, 6, 4, 1)

                )),
                Arguments.of(1, List.of(List.of(1)))
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int i, List<List<Integer>> expected) {
        assertEquals(expected, solution.generate(i));
    }

}