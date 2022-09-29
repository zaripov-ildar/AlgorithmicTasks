package LeetCode.TheNumberOfWeakCharactersInTheGame_1996;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[][] {{5,5},{6,3},{3,6}}, 0),
                Arguments.of(new int[][] {{2,2},{3,3}}, 1),
                Arguments.of(new int[][] {{1,5},{10,4},{4,3}}, 1),
                Arguments.of(new int[][] {{1,1},{2,1},{2,2}, {1,2}}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void justTest(int[][] properties, int result){
        assertEquals(result, solution.numberOfWeakCharacters(properties));
    }
}