package hacker_Rank_Package2;

import java.util.Arrays;
import java.util.List;

/*
 * Misère Nim is a variation of the game of Nim. The rules are the same as Nim, except that 
 * the player who takes the last stone loses.
 * Given the number of stones in each pile, determine whether the first player has a winning 
 * strategy. If the first player has a winning strategy, return "First"; otherwise, return 
 * "Second".
 * Example
 * s = [1, 2, 3]
 * The first player can take 2 from pile 3. The second player can take 1 from pile 3. The 
 * first player can take 1 from pile 3 and win the game because the second player has to take 
 * the last stone. Return "First".
 * Function Description
 * Complete the misereNim function in the editor below.
 * misereNim has the following parameter(s):
 * - int s[n]: the number of stones in each pile
 * Returns
 * - string: either "First" or "Second"
 * Constraints
 * - 1 <= n <= 10
 * - 1 <= s[i] <= 100
 * Sample Input 0
 * 2
 * 1 2 3
 * 1 1
 * Sample Output 0
 * First
 * Second
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Explanation youtube video: https://www.youtube.com/watch?v=D7InGTn-C3E&list=PLEATgPJJMKB79lVuTAaHAxspfbEWuSz_X&index=6
 * Explanation you can also read: https://www.quora.com/What-is-the-winning-strategy-for-misere-nim
 * 
 */

public class MisèreNim {

	public static String misereNim(List<Integer> s) {
	    // Write your code here
		int onesCount = 0;
		for (int pile : s) {
			if (pile == 1) {
				onesCount++;
			}
		}
		if (onesCount == s.size()) {
			return onesCount % 2 == 0 ? "First" : "Second";
		}
		
		int nimSum = 0;
		for (int pile : s) {
			nimSum ^= pile;
		}
		return nimSum != 0 ? "First" : "Second";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s = Arrays.asList(1, 2, 3);
		System.out.println(misereNim(s)); //Second 
		List<Integer> s2 = Arrays.asList(1, 1);
		System.out.println(misereNim(s2)); //First
		List<Integer> s3 = Arrays.asList(1, 1, 1);
		System.out.println(misereNim(s3)); //Second
		List<Integer> s4 = Arrays.asList(1, 1, 1, 1);
		System.out.println(misereNim(s4)); //First
		List<Integer> s5 = Arrays.asList(3,5,7,9);
		System.out.println(misereNim(s5)); //First
	}

}
