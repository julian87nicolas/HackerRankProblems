# 1. Question 1
A coding competition is being organized on the HackerRank platform. All participants need to be grouped into teams where each team has exactly two candidates and the sums of their skills must be equal for all teams. The efficiency of a team is the product of the skills of its members, e.g. for a team with skills [2, 3], the efficiency of the team is 2 * 3 = 6.

Find the sum of the efficiencies of the teams. If there is no way to create teams that satisfy the conditions, return -1.


* Notes:
    * All participants must be assigned to a team.
    * The answer is always unique.
 

***Example***

> The skills of the candidates are skill = [1, 2, 3, 2].
* They can be paired as [[1, 3], [2, 2]]. The sum of skills for each team is the same, i.e., 4.
* The efficiency is computed as:
    * Efficiency of [1, 3] = 1 * 3 = 3
    * Efficiency of [2, 2] = 2 * 2 = 4

* Return the sum of efficiencies, 3 + 4 = 7.

## Function Description

Complete the function getTotalEfficiency in the editor below.

* `getTotalEfficiency`` has the following parameter:
```
int skill[n]: the skills of each candidate
```
* Returns
```
long_int: the sum of the efficiencies if it is possible to form the teams, or -1 otherwise
```
*Constraints*
* 1 ≤ n ≤ 105
* 1 ≤ skill[i] ≤ 105
* n is even.
* It is guaranteed that the answer is unique.

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
