Maximum of all subarrays of size k
Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.
description:
Example 1:
Input:
n = 9, k =  3
1 2 3 1 4 5 2 3 6
Output:
3 3 4 5 5 5 6
Explanation:
First maximum is 3 = max(1, 2, 3)
Second maximum is 3 = max(2, 3, 1)
Third maximum is 4 = max(3, 1, 4)
Fourth maximum is 5 = max(1, 4, 5)
Fifth maximum is 5 = max(4, 5, 2)
Sixth maximum is 5 = max(5, 2, 3)
Seventh maximum is 6 = max(2, 3, 6)

Example 2: 
Input:
 n = 10, k =  4
8 5 10 7 9 4 15 12 90 13
Output:
10 10 10 15 15 90 90
Explanation:
First maximum is 10 = max(8, 5, 10, 7)
Second maximum is 10 = max(5, 10, 7, 9)
Third maximum is 10 = max(10, 7, 9, 4)
Fourth maximum is 15 = max(7, 9, 4, 15)
Fifth maximum is 15 = max(9, 4, 15, 12)
Sixth maximum is 90 = max(4, 15, 12, 90)
Seventh maximum is 90 = max(15, 12, 90, 13)
