package LeetCode.LongestCommonPrefix_14;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new String[]{"flower","flow","flight"} ,"fl"),
                Arguments.of(new String[]{"dog","racecar","car"} ,""),
                Arguments.of(new String[]{"dog"} ,"dog")
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void prefixTest(String[] strs, String answer){
        assertEquals(answer, solution.longestCommonPrefix(strs));
    }

}