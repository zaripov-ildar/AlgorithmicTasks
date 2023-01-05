package LeetCode.MinimumNumberofArrowstoBurstBalloons_452;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(p -> p[1]));
        int lastBurst = 0;
        int arrows = 1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0]>points[lastBurst][1]){
                arrows ++;
                lastBurst=i;
            }
        }
        return arrows;
    }
}