
Using Morris Traversal, we can traverse the tree without using stack and recursion. The algorithm for Preorder is almost similar to Morris traversal for Inorder.

1...If left child is null, print the current node data. Move to right child. 
….Else, Make the right child of the inorder predecessor point to the current node. Two cases arise: 
………a) The right child of the inorder predecessor already points to the current node. Set right child to NULL. Move to right child of current node. 
………b) The right child is NULL. Set it to current node. Print current node’s data and move to left child of current node. 
2...Iterate until current node is not NULL.