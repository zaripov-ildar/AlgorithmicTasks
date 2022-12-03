package LeetCode.SortCharactersByFrequency_451;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of("tree"),
                Arguments.of("cccaaa"),
                Arguments.of("Aabb")
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String in){
        System.out.println(solution.frequencySort(in));
    }

}