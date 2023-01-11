BFS of graph is a traversing algorithm where you should start traversing from a selected node (source or starting node) and traverse the graph layerwise thus exploring the neighbour nodes (nodes which are directly connected to source node). You must then move towards the next-level neighbour nodes.

 In the BFS, the node which is closest to the source node is visited first. Then the node which is at next level is visited. 
 
 Description:-

Breadth First Search (BFS) is an algorithm for traversing or searching tree or graph data structures. It starts at the tree root (or some arbitrary node of a graph, sometimes referred to as a 'search key'[1]), and explores all of the neighbor nodes at the present depth prior to moving on to the nodes at the next depth level.

example:-

Input: 4 2 1 2 2 3 1 4

Output: 1 2 4 3

Explanation:-

Graph is represented as

1 2 4
2 1 3
3 2
4 1
BFS of the above graph is 1 2 4 3

Time Complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.
