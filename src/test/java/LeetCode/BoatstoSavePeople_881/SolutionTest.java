package LeetCode.BoatstoSavePeople_881;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[] {1,2}, 3, 1),
                Arguments.of(new int[] {3,2,2,1}, 3, 3),
                Arguments.of(new int[] {3,5,3,4}, 5, 4),
                Arguments.of(new int[] {2,4}, 5, 2)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] people, int limit, int expected){
	assertEquals(expected, solution.numRescueBoats(people, limit));
    }
}