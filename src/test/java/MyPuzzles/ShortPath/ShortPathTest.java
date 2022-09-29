package MyPuzzles.ShortPath;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ShortPathTest {

    ShortPath shortPath =new ShortPath();

    static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[][]{
                        {2,0,0},
                        {0,0,0},
                        {0,0,3}}, 4

                ),
                Arguments.of(new int[][]{
                        {2,0,1},
                        {0,1,0},
                        {1,0,3}}, -1

                ),
                Arguments.of(new int[][]{
                        {2,0,0},
                        {0,1,3},
                        {0,0,0}}, 3

                )

        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
        void shortPathTest(int[][] input, int expected){
        assertEquals(expected, shortPath.calculate(input));
    }

}