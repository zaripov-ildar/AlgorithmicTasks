package Yandex.Task_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(2000,5,3, new String[] {"1000x1000", "1000x1500","640x930","640x1500","3000x1000"}, "5574 10595"),
                Arguments.of(1000,5,5, new String[] {"1404x1386","1132x1110","1061x1801","1022x1519","1529x1003"}, "5810 5810"),
                Arguments.of(1000,1,1, new String[] {"1404x1386"}, "988 988"),
                Arguments.of(4096,2,1, new String[] {"640x4096", "4096x640"}, "640 26215")
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int feed, int total, int sub, String [] photos, String expected) throws IOException {
        assertEquals(expected, solution.forTest(feed, total, sub, photos));
    }
}