package LeetCode.TheNumberOfWeakCharactersInTheGame_1996;

import java.util.Arrays;

class Solution {

    public int numberOfWeakCharacters(int[][] properties) {
        int result = 0;
        Arrays.sort(properties, (x, y) -> x[0] == y[0] ? Integer.compare(x[1], y[1]) : Integer.compare(y[0], x[0])
        );
        int maxDef = properties[0][1];
        for (int i = 1; i < properties.length; i++) {
            if (properties[i][1] < maxDef) {
                result++;
            } else {
                maxDef = properties[i][1];
            }
        }
        return result;
    }
}
