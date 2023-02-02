Question:- 0 - 1 Knapsack Problem

Problem Statement

Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).

Example

Input: val[] = {60, 100, 120}, wt[] = {10, 20, 30}, W = 50 Output: 220 Explanation: There are 3 items to choose from. A DP table is constructed such that dp[i][j] stores the maximum value that can be attained with weight less than or equal to j with first i items considered. The maximum value that can be attained with weight less than or equal to 50 with first 3 items considered is 220 (120 + 100)


