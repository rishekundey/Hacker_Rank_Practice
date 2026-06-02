package hacker_Rank_Package2;

/*
 * https://www.hackerrank.com/challenges/gaming-array/problem
 * Bob and Andy are playing a game. They have an array of distinct integers, and they take turns removing elements from it. Bob always goes first, and the two players cannot skip their turn. The player that removes the last element from the array wins the game.
 * * 	Complete the gamingArray function to determine the winner of the game given the initial array.
 * * Function Description
 * * 	gamingArray has the following parameter(s):
 * * 	int arr[n]: an array of integers
 * * Returns
 * * 	string: either "BOB" or "ANDY"
 * * Input Format
 * * 	The first line contains an integer n, the number of elements in arr.
 * * 	The second line contains n distinct space-separated integers arr[i].
 * * Constraints
 * * 	1 <= n <= 10^5
 * 	
 * Explanation Video: https://www.youtube.com/watch?v=1z9C7n5ZV2s
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Sample Input 0
 * 5
 * 2 3 5 1 4
 * Sample Output 0
 * BOB
 * * Sample Input 1
 * 10
 * 1 3 5 7 9 2 4 6 8 10
 * Sample Output 1
 * ANDY
 * 
 */

import java.util.Arrays;
import java.util.List;

public class GaminArray1 {
	
	public static String gamingArray(List<Integer> arr) {
	    // Write your code here
		int max = Integer.MIN_VALUE;
		int moves = 0;
		
		for(int n : arr) {
			if(n>max) {
				max = n;
				moves++;
			}
		}
		return moves%2 == 0? "ANDY" : "BOB";
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(2, 3, 5, 1, 4);
		System.out.println(gamingArray(arr));
	}

}
