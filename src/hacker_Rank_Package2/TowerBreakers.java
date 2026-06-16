package hacker_Rank_Package2;

/*
 * https://www.hackerrank.com/challenges/tower-breakers/problem
 * 
 * Two players are playing a game of Tower Breakers! Player 1 always moves first, and both players always play optimally. The rules of the game are as follows:
 * * - Initially there are n towers.
 * * - Each tower is of height m.
 * * - The players move in alternating turns.
 * * - In each turn, a player can choose a tower of height x and reduce its height to y, where 1 <= y < x and y evenly divides x.
 * * - If the current player is unable to make a move, they lose the game.
 * * Given the values of n and m, determine which player will win. If the first player wins, return 1. Otherwise, return 2.
 * * Function Description
 * * * Complete the towerBreakers function in the editor below. It should return an integer that represents the winner of the game.
 * * * towerBreakers has the following parameter(s):
 * * * * * int n: the number of towers
 * * * * * int m: the height of each tower
 * * * Returns
 * * * * int: the winner of the game
 * * * Input Format
 * * The first line contains a single integer t, the number of test cases.
 * * The next t lines each contain two space-separated integers n and m, the number of towers and the height of each tower.
 * * Constraints
 * * 1 <= t <= 100
 * * 1 <= n, m <= 10^6
 * * Sample Input 0
 * * 2
 * * * 2 2
 * * * 1 4
 * * Sample Output 0
 * * * 2
 * * * 1
 * * Explanation 0
 * * In the first test case, Player 1 has only one move: reduce a tower to height 1. After this move, Player 2 will reduce the second tower to height 1. Now Player 1 has no more moves and loses. Thus, Player 2 wins.
 * * In the second test case, Player 1 can reduce the tower to height 1, leaving Player 2 with no moves. Thus, Player 1 wins.
 * 
 * Time  Complexity: O(1)
 * Space Complexity: O(1)
 * 
 * Explanation Video: https://www.youtube.com/watch?v=9n7xLqf8s2o
 * 
 */

public class TowerBreakers {

	public static int towerBreakers(int n, int m) {
		// Write your code here
		if (m == 1 || n % 2 == 0) {
			return 2;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(towerBreakers(2, 2)); // 2
		System.out.println(towerBreakers(1, 4)); // 1
		System.out.println(towerBreakers(3, 7)); // 1
	}

}
