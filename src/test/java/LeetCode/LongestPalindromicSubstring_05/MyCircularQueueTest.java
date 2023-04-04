package LeetCode.LongestPalindromicSubstring_05;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {
    private final Solution solution = new Solution();

    @Test
    void emptyString() {
        String input = "";
        assertEquals("", solution.longestPalindrome(input));
    }

    @Test
    void twoSolutions() {
        String input = "babad";
        List<String> strings = List.of(
                "bab",
                "aba"
        );
        assertTrue(strings.contains(solution.longestPalindrome(input)));
    }

    @Test
    void oneChar() {
        String input = "a";
        assertEquals("a", solution.longestPalindrome(input));
    }

    @Test
    void coupleChar() {
        String input = "cbbd";
        assertEquals("bb", solution.longestPalindrome(input));
    }

    @Test
    void equalCouple(){
        String input = "bb";
        assertEquals("bb", solution.longestPalindrome(input));
    }
}