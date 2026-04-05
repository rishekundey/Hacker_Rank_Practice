package hacker_Rank_Package2;

import java.util.Arrays;
import java.util.List;

public class SansaAndXOR {

	public static int sansaXor(List<Integer> arr) {
		// Write your code here
		int n = arr.size();
		int result = 0;
		// If n is even, the result is always 0
		if (n % 2 == 0) {
			return 0;
		}
		// If n is odd, XOR the elements at even indices (0-based)
		for (int i = 0; i < n; i += 2) {
			result ^= arr.get(i);
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(1, 2, 3);
		System.out.println(sansaXor(arr)); // Output: 2
		arr = Arrays.asList(1, 2, 3, 4);
		System.out.println(sansaXor(arr)); // Output: 0
		arr = Arrays.asList(4, 5, 7, 5);
		System.out.println(sansaXor(arr)); // Output: 0
		arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		System.out.println(sansaXor(arr)); // Output: 0
	}

}
