package hacker_Rank_Package2;

import java.util.Arrays;
import java.util.List;

/*
 * Nim is a game played with piles of stones. On each turn, a player must remove at least one 
 * stone from a single pile. The player who takes the last stone wins. Given a list of 
 * integers representing the number of stones in each pile, determine whether the first 
 * player has a winning strategy. If the first player has a winning strategy, return "First"; 
 * otherwise, return "Second".
 * Example
 * pile = [1, 1]
 * The first player can only take one stone from either pile, after which the second player 
 * takes the last stone and wins. Return "Second".
 * pile = [2, 1, 4]
 * The first player can take three stones from the third pile, leaving [2, 1, 1]. Then the 
 * second player takes one stone from the first pile, leaving [1, 1, 1]. The first player then 
 * takes one stone from any pile, leaving [1, 1, 0]. The second player takes one stone from 
 * any pile, leaving [1, 0, 0]. Finally, the first player takes the last stone and wins. 
 * Return "First".
 * 
 * Function Description
 * Complete the nimGame function in the editor below. It should return a string that denotes 
 * the winner of the game.
 * nimGame has the following parameter(s):
 * - pile: an array of integers representing the number of stones in each pile
 * Input Format
 * The first line contains an integer n, the number of piles. The second line contains n 
 * space-separated integers, pile[i], the number of stones in pile i.
 * Constraints
 * 1 <= n <= 10^5
 * 1 <= pile[i] <= 10^9
 * Output Format
 * Return "First" if the first player has a winning strategy, or "Second" if the second 
 * player has a winning strategy.
 * Sample Input 0
 * 2
 * 1 1
 * Sample Output 0
 * Second
 * Sample Input 1
 * 3
 * 2 1 4
 * Sample Output 1
 * First
 * Explanation 0
 * The first player can only take one stone from either pile, after which the second player 
 * takes the last stone and wins. Return "Second".
 * Explanation 1
 * The first player can take three stones from the third pile, leaving [2, 1, 1]. Then the 
 * second player takes one stone from the first pile, leaving [1, 1, 1]. The first player then 
 * takes one stone from any pile, leaving [1, 1, 0]. The second player takes one stone from 
 * any pile, leaving [1, 0, 0]. Finally, the first player takes the last stone and wins.
 * Return "First".
 * 
 * Note
 * Nim is a well-known game in combinatorial game theory, and the winning strategy can be 
 * determined using the concept of nim-sum, which is the bitwise XOR of the number of stones 
 * in each pile. If the nim-sum is zero at the start of the game, the second player has a
 * winning strategy; otherwise, the first player has a winning strategy.
 * The nim-sum can be calculated by iterating through the list of piles and applying the XOR 
 * operation to the number of stones in each pile. Finally, we check if the nim-sum is zero 
 * or not to determine the winner.
 * 
 * Time Complexity: O(n), where n is the number of piles. We need to iterate through the list of piles once to calculate the nim-sum.
 * Space Complexity: O(1), as we are using a constant amount of space to store the nim-sum 
 * and other variables.
 * 
 * Explanation Video: https://www.youtube.com/watch?v=QyL8wVYzj4o
 * Additional Resources:
 * - Nim Game on Wikipedia: https://en.wikipedia.org/wiki/Nim
 * - Nim Game on GeeksforGeeks: https://www.geeksforgeeks.org/nim-game/
 * - Nim Game on LeetCode: https://leetcode.com/problems/nim-game/description/
 * - Nim Game on HackerRank: https://www.hackerrank.com/challenges/nim-game/problem
 * 
 */

public class IntroNimGame {

	public static String nimGame(List<Integer> pile) {
	    // Write your code here
	    int nimSum = 0;
	    for (int s : pile) {
	        nimSum ^= s;
	    }
	    return nimSum != 0 ? "First" : "Second";

	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> pile1 = Arrays.asList(1, 1);
		System.out.println(nimGame(pile1)); //Second
		
		List<Integer> pile2 = Arrays.asList(2, 1, 4);
		System.out.println(nimGame(pile2)); //First

	}

}
