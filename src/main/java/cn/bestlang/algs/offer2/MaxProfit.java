package cn.bestlang.algs.offer2;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            maxProfit = Math.max(maxProfit, price - minPrice);
            if (price < minPrice) {
                minPrice = price;
            }
        }

        return maxProfit;
    }
}
