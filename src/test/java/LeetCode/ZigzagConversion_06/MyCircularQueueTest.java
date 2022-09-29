package LeetCode.ZigzagConversion_06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {

    private final Solution solution = new Solution();

    @Test
    void threeRows(){
        String s = "PAYPALISHIRING";
        int numRows = 3;
        assertEquals("PAHNAPLSIIGYIR", solution.convert(s,numRows));
    }

    @Test
    void fourRows(){
        String s = "PAYPALISHIRING";
        int numRows = 4;
        assertEquals("PINALSIGYAHRPI", solution.convert(s,numRows));
    }

    @Test
    void oneChar(){
        String s = "A";
        int numRows = 1;
        assertEquals("A", solution.convert(s,numRows));

    }

    @Test
    void twoCharOneRow(){
        String s = "AB";
        int numRows = 1;
        assertEquals("AB", solution.convert(s,numRows));
    }

}