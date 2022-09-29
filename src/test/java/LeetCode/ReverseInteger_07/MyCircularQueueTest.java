package LeetCode.ReverseInteger_07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {

    Solution solution = new Solution();

    @Test
    void testHighBounds() {
        int x = 1234567899;
        assertEquals(0, solution.reverse(x));
    }

    @Test
    void testLowBounds() {
        int x = -1234567899;
        assertEquals(0, solution.reverse(x));
    }

    @Test
    void example_1() {
        int input = 123;
        int output = 321;
        assertEquals(output, solution.reverse(input));
    }

    @Test
    void example_2() {
        int input = -123;
        int output = -321;
        assertEquals(output, solution.reverse(input));
    }

    @Test
    void example_3() {
        int input = 120;
        int output = 21;
        assertEquals(output, solution.reverse(input));
    }

    @Test
    void durationTest() {
        int experiment = 100_000;
        int averageDuration = 0;
        for (int i = 0; i < experiment; i++) {
            averageDuration += getDuration();
        }

        System.out.println(averageDuration);
        assertTrue(50_000_000 > averageDuration);
    }

    private long getDuration() {
        long start = System.nanoTime();
        solution.reverse(Integer.MAX_VALUE-1);
        return System.nanoTime() - start;
    }

}