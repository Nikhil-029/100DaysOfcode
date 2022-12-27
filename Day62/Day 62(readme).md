The celebrity problem:- 

A group of N people is standing in a circle around a table. The celebrity problem is to find the celebrity in the group. A celebrity is a person who is known to everyone but does not know anyone at all. If there is a celebrity in the group, then the celebrity knows no one but everyone knows the celebrity. If there is no celebrity, then everyone knows someone who does not know them. The task is to find the celebrity if present. A square NxN matrix M[][] is used to represent people at the table such that if an element of row i and column j is set to 1 then ith person knows jth person. Here M[i][i] will always be 0.
Example 1:
Input: matrix = {{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0}} Output: 2 Explanation: The matrix will look like this: 0 0 1 0 0 0 1 0 0 0 0 0 0 0 1 0 Here, the celebrity is the person with index 2 as 0th and 1st person both know 2 but 2 does not know anyone.
Example 2:
Input: matrix = {{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}} Output: -1 Explanation: The matrix will look like this: 0 0 1 0 0 0 1 0 0 1 0 0 0 0 1 0 Here, there is no celebrity as everyone knows someone who does not know them.
