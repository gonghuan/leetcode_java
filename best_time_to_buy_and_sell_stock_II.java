
public class best_time_to_buy_and_sell_stock_II {
	 public int maxProfit(int[] prices) {
	        int sum = 0;
	        for(int i = 0; i < prices.length - 1; i++){
	            if(prices[i + 1] > prices[i]){
	                sum += (prices[i + 1] - prices[i]);
	            }
	        }
	        return sum;
	    }
}
