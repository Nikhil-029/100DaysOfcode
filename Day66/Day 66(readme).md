Question:-  Rotten Oranges
Problem Description:-

Given a matrix of dimension m*n where each cell in the matrix can have values 0, 1 or 2 which has the following meaning:
0 : Empty cell
1 : Cells have fresh oranges
2 : Cells have rotten oranges
Determine what is the minimum time required so that all the oranges become rotten. A rotten orange at index [i,j] can rot other fresh orange at indexes [i+1,j], [i,j+1], [i-1,j], [i,j-1] (up, down, left and right). If it is impossible to rot every orange then simply return -1.
Test Case 1:
Input: grid = {{2,1,0,2,1},
               {1,0,1,2,1},
               {1,0,0,2,1}}
Output: 1
Explanation: The grid is-
2 1 0 2 1
1 0 1 2 1
1 0 0 2 1
At t=0, the grid is-
2 1 0 2 1
1 0 1 2 1
1 0 0 2 1
At t=1, the grid is-
2 2 0 2 2
2 0 2 2 2
2 0 0 2 2

Test Case 2:
Input: grid = {{2,1,0,2,1},
               {0,0,1,2,1},
               {1,0,0,2,1}}
Output: -1
Explanation: The grid is-
2 1 0 2 1
0 0 1 2 1
1 0 0 2 1
At t=0, the grid is-
2 1 0 2 1
0 0 1 2 1
1 0 0 2 1
At t=1, the grid is-
2 2 0 2 2
0 0 2 2 2
2 0 0 2 2
At t=2, the grid is-
2 2 0 2 2
0 0 2 2 2
2 0 0 2 2
