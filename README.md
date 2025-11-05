# TwoSum
Two Sum – LeetCode Problem
This repository contains my solution to the Two Sum
 problem on LeetCode.
The problem requires finding the indices of two numbers in an array that add up to a given target.

// Solution 1
Solution Approach:

Use nested loops to check all pairs of numbers in the array.

For each pair (i, j), check if nums[i] + nums[j] == target.

Return the indices of the two numbers when found.

Time and Space Complexity:

Time: O(n²) → checks every possible pair in the array.

Space: O(1) → does not use extra data structures.


// Solution 2
Difference from HashMap Solution:

The HashMap approach reduces time complexity to O(n) by storing previously seen numbers and checking for their complement.

The brute-force method is simpler but slower for large arrays because it checks all pairs explicitly.

Language: Java
