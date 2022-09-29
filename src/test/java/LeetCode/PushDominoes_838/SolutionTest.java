package LeetCode.PushDominoes_838;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Duration;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of("RR.L", "RR.L"),
                Arguments.of(".L.R...LR..L..", "LL.RR.LLRRLL..")
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void dominoesTest(String provided, String expected) {
        assertEquals(expected, solution.pushDominoes(provided));
    }

    @Test
    void timeTest() {
        String s = "a;rgakjbaskdjva;kferq;kherkjfherk;jfghakjfasdkfkfjqewkjfneqrf";
        char[] chars = new char[s.length()];
        double x = 0;
        for (int i = 0; i < 10000000; i++) {
            x+=Math.random();
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < chars.length; j++) {
                chars[j] = s.charAt(j);
            }
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            chars = s.toCharArray();
        }

        System.out.println(System.currentTimeMillis() - start);
    }

}