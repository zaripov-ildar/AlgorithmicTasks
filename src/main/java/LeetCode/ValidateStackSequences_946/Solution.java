package LeetCode.ValidateStackSequences_946;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int index = 0;
        for (int p: pushed) {
            stack.push(p);
            while (!stack.isEmpty() && stack.peek() == popped[index]) {
                stack.pop();
                index++;
            }
        }
        return index == popped.length;
    }
}