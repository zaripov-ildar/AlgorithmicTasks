package LeetCode.ClimbingStairs_70;

class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int prev = 1,
                cur = 2;
        for (int i = 0; i < n - 2; i++) {
            int temp = cur + prev;
            prev = cur;
            cur = temp;
        }
        return cur;
    }
}

//very slow recursion:
//public int climbStairsRec(int n) {
//    if (n == 1) {
//        return 1;
//    }
//    if (n == 2) {
//        return 2;
//    }
//    return climbStairsRec(n - 1) + climbStairsRec(n - 2);
//}
