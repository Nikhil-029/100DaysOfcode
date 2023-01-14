Questioin:- Given a directed graph with V nodes and E edges. If there is an edge from u to v then u depends on v. Find out the sum of dependencies for every node. Duplicate edges should be counted as separate edges.

Example 1:

Input:
V=4
E=4
Edges={ {0,2},{0,3},{1,3},{2,3} }




Output:
4
Explanation:
For the graph in diagram, A depends
on C and D i.e. 2, B depends on D i.e.
1, C depends on D i.e. 1
and D depends on none.
Hence answer -> 0 + 1 + 1 + 2 = 4
Example 2:

Input:
V=4
E=3
Edges={ {0,3},{0,2},{0,1} }
Output:
3
Explanation:
The sum of dependencies=3+0+0+0=3.
