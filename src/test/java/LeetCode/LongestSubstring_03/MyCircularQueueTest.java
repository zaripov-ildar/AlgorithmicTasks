package LeetCode.LongestSubstring_03;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyCircularQueueTest {
    private final Solution solution = new Solution();
    @Test
    void lengthOfLongestSubstring() {
        String
                s = "abcabcbb";
        assertEquals(3,  solution.lengthOfLongestSubstring(s));

        s = "bbbbb";
        assertEquals(1, solution.lengthOfLongestSubstring(s));

        s = "pwwkew";
        assertEquals(3,  solution.lengthOfLongestSubstring(s));

        s = "";
        assertEquals(0,  solution.lengthOfLongestSubstring(s));

        s="qwertyui";
        assertEquals(8,  solution.lengthOfLongestSubstring(s));

        s = "b";
        assertEquals(1, solution.lengthOfLongestSubstring(s));
    }
}