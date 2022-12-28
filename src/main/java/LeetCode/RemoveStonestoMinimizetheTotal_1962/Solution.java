package LeetCode.RemoveStonestoMinimizetheTotal_1962;

import java.util.PriorityQueue;

class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int pile : piles) {
            pq.add(pile);
        }
        for (int i = 0; i < k; i++) {
            pq.add(Math.round((float) pq.poll() / 2));
        }
        return pq.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
