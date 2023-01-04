Given N integers, your task is to add these elements to the PriorityQueue. Also, given M integers, the task is to check if the given element is present in the PriorityQueue or not.
If the element is present, then 1 is printed by the driver code, after that the max element of priority queue is printed. Then the driver code deletes the max element.


Example:

Input:
8
1 2 3 4 5 2 3 1
5
1 3 2 9 10

Output:
1
5
1
4
1
3
-1
-1

Explanation:
After inserting given elements, when we find 1, 
which is present, so 1 gets printed, and then the 
top element of the PriorityQueue which is 5 gets 
printed, and then it gets deleted. Similarly, when 
element is not present, just -1 is printed.


Constraints:
1 <= N <= 103
1 <= M <= 103