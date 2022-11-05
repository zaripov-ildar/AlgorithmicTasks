package LeetCode.BestTimetoBuyandSellStockII_122;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buying = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price > buying) {
                profit += price - buying;
            }
            buying = price;
        }
        return profit;
    }
}
