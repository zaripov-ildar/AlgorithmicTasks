package LeetCode.MaximumLengthOfAConcatenatedStringWithUniqueCharacters_1239;

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
//                Arguments.of(List.of("un","iq","ue"), 4 ),
//                Arguments.of(List.of("cha","r","act","ers"), 6),
                Arguments.of(List.of("abcdefghijklmnopqrstuvwxyz"), 26),
                Arguments.of(List.of("zog","nvwsuikgndmfexxgjtkb","nxko"), 4),
                Arguments.of(List.of("aa","bb"), 0)

        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void maxLength(List<String> input, int expected){
        assertEquals(expected, solution.maxLength(input));
    }

}