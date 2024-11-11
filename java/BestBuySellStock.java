/**
 * This is a sliding window technique problem.
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * Examples:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * <p>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */

class Solution {

  public int maxProfit(int [] prices) {
    
    // the initial profit is 0, and we can return this in case we make no profit. 
    int maxProfit = 0;

    //the initial lowest price is the first index in the array.
    int minPrice = prices[0];

    /**
     * As we loop through each index in the array do the following operations:
     * use max() to determine the maxprofit:
     * we check if selling the stock at the current price - the buying minimum price is more than the current max profit. 
     * use min() to determine the lowest price:
     * is the current price lower than the recorded lower price? 
     * 
     * If I had bought at the cheapest price before today and sold at today's price, 
     * would I make a higher profit than I have seen so far?
     */
    for(int index = 0; index <= prices.length - 1; index++) {
      
      maxProfit = Math.max(maxProfit, prices[index] - minPrice);
      minPrice = Math.min(minPrice, prices[index]);

    }
    return maxProfit;
  }
}