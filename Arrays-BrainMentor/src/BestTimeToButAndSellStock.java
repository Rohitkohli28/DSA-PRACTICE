public class BestTimeToButAndSellStock {

    public static int getMaxProfit(int prices[]){
        int minPrice = prices[0]; // Initialize minPrice to the first element of the array
        int maxProfit = 0; // Initialize maxProfit to 0

        for(int i = 1; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]); // Update minPrice to be the minimum of the current minPrice and the current price

            int profit = prices[i] - minPrice; // Calculate the profit if we sell at the current price

            maxProfit = Math.max(maxProfit, profit); // Update maxProfit to be the maximum of the current maxProfit and the profit calculated
        }

        return maxProfit; // Return the maximum profit that can be achieved
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(getMaxProfit(prices));
    }
}
