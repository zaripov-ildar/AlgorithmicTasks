package LeetCode.KeysandRooms_841;

import java.util.*;

class Solution {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> keys = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        keys.add(0);
        visited.add(0);
        while (!keys.isEmpty()){
            int key = keys.poll();
            for (int room: rooms.get(key)){
                if (!visited.contains(room)){
                    visited.add(room);
                    keys.add(room);
                }
            }
        }
        return visited.size() == rooms.size();
    }
}
