# 45 Days Coding Challenge

## Day 3: Best Time to Buy and Sell Stock

### Problem Statement

You are given an array `prices` where `prices[i]` is the price of a given stock on the `i-th` day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

### Example

**Example 1:**

**Input:** prices = [7, 1, 5, 3, 6, 4]  
**Output:** 5  
**Explanation:** Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

**Example 2:**

**Input:** prices = [7, 6, 4, 3, 1]  
**Output:** 0  
**Explanation:** In this case, no transactions are done and the max profit = 0.

### Constraints

- `1 <= prices.length <= 10^5`
- `0 <= prices[i] <= 10^4`

### Solution

The solution involves iterating through the array to track the minimum price seen so far and calculating the potential profit at each step. The maximum profit is updated accordingly.

### Code

```java
// File: Solution.java
public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) { // If there's only one or no day
            return 0;
        }

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
