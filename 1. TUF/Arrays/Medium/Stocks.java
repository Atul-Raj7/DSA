// LC - 121

public class Stocks {
    static int maxProfit(int[] prices) {
        int maximum = 0;
        int minimum = prices[0];

        for (int i = 0; i < prices.length; i++) {
            int cost = prices[i] - minimum;
            maximum = Math.max(maximum, cost);
            minimum = Math.min(prices[i], minimum);
        }
        return maximum;
    }
    public static void main(String[] args){
        int[] prices = {7,1,3,4,5,6};
        System.out.println(maxProfit(prices));
    }
}
