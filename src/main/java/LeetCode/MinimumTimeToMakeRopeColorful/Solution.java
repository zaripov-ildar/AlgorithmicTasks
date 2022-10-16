package LeetCode.MinimumTimeToMakeRopeColorful;

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int max;
        int time = 0;

        for (int i = 0; i < neededTime.length - 1; i++) {
            max = neededTime[i];
            time += neededTime[i];
            while (i < neededTime.length - 1 && colors.charAt(i) == colors.charAt(i + 1)) {
                time += neededTime[i + 1];
                max = Math.max(max, neededTime[i + 1]);
                i++;
            }
            time -= max;
        }
        return time;
    }
}