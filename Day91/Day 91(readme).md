Trie (insert and search)

Trie is an efficient information reTrieval data structure. Using Trie, search complexities can be brought to optimal limit (key length). If we store keys in binary search tree, a well balanced BST will need time proportional to M * log N, where M is maximum string length and N is number of keys in tree. Using Trie, we can search the key in O(M) time. However the penalty is on Trie storage requirements

Example

Input: keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
Output: No duplicates present
The tree looks like
         root
          |
        /  |  \
       t   a   b
      /   / \   \
     h   n   n   y
    /   /     \   \
   e   y       y   e
  /   /         \   \
 r   s           s   r
                    \
                     e

Input: keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their", "abc"};
Output: Duplicate present
The tree looks like
         root
          |
        /  |  \
       t   a   b
      /   / \   \
     h   n   n   y
    /   /     \   \
   e   y       y   e
  /   /         \   \
 r   s           s   r
                    \
                     e
                    /
                   c


