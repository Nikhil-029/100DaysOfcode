Question:- DFS of Graph

Depth First Search (DFS) for a Graph is similar to DFS of a Tree. The only catch here is, unlike trees, graphs may contain cycles, so we may come to the same node again. To avoid processing a node more than once, we use a boolean visited array. For simplicity, it is assumed that all vertices are reachable from the starting vertex. For example, in the following graph, we start traversal from vertex 2. When we come to vertex 0, we look for all adjacent vertices of it. 2 is also an adjacent vertex of 0. If we don’t mark visited vertices, then 2 will be processed again and it will become a non-terminating process.

Example 1:-

Input: 4 2 1 2 2 3 1 4
Output: 1 2 3 4

Explanation:-
Graph is represented as
DFS of the above graph is 1 2 3 4
Time Complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.