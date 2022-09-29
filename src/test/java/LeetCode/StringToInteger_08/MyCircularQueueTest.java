package LeetCode.StringToInteger_08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyCircularQueueTest {

    private final Solution solution = new Solution();


    @Test
    void commonNumber() {
        String s = "42";
        int output = 42;
        assertEquals(output, solution.myAtoi(s));
    }

    @Test
    void negativeNumber() {
        String s = "-42";

        int output = -42;
        assertEquals(output, solution.myAtoi(s));
    }

    @Test
    void numberWithSpace() {
        String s = "   -42";
        int output = -42;
        assertEquals(output, solution.myAtoi(s));
    }

    @Test
    void numberWithCharacters() {
        String s = "4193 with words";
        int output = 4193;
        assertEquals(output, solution.myAtoi(s));
    }

    @Test
    void startsWithNotNumber() {
        String s = " q42";
        int output = 0;
        assertEquals(output, solution.myAtoi(s));
    }

    @Test
    void tooSmallNumber() {
        String s = "-91283472332";
        int output = -2147483648;
        assertEquals(output, solution.myAtoi(s));
    }

    @Test
    void tooBigNumber() {
        String s = "91283472332";
        int output = Integer.MAX_VALUE;
        assertEquals(output, solution.myAtoi(s));
    }


}