package LeetCode.BusRoutes_815;

import java.util.*;

class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) return 0;

        Map<Integer, List<Integer>> stopToBuses = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int station : routes[i]) {
                stopToBuses.computeIfAbsent(station, k -> new ArrayList<>()).add(i);
            }
        }

//        if (!stopToBuses.containsKey(source) || !stopToBuses.containsKey(target)) {
//            return -1;
//        }



        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> from = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(source);
        int result = 0;

        while (!queue.isEmpty()) {
            result++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int station = queue.poll();
                for (int busId : stopToBuses.getOrDefault(station, new ArrayList<>())) {
                    if (from.contains(busId)) continue;
                    from.add(busId);
                    for (int next : routes[busId]) {
                        if (visited.contains(next)) continue;
                        if (next == target) return result;
                        queue.offer(next);
                        visited.add(next);
                    }
                }
            }
        }
        return -1;
    }
}