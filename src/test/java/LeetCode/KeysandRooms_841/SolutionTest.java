package LeetCode.KeysandRooms_841;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(),
                Arguments.of(),
                Arguments.of()
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(){

    }

}