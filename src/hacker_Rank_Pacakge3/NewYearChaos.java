package hacker_Rank_Pacakge3;

/*
 * New Year Chaos Problem:
 * It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! 
 * There are a number of people queued up, and each person wears a sticker indicating their 
 * initial position in the queue. Initial positions increment by 1 from 1 at the front of 
 * the line to n at the back.
 * In quick succession, people can bribe the person directly in front of them to swap 
 * positions. If two people swap positions, they still wear the same sticker denoting their 
 * original places in line. One person can bribe at most two others. For example, if n = 8 
 * and Person 5 bribes Person 4, the queue will look like this: 1, 2, 3, 5, 4, 6, 7, 8.
 * 
 * Sample Input 0
 * 
 * 5
 * 2 1 5 3 4
 * Sample Output 0
 * 
 * 3
 * 
 * Sample Input 1
 * 
 * 5
 * 2 5 1 3 4
 * Sample Output 1
 * 
 * Too chaotic
 * 
 * Sample Input 2
 * 
 * 8
 * 
 * 
 * Explanation Video: https://www.youtube.com/watch?v=5Uj6uR1F7G4
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 	
 */

import java.util.Arrays;
import java.util.List;

public class NewYearChaos {

	public static void minimumBribes_1(List<Integer> q) {
		// Write your code here
		int bribe = 0;
		for (int i = q.size() - 1; i >= 0; i--) {
			if (q.get(i) - (i + 1) > 2) {
				System.out.println("Too chaotic");
				return;
			} else {
				// The inner loop starts from the maximum of 0 and q.get(i) - 2 because a 
				// person can only bribe at most two others, so we only need to check the 
				// positions from q.get(i) - 2 to i-1 for any person who has bribed the 
				// current person.
				for (int j = Math.max(0, q.get(i) - 2); j < i; j++) { 
//					System.out.println("q.get(" + i + "): " + q.get(i) + ", q.get(" + j + "): " + q.get(j));
					// If any person in the range from q.get(i) - 2 to i-1 has a sticker 
					// number greater than the current person's sticker number, it means 
					// that person has bribed the current person, and we increment the 
					// bribe count.
					if (q.get(j) > q.get(i)) { 
						bribe++;
					}
//					System.out.println("bribe: " + bribe);
				}
			}
		}
//		for (int i = 0; i < q.size(); i++) {
//			System.out.print(q.get(i) + " ");
//		}
//		System.out.println();
		System.out.println(bribe);
	}

	public static void minimumBribes(List<Integer> q) {
		int bribe = 0;
		for (int i = q.size() - 1; i >= 0; i--) {
			if (q.get(i) != i + 1) {
				// If the person who should be in position i is found at position i-1, then 
				// a single swap is needed to move that person to position i.
				if (((i-1)>=0) && q.get(i - 1) == (i + 1)) { 
					bribe++;
					swap(q, i, i - 1);
				} else if (((i-2)>=0) && q.get(i - 2) == (i + 1)) {
					// If the person who should be in position i is found at position i-2, 
					//then two swaps are needed to move that person to position i.
					bribe += 2;
					swap(q, i - 2, i - 1);
					swap(q, i - 1, i);
				} else {
					System.out.println("Too chaotic");
					return;
				}
			}
		}
//		for (int i = 0; i < q.size(); i++) {
//			System.out.print(q.get(i) + " ");
//		}
//		System.out.println();
		System.out.println(bribe);
	}
	
	public static void swap(List<Integer> q, int i, int j) {
		int temp = q.get(i);
		q.set(i, q.get(j));
		q.set(j, temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List arr = Arrays.asList(2, 1, 5, 3, 4);
		minimumBribes(arr);
		arr = Arrays.asList(2, 5, 1, 3, 4);
		minimumBribes(arr);
		arr = Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4);
		minimumBribes_1(arr);
	}

}
