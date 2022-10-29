package LeetCode.EarliestPossibleDayofFullBloom_2136;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {

    static class Seed {
        final int plantTime;
        final int growTime;
        final int id;

        public Seed(int plantTime, int growTime, int id) {
            this.plantTime = plantTime;
            this.growTime = growTime;
            this.id = id;
        }
    }

    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int len = plantTime.length;
        List<Seed> seeds = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            seeds.add(new Seed(plantTime[i], growTime[i], i));
        }
        seeds.sort(Comparator.comparingInt(o -> -o.growTime));
        int timeStamp = 0;
        int result = 0;
        for (Seed seed : seeds) {
            int temp = timeStamp + seed.growTime + seed.plantTime;
            result = Math.max(result, temp);
            timeStamp += seed.plantTime;
        }
        return result;
    }
}
