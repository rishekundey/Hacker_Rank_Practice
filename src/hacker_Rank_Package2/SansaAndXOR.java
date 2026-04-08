package hacker_Rank_Package2;

import java.util.Arrays;
import java.util.List;

// The function is expected to return an INTEGER.
// The function accepts INTEGER_ARRAY arr as parameter.

// Example: arr = [1, 2, 3]
// The function should return 2 because the XOR of all the contiguous subarrays is 2.
// Explanation:
// The contiguous subarrays of arr are:
// [1], [2], [3], [1, 2], [2, 3], and [1, 2, 3].
// The XOR of these subarrays is:
// 1 XOR 2 XOR 3 XOR (1 XOR 2) XOR (2 XOR 3) XOR (1 XOR 2 XOR 3) = 2.

// Example: arr = [1, 2, 3, 4]
// The function should return 0 because the XOR of all the contiguous subarrays is 0.
// Explanation:
// The contiguous subarrays of arr are:
// [1], [2], [3], [4], [1, 2], [2, 3], [3, 4], [1, 2, 3], [2, 3, 4], and [1, 2, 3, 4].
// The XOR of these subarrays is:
// 1 XOR 2 XOR 3 XOR 4 XOR (1 XOR 2) XOR (2 XOR 3) XOR (3 XOR 4) XOR (1 XOR 2 XOR 3) XOR (2 XOR 3 XOR 4) XOR (1 XOR 2 XOR 3 XOR 4) = 0.

// Example: arr = [4, 5, 7, 5]
// The function should return 0 because the XOR of all the contiguous subarrays is 0.
// Explanation:
// The contiguous subarrays of arr are:
// [4], [5], [7], [5], [4, 5], [5, 7], [7, 5], [4, 5, 7], [5, 7, 5], and [4, 5, 7, 5].
// The XOR of these subarrays is:
// 4 XOR 5 XOR 7 XOR 5 XOR (4 XOR 5) XOR (5 XOR 7) XOR (7 XOR 5) XOR (4 XOR 5 XOR 7) XOR (5 XOR 7 XOR 5) XOR (4 XOR 5 XOR 7 XOR 5) = 0.

// Example: arr = [1, 2, 3, 4, 5, 6, 7]
// The function should return 0 because the XOR of all the contiguous subarrays is 0.
// Explanation:
// The contiguous subarrays of arr are:
// [1], [2], [3], [4], [5], [6], [7], [1, 2], [2, 3], [3, 4], [4, 5], [5, 6], [6, 7],
// [1, 2, 3], [2, 3, 4], [3, 4, 5], [4, 5, 6], [5, 6, 7], [1, 2, 3, 4], [2, 3, 4, 5],
// [3, 4, 5, 6], [4, 5, 6, 7], [1, 2, 3, 4, 5], [2, 3, 4, 5, 6], [3, 4, 5, 6, 7],
// [1, 2, 3, 4, 5, 6], [2, 3, 4, 5, 6, 7], and [1, 2, 3, 4, 5, 6, 7].
// The XOR of these subarrays is:
// 1 XOR 2 XOR 3 XOR 4 XOR 5 XOR 6 XOR 7 XOR (1 XOR 2) XOR (2 XOR 3) XOR (3 XOR 4) XOR (4 XOR 5) XOR (5 XOR 6) XOR (6 XOR 7) XOR
// (1 XOR 2 XOR 3) XOR (2 XOR 3 XOR 4) XOR (3 XOR 4 XOR 5) XOR (4 XOR 5 XOR 6) XOR (5 XOR 6 XOR 7) XOR
// (1 XOR 2 XOR 3 XOR 4) XOR (2 XOR 3 XOR 4 XOR 5) XOR (3 XOR 4 XOR 5 XOR 6) XOR (4 XOR 5 XOR 6 XOR 7) XOR
// (1 XOR 2 XOR 3 XOR 4 XOR 5) XOR (2 XOR 3 XOR 4 XOR 5 XOR 6) XOR (3 XOR 4 XOR 5 XOR 6 XOR 7) XOR
// (1 XOR 2 XOR 3 XOR 4 XOR 5 XOR 6) XOR (2 XOR 3 XOR 4 XOR 5 XOR 6 XOR 7) XOR (1 XOR 2 XOR 3 XOR 4 XOR 5 XOR 6 XOR 7) = 0.

// To solve this problem, we can use the following observations:
// 1. If the length of the array is even, the XOR of all contiguous subarrays will always be 0.
// 2. If the length of the array is odd, the XOR of all contiguous subarrays will be equal to the XOR of the elements at even indices (0-based) in the original array.
// Based on these observations, we can implement the function as follows:
// 1. Check if the length of the array is even. If it is, return 0.
// 2. If the length of the array is odd, initialize a variable to store the result and iterate through the elements at even indices (0-based) in the original array, XORing them together.
// 3. Return the final result after the loop.
// The time complexity of this solution is O(n) where n is the length of the input array, since we need to iterate through the array once to compute the XOR. The space complexity is O(1) since we are using only a constant amount of extra space to store the result.
// This solution efficiently computes the XOR of all contiguous subarrays based on the properties of XOR and the structure of the input array.


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
