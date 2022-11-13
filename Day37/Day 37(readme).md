K sum Paths in a Binary Tree
Given a binary tree, find all paths that sum of the nodes in the path equals to a given number k. A valid path is from root node to any of the leaf nodes.

Test Cases 1:
Input: {1,2,3,4,2},3
Output: [[1,2,4],[1,3]]
Explanation:
The binary tree is look like this:
    1
   / \
  2   3
 / \
4   2
For k=3 , there are two ways. 1+2+4=7 , 1+3=4
So we return [[1,2,4],[1,3]]

