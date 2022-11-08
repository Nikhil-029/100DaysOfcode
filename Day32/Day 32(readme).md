Problem: Determine two trees are identical 
Description:
Given two binary trees, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
Test Case 1:
Input:     1         1
          / \       / \
         2   3     2   3
        [1,2,3],   [1,2,3]
Output: true
Test Case 2:
Input:     1         1
          /           \
         2             2
        [1,2],     [1,null,2]
Output: false
Test Case 3:
Input:     1         1
          / \       / \
         2   1     1   2
        [1,2,1],   [1,1,2]
Output: false
time complexity: O(n)
space complexity: O(n)
