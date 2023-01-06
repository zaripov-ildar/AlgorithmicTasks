package LeetCode.MaximumIceCreamBars_1833;

import java.util.Arrays;

class Solution {
    public int maxIceCream3(int[] costs, int coins) {
        int[] costFrequency = new int[100_001];
        for (int cost : costs) {
            costFrequency[cost]++;
        }
        int iceCreams = 0;
        for (int i = 1; i < costFrequency.length && coins > 0; i++) {
            if (costFrequency[i] > 0) {
                int iceCreamByCurrentCost = Math.min(coins / i, costFrequency[i]);
                iceCreams += iceCreamByCurrentCost;
                coins -= iceCreamByCurrentCost * i;
            }
        }
        return iceCreams;
    }

    public int maxIceCream2(int[] costs, int coins) {
        int[] count = new int[100001];
        for (int i = 0; i < costs.length; i++) {
            count[costs[i]]++;
        }
        int answer = 0;

        for (int i = 1; i < 100001; i++) {
            if (count[i] > 0) {
                int use = Math.min(coins / i, count[i]);
                coins -= use * i;
                answer += use;
            }
        }
        return answer;
    }
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int iceCreams = 0;
        for(int i = 0; i < costs.length && coins >= costs[i]; i++){
            coins -= costs[i];
            iceCreams++;
        }
        return iceCreams;
    }
}