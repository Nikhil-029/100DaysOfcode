Lowest Common Ancestor of a Binary Tree III
Given the root and two nodes in a Binary Tree. Find the lowest common ancestor(LCA) of the two nodes.
Description: The lowest common ancestor is the node with largest depth which is the ancestor of both nodes.
Example 1:
Input:
{1}
1
1
Output:1
Explanation:
For the following binary tree（only one node）:
          1
LCA(1,1) = 1
Example 2:
Input:
{4,3,7,#,#,5,6}
3
5
Output:4
Explanation:
For the following binary tree:
          4
         / \
        3   7
           / \
          5   6
LCA(3, 5) = 4
Example 3:
Input:
{4,3,7,#,#,5,6}
5
6
Output:7
Explanation:
For the following binary tree:
          4
         / \
        3   7
           / \
          5   6

LCA(5, 6) = 7
Example 4:
Input:
{1,2,3}
2
3
Output:1
Explanation:
For the following binary tree:
          1
         / \
        2   3
LCA(2, 3) = 1
Challenge
O(n) time and O(1) extra space.

