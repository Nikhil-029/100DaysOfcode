Print adjacency list
Given a graph, print its adjacency list representation.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer V denoting the number of vertices and an integer E denoting the number of edges. The next line contains the edges of the graph.
Output:
Print the adjacency list representation of the graph.
Constraints:
1 ≤ T ≤ 100 1 ≤ V, E ≤ 100
Test Case1:
Input:
2
5 4
0 1 0 4 1 2 1 3
3 3
0 1 1 2 0 2
Output:
0-> 1-> 4->
1-> 0-> 2-> 3->
2-> 1->
3-> 1->
0-> 1-> 2->
1-> 0-> 2->
2-> 0-> 1->
