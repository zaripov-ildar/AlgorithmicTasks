package LeetCode.SuccessfulPairsofSpellsandPotions_2300;

import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            spells[i] = getAmount(spells[i], potions, success);
        }
        System.out.println(Arrays.toString(spells));
        return spells;
    }

    private int getAmount(int spell, int[] potions, long success) {
        int left = 0;
        int right = potions.length - 1;
        int mid;
        while (left <= right) {
            mid = left + right >> 1;
            long prod = (long) spell * potions[mid];
            if (prod >= success) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return potions.length - left;
    }
}