package hacker_Rank_Package2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Given an array of integers, determine the minimum possible difference between the maximum and minimum of any (contiguous) subarray of size k.
// Example
// arr = [10, 100, 300, 200, 1000, 20, 30]
// k = 3
// The subarrays of size k are [10, 100, 300], [100, 300, 200], [300, 200, 1000], [200, 1000, 20] and [1000, 20, 30]. The differences are 290, 200, 800, 980 and 970. The minimum difference is 200.
// Function Description
// Complete the maxMin function in the editor below.
// maxMin has the following parameter(s):
// int k: the number of elements in the subarray
// int arr[n]: an array of integers
// Returns
// int: the minimum difference found
// Constraints
// 1 <= n <= 10^5
// 1 <= k <= n
// 0 <= arr[i] <= 10^9
// Sample Input 0
// 10 4
// 1 2 3 4 10 20 30 40 100 200
// Sample Output 0
// 3
// Explanation 0
// The subarrays of size k are [1, 2, 3, 4], [2, 3, 4, 10], [3, 4, 10, 20], [4, 10, 20, 30], [10, 20, 30, 40], [20, 30, 40, 100] and [30, 40, 100, 200]. The differences are 3, 8, 17, 26, 30, 80 and 170. The minimum difference is 3.


public class MaxMin {

	public static int maxMin(int k, List<Integer> arr) {
		// Write your code here
		Collections.sort(arr);
		int minRes = Integer.MAX_VALUE;
		for(int i=0; i<=arr.size()-k; i++) {
			minRes = Math.min(minRes,  arr.get(i+k-1) - arr.get(i));
		}
		return minRes;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxMin(4, Arrays.asList(1, 2, 3, 4, 10, 20, 30, 40, 100, 200)));
	}

}
