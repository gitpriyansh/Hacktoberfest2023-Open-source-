public class StockBuySell {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        StockBuySell stockBuySell = new StockBuySell();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = stockBuySell.maxProfit(prices);
        System.out.println("Max Profit: " + maxProfit); // Output: Max Profit: 5
    }
}
