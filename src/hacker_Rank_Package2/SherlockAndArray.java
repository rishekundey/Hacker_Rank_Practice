package hacker_Rank_Package2;

import java.util.Arrays;
import java.util.List;

// 
// Sherlock and Array
// 
// Watson gives Sherlock an array of integers. His challenge is to find an element of the array such that the sum of all elements to the left is equal to the sum of all elements to the right.
// 
// For example, given the array arr = [5, 6, 8, 11], 6 is an element of the array such that the sum of all elements to the left (5) is equal to the sum of all elements to the right (8 + 11 = 19).
// 
// Function Description
// 
// Complete the balancedSums function in the editor below. It should return a string, either YES or NO.
// 
// balancedSums has the following parameter(s):
// 
// - arr: an array of integers
// 
// Input Format
// 
// The first line contains an integer T, the number of test cases.
// Each of the next T pairs of lines are as follows:
// 
// - The first line contains an integer n, the number of elements in arr.
// - The second line contains n space-separated integers arr[i].
// 
// Constraints
// 
// 1 <= T <= 10
// 1 <= n <= 10^5
// -10^4 <= arr[i] <= 10^4
// Output Format
// 
// For each test case, print YES if there exists an element in arr such that the sum of the elements to the left is equal to the sum of the elements to the right. Otherwise, print NO.
// Sample Input
// 2
// 3
// 1 2 3
// 4
// 1 2 3 3
// Sample Output
// NO
// YES
// Explanation
// 
// For the first test case, no such index exists.
// For the second test case, arr[2] = 3 is such an index because 1 + 2 = 3.
// 
// Approach:
// 1. Calculate the total sum of the array.
// 2. Initialize a variable leftSum to 0.
// 3. Iterate through the array, for each element arr[i]:
//   - Check if leftSum is equal to totalSum - leftSum - arr[i]. If true, return "YES".
//  - Update leftSum by adding arr[i] to it.
// 4. If the loop completes without finding such an index, return "NO".
// Time Complexity: O(n) for each test case, where n is the number of elements in the array.
// Space Complexity: O(1) as we are using only a constant amount of extra space.
// This solution efficiently checks for the required condition in a single pass through the array after calculating the total sum, making it suitable for large input sizes within the given constraints.
// Note: The provided code includes a main method with test cases to demonstrate the functionality of the balancedSums function. You can modify or add more test cases as needed.
// This code defines a class SherlockAnd
// Array with a method balancedSums that checks if there exists an element in the input list such that the sum of elements to the left is equal to the sum of elements to the right. The main method includes test cases to validate the functionality of the balancedSums method.

// hacker rank problem: https://www.hackerrank.com/challenges/sherlock-and-array/problem

// Explanation video: https://www.youtube.com/watch?v=Y1l8s9tqkXo



public class SherlockAndArray {

	public static String balancedSums(List<Integer> arr) {
	    // Write your code here
		int totalSum = 0;
		for (int num:arr)
			totalSum += num;
		int leftSum = 0;
		for (int num:arr) {
			if (leftSum == totalSum - leftSum - num) {
				return "YES";
			}
			leftSum += num;
		}
		return "NO";
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(balancedSums(Arrays.asList(1, 2, 3))); // Output: NO
		System.out.println(balancedSums(Arrays.asList(1, 2, 3, 3))); // Output: YES
		System.out.println(balancedSums(Arrays.asList(1, 1, 4, 1, 1))); // Output: YES
		System.out.println(balancedSums(Arrays.asList(2, 0, 0, 0))); // Output: YES
		System.out.println(balancedSums(Arrays.asList(0, 0, 2, 0))); // Output: YES
		System.out.println(balancedSums(Arrays.asList(-1, 3, -4, 5, 1))); // Output: NO
		
	}

}
