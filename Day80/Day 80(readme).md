Question: - Mother Vertex in a Graph
Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E edges, Find any one of the Mother Vertex of the Graph if present else return -1.

Example 1:

Input:
V=7
E=8
Edges={ {0,1},{0,2},{1,3},{4,1},{6,4},{5,6},{5,2},{6,0} }

Output:
0
Explanation:
The graph looks like this:
0-->1
|   |
|   v
2-->3
^
|
|
4-->1
^
|
|
6-->4
^
|
|
5-->6

Mother Vertex is 0 as all other nodes can be reached by 0.

