package hacker_Rank_Package2;

/*
 *  https://www.hackerrank.com/challenges/counter-game/problem
 *  Louise and Richard play a game. They have a counter set to n. Louise always moves first, 
 *  and the two players move optimally.
 *  The counter is reduced according to the following rules:
 *  - If n is not a power of 2, reduce the counter by the largest power of 2 less than n.
 *  - If n is a power of 2, reduce the counter by half of n.
 *  The last player to make a valid move wins the game. Given n, determine the winner of the 
 *  game.
 *  
 *  Explanation Video: https://www.youtube.com/watch?v=Vj2QYyXl3nM
 *  
 *  *  Sample Input 0
 *  *  1
 *  *  Sample Output 0
 *  *  Richard
 *  
 *  *  Sample Input 1
 *  *  6
 *  *  Sample Output 1
 *  *  Louise
 *  
 *  
 *  Time Complexity: O(log n)
 *  Space Complexity: O(1)
 *  
 */

public class CounterGame {

	public static String counterGame(long n) {
	    // Write your code here
		int count = 0;
		while (n != 1) {
			if ((n & (n - 1)) == 0) {
				n = n / 2;
			} else {
				long power = (long) Math.pow(2, (int) (Math.log(n) / Math.log(2)));
				n = n - power;
			}
			count++;
		}
		return (count % 2 == 0) ? "Richard" : "Louise";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(counterGame(6));
		System.out.println(counterGame(132));
		System.out.println(counterGame(1));
		
	}

}
