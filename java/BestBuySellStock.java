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
  public int maxProfit(int[] prices) {
    /**
     * Initialize these two variables. First the minValue to the highest integer possible, as it will get adjusted in the sliding window loop.
     * The, a maxprofit which will be adjusted as the loop evaluates the elements in the array as well.
     */
    int minVal = Integer.MAX_VALUE;
    int maxProfit = 0;

    /**
     *Conditions of this loop:
     * if the current index of the array is less than the current minvalue, then, set minval = prices[i].
     * Else if, the current index of the array - the current minvalue is greater than the current maxprofit, then set maxprofit = prices[i]
     */
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minVal) {
        minVal = prices[i];
      } else if (prices[i] - minVal > maxProfit) {
        maxProfit = prices[i] - minVal;
      }
    }
    return maxProfit;
  }
}