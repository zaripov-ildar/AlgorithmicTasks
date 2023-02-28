package LeetCode.MedianOfTwoSortedArrays_04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {
    private final Solution solution = new Solution();
    @Test
    void oddTotalArray(){
        int [] num1 = {1,3};
        int [] num2 = {2};
        assertEquals(2d, solution.findMedianSortedArrays(num1,num2));
    }

    @Test
    void evenTotalArray(){
        int [] num1 = {1,2};
        int [] num2 = {3,4};
        assertEquals(2.5d, solution.findMedianSortedArrays(num1,num2));
    }

    @Test
    void oneArrayIsEmpty(){
        int [] num1 = {};
        int [] num2 = {1,2};
        assertEquals(1.5d, solution.findMedianSortedArrays(num1,num2));
    }
}