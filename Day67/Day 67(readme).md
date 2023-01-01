Qustion:- Stack using two queues
Problem link:- https://practice.geeksforgeeks.org/problems/stack-using-two-queues/1
Given two queues, implement a stack using these two queues.
Input
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer Q denoting the number of queries . A Query Q is of 2 Types
(i) 1 x (a query of this type means  pushing 'x' into the stack)
(ii) 2   (a query of this type means to pop element from stack and print the poped element)
The second line of each test case contains Q queries seperated by space.
Output
The output for each test case will  be space separated integers having -1 if the stack is empty else the element poped out from the stack .

Constraints:
1 <= T <= 100
1 <= Q <= 100
1 <= x <= 100
Test case:
Input:
2
5
1 2 1 3 2 1 4 2
4
1 2 2 2 1 4
Output:
3 4
2 -1
