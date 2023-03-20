package LeetCode.CanPlaceFlowers_605;

class Solution {
    //this is mine😁 faster in 3.373 times than next one most voted leetcode solutions
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int index = 0;
        while (index < flowerbed.length && n > 0) {
            if (index != flowerbed.length - 1 && flowerbed[index + 1] == 1) {
                index += 3;
                continue;
            }
            if (flowerbed[index] == 1) {
                index += 2;
                continue;
            }
            if (index != 0 && flowerbed[index - 1] == 1) {
                index++;
                continue;
            }
            flowerbed[index] = 1;
            n--;
            index += 2;
        }
        return n == 0;
    }

    //this is best of leetcode😁
    public boolean canPlaceFlowers2(int[] flowerbed, int n) {
        for (var i = 0; i < flowerbed.length && n > 0; i++)
            if (flowerbed[i] == 0) {

                var leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                var rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // plant the flower
                    n--;
                }
            }
        return n == 0;
    }


    public boolean isAvailable(int[] flowerbed, int index) {
        if ((index - 1 >= 0 && flowerbed[index - 1] == 1) || (index + 1 < flowerbed.length && flowerbed[index + 1] == 1)) {
            return false;
        }

        return true;
    }
}