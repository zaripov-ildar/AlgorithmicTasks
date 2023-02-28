package LeetCode.PalindromeNumber_09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {
    Solution solution = new Solution();

    @Test
    void checkPalindrome() {
        int input = 121;
        assertTrue(solution.isPalindrome(input));
    }

    @Test
    void checkNegative() {
        int input = -121;
        assertFalse(solution.isPalindrome(input));
    }

    @Test
    void checkZeroEnd() {
        int input = 10;
        assertFalse(solution.isPalindrome(input));
    }

    @Test
    void checkZero() {
        int input = 0;
        assertTrue(solution.isPalindrome(input));
    }


}