package LeetCode.TheSkulineProblem_218;

import java.util.*;

class Solution {
    private TreeMap<Integer, Integer> map = new TreeMap<>();

    public List<List<Integer>> getSkyline(int[][] buildings) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < buildings.length; i++) {
            for (int j = buildings[i][0]; j <= buildings[i][1]; j++) {
                if (map.containsKey(j)) {
                    if (map.get(j) < buildings[i][2]) {
                        map.put(j, buildings[i][2]);
                    }
                } else {
                    map.put(j, buildings[i][2]);
                }
            }
        }
        map.put(map.firstKey() - 1, 0);
        map.put(map.lastKey() + 1, 0);
        System.out.println(map);
        Map.Entry<Integer, Integer> previous = map.pollFirstEntry();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (previous.getValue() < entry.getValue()) {
                result.add(List.of(entry.getKey(), entry.getValue()));
            }else if(!map.containsKey(entry.getKey()+1)){
                result.add(List.of(entry.getKey(), 0));
            }
            else  if(previous.getValue() > entry.getValue()){
                result.add(List.of(previous.getKey(), entry.getValue()));
            }

            previous = entry;

        }
        return result;
    }
}
