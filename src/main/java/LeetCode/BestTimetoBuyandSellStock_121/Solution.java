package LeetCode.BestTimetoBuyandSellStock_121;

class Solution {
    public int maxProfit(int[] prices) {
        int lowestPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            profit = Math.max(price - lowestPrice, profit);
            lowestPrice = Math.min(lowestPrice, price);
        }
        return profit;
    }
}
