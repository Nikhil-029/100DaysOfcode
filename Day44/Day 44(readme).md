Insert a node in Binary Search Tree
Given a Binary Search Tree (BST) and a new node, insert the node into the BST. Return the root of the modified BST. Note: There may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.
Example 1:
Input: root = [4,2,7,1,3], val = 5 Output: [4,2,7,1,3,5] Explanation: Another accepted tree is:
Example 2:
Input: root = [40,20,60,10,30,50,70], val = 25 Output: [40,20,60,10,30,50,70,null,null,25] Example 3:
Input: root = [4,2,7,1,3,null,null,null,null,null,null], val = 5 Output: [4,2,7,1,3,5] Constraints:
The number of nodes in the given tree will be between 0 and 104.
Each node will have a unique integer value from 0 to -108, inclusive.
-108 <= val <= 108

