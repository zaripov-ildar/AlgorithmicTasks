package LeetCode.KokoEatingBananas_875;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1,
                right = getMaxPile(piles),
                k;

        while (left < right) {
            k = (left + right) >> 1;
            if (managesToEat(piles, h, k)) {
                right = k;
            } else {
                left = k + 1;
            }
        }
        return left;
    }

    private int getMaxPile(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }

    private boolean managesToEat(int[] piles, int h, int k) {
        int hoursOnPile,
                totalHours = 0;

        for (int pile : piles) {
            hoursOnPile = pile / k;
            totalHours += hoursOnPile;
            if (pile % k != 0) {
                totalHours++;
            }
            if (totalHours > h) {
                return false;
            }
        }
        return true;
    }
}
