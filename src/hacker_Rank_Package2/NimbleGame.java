package hacker_Rank_Package2;

import java.util.Arrays;
import java.util.List;

/*
 * Nimble is a game played on a line of squares. Each square may contain a coin, and there 
 * are n squares numbered from 0 to n-1.
 * Two players alternate taking coins from the squares. In each turn, a player must take a 
 * coin from square i and move it to square j, where j < i. If a player cannot make a move, 
 * that player loses.
 * Given the number of coins in each square, determine whether the first player has a winning 
 * strategy. If the first player has a winning strategy, return "First"; otherwise, return 
 * "Second".
 * Example
 * s = [0, 2, 3, 0, 6]
 * The first player can take a coin from square 4 and move it to square 0. The second player 
 * can take a coin from square 2 and move it to square 1. The first player can take a coin 
 * from square 2 and move it to square 0. The second player can take a coin from square 1 and 
 * move it to square 0. The first player can take a coin from square 4 and move it to square 0.
 * The second player has no moves left, so the first player wins. Return "First".
 * Function Description
 * Complete the nimbleGame function in the editor below.
 * nimbleGame has the following parameter(s):
 * - int s[n]: the number of coins in each square
 * Returns
 * - string: either "First" or "Second"
 * Constraints
 * - 1 <= n <= 10
 * - 0 <= s[i] <= 100
 * * Sample Input 0
 * * 1
 * * * 0 2 3 0 6
 * * Sample Output 0
 * * * First
 * * Time Complexity: O(n)
 * * Space Complexity: O(1)
 *  Explanation youtube video: https://www.youtube.com/watch?v=Yp2X7QG9g8c&list=PLEATgPJJMKB79lVuTAaHAxspfbEWuSz_X&index=7
 *  Explanation you can also read: https://www.quora.com/What-is-the-winning-strategy-for-nimble
 *  Explanation you can also read: https://www.geeksforgeeks.org/nimble-game/
 *  
 */

public class NimbleGame {

	public static String nimbleGame(List<Integer> s) {
	    // Write your code here
		int nimSum = 0;
		for (int i = 0; i < s.size(); i++) {
			if (s.get(i) % 2 != 0) {
				nimSum ^= i;
			}
		}
		return nimSum != 0 ? "First" : "Second";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s = Arrays.asList(0, 2, 3, 0, 6);
		System.out.println(nimbleGame(s)); //First
		
		List<Integer> s2 = Arrays.asList(0, 0, 0, 0, 0);
		System.out.println(nimbleGame(s2)); //Second
	}

}
