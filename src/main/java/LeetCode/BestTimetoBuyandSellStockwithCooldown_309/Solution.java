package LeetCode.BestTimetoBuyandSellStockwithCooldown_309;

class Solution {
    public int maxProfit(int[] prices) {

        // initializaiton
        int coolDown = 0, sell = 0, hold = Integer.MIN_VALUE;

        for (int stockPrice : prices) {

            int prevCoolDown = coolDown, prevHold = hold;

            // Max profit of cooldown on Day i comes from either cool down of Day_i-1, or sell out of Day_i-1 and today Day_i is cooling day
            coolDown = Math.max(prevCoolDown, sell);

            // Max profit of sell on Day_i comes from hold of Day_i-1 and sell on Day_i
            sell = prevHold + stockPrice;

            //  Max profit of hold on Day_i comes from either hold of Day_i-1, or cool down on Day_i-1 and buy on Day_i
            hold = Math.max(hold, prevCoolDown - stockPrice);

        }

        // The action of final trading day must be either sell or cool down
        return Math.max(coolDown, sell);
    }
}
