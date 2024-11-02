from typing import List

class Solution:

    def solution(self, prices: List[int]) -> int:
        maxProfit = 0
        minPrice = prices[0]


        for x in prices:
            # MaxProfit is initially 0, use the max() function to determine
            # Whether the current max profit, or the current profit (current index price - cheapest stock) Is better
            maxProfit = max(maxProfit, x - minPrice)
            # Similarly, with minPrice being set to the first index of prices, use the min() function to check whether the current index, or min price is better
            minPrice = min(minPrice, x)
        return maxProfit


