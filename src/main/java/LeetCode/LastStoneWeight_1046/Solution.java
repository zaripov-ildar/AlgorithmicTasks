package LeetCode.LastStoneWeight_1046;

import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            queue.add(stone);
        }
        while (queue.size() > 1) {
            int diff = queue.poll() - queue.poll();
            if (diff != 0) {
                queue.add(Math.abs(diff));
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }
}