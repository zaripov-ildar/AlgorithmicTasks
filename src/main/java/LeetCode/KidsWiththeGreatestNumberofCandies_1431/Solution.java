package LeetCode.KidsWiththeGreatestNumberofCandies_1431;

import java.util.LinkedList;
import java.util.List;

class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        List<Boolean> answer = new LinkedList<>();
        for (int i = 0; i < candies.length; i++) {
            answer.add(candies[i] + extraCandies >= max);
        }
        return answer;
    }
}