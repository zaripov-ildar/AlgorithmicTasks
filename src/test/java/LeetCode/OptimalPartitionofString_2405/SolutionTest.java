package LeetCode.OptimalPartitionofString_2405;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static LeetCode.HandsomeMethods.getRandomString;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import LeetCode.Timer;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of("abacaba",4),
                Arguments.of("ssssss", 6),
                Arguments.of("jkbqcbiqmcxmxqoptqxdgqgqldhq",7),
                Arguments.of("hdklqkcssgxlvehva",4)                
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test( String s, int expected){
	assertEquals(expected, solution.partitionString(s));
    }
    
    @Test
    void timeTest(){
	String string = getRandomString(1000);
	System.out.println(string);
	Timer timer = new Timer();
	timer.compareFunctions(
		()->solution.partitionString2(string),
		()->solution.partitionString(string)
		);
    }
}