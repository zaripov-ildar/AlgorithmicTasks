package LeetCode.Dota2Senate_649;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }
        int rad, dir;
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            rad = radiant.poll();
            dir = dire.poll();
            if (rad < dir) {
                radiant.add(rad + n);
            } else {
                dire.add(dir + n);
            }
        }
        return (radiant.size() > dire.size()) ? "Radiant" : "Dire";
    }
}