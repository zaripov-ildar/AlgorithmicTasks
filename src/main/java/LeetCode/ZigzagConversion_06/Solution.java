package LeetCode.ZigzagConversion_06;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        int directionCoefficient = 1;
        int builderIndex = 0;
        if (numRows == 1) {
            return s;
        }
        List<StringBuilder> builders = new ArrayList<>();
        int capacity = s.length()/numRows;
        for (int i = 0; i < numRows; i++) {
            builders.add(new StringBuilder(capacity));
        }
        for (int i = 0; i < s.length(); i++) {
            builders.get(builderIndex).append(s.charAt(i));
            if (builderIndex == 0) {
                directionCoefficient = 1;
            }
            if (builderIndex == numRows - 1)
                directionCoefficient = -1;
            builderIndex += directionCoefficient;


        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder builder : builders) {
            result.append(builder);
        }

        return result.toString();
    }
}
