package LeetCode.JumpGame_55;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void test(){
        assertTrue(solution.canJump(new int[]{2,3,1,1,4}));
        assertFalse(solution.canJump(new int[]{3,2,1,0,4}));
        assertTrue(solution.canJump(new int[]{0}));
    }
}