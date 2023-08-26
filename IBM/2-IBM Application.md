# 2. Question 2
Given an array of n positive integers, assuming 0-based indexing, its cost is

￼

len(arr) is the size of the array.

 

Insert any integer at any location of the array such that the cost of the array is minimized. Find the minimum possible cost of the array after inserting exactly one element.

 

Example

a = [1, 3, 5, 2, 10]

 

The cost of the array before insertion = (1 - 3)2 + (3 - 5)2 + (5 - 2)2 + (2 - 10)2 = 81. 

 

Two of many scenarios are shown below.

Insert 4 between 3 and 5, cost of array = (1 - 3)2 + (3 - 4)2 + (4 - 5)2 + (5 - 2)2 + (2 - 10)2 = 79.
Insert 6 between 2 and 10, cost of array =(1 - 3)2 + (3 - 5)2 + (5 - 2)2 + (2 - 6)2 + (6 - 10)2 = 49.
 

It can be proven that 49 is the minimum cost possible. Return 49.

 
Function Description

Complete the function getMinimumCost in the editor below.

 

getMinimumCost has the following parameter:

    int arr[n]:  an array of integers

 

Returns

    long_int: the minimum possible cost of the array after inserting one element

 

Constraints

2 ≤ n ≤ 104
1 ≤ arr[i] ≤ 105
 

Input Format For Custom Testing
Sample Case 0
Sample Input For Custom Testing

STDIN    FUNCTION
-----    --------
4     →  n = 4
4     →  arr = [4, 7, 1, 4]
7
1
4
Sample Output

36
Explanation

The cost of the array before insertion = (4 - 7)2 + (7 - 1)2 + (1 - 4)2 = 54. 

Insert 5 between 4 and 7, cost = (4 - 5)2+ (5 - 7)2 + (7 - 1)2 + (1 - 4)2 = 50. 

Insert 4 between 7 and 1, cost = (4 - 7)2 + (7 - 4)2 + (4 - 1)2 + (1 - 4)2 = 36.
ChatGPT
To solve this problem, you need to consider all possible positions to insert an integer and calculate the cost for each insertion. Then, you can choose the insertion that results in the minimum cost. Here's how you can implement the getMinimumCost function in Python:
