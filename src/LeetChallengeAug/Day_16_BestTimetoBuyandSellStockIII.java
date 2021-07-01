/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Example 1:

Input: [3,3,5,0,0,3,1,4]
Output: 6
Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
             Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
package LeetChallengeAug;

import java.util.HashMap;

public class Day_16_BestTimetoBuyandSellStockIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxProfit(int[] prices) {
        HashMap<String, Integer> map = new HashMap<>();
        return maxProfit(0, false, prices,2,map);  //2 is mentioned in question(max two transaction)
    }
    
    private int maxProfit(int i, boolean buyOrSell, int [] prices, int transaction, HashMap<String, Integer> map)     {
        int profit = 0;
        String key = i + "a" +buyOrSell + "b"+transaction;
        if(map.containsKey(key)){
            return map.get(key);
        }
        if(i >= prices.length || transaction == 0) return 0;
        if(buyOrSell == false){
           int buy = maxProfit(i+1, true, prices, transaction,map)-prices[i];
           int noBuy = maxProfit(i+1, false, prices, transaction,map);
           profit = Math.max(buy, noBuy);
        }else{
           int sell = maxProfit(i+1, false, prices,transaction-1,map)+prices[i];
           int noSell = maxProfit(i+1, true, prices, transaction, map);
           profit = Math.max(sell, noSell);
        }
        map.put(key, profit);
        return profit;
    }
	

}
