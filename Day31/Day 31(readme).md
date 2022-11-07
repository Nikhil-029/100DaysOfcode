Question: check for Balanced tree
For this problem, a height-balanced binary tree is defined as:
a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
Description: Given a binary tree, determine if it is height-balanced.
Test Case 1:
Given the following tree [3,9,20,null,null,15,7]:
    3
   / \
  9  20
    /  \
   15   7
Ans = Return true.
Test Case 2:
Given the following tree [1,2,2,3,3,null,null,4,4]:
       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
Ans = Return false.
time complexity: O(n)
space complexity: O(n)
