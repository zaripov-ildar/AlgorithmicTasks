package LeetCode.RemovingStarsFromaString_2390;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import LeetCode.Timer;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
	return Stream.of(
		Arguments.of("leet**cod*e", "lecoe"),
		Arguments.of("erase*****", ""));
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String s, String expected) {
	assertEquals(expected, solution.removeStars(s));
    }

    @Test
    void timeTest() {
	StringBuilder sb = new StringBuilder(10_000);
	for (int i = 0; i < 5000; i++) {
	    sb.append('a');
	}
	for (int i = 0; i < 5000; i++) {
	    sb.append('*');
	}
	String s = sb.toString();
	Timer timer = new Timer();

	timer.compareFunctions(
		() -> solution.removeStars2(s),
		() -> solution.removeStars(s),
		() -> solution.removeStars3(s)
		);
    }
}