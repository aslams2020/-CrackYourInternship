public class BuyandSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) // If there's only one or no day
            return 0;
        
        int maxProfit = 0;
        int minPrice = prices[0];
        
        for (int i = 1; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }
        
        return maxProfit;
    }
}
