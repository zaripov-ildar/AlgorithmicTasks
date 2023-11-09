package LeetCode.DetermineifaCellIsReachableataGivenTime_2849;

class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if (sx == fx && sy == fy) return false;
        int dx = Math.abs(sx - fx);
        int dy = Math.abs(sy - fy);
        int l = Math.max(dx, dy);
        return l <= t;
    }
}