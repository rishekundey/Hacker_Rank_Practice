package hacker_Rank_Package2;

/*
 * https://www.hackerrank.com/challenges/sum-vs-xor/problem
 * Given a long integer n, find the number of values of x where 0 <= x <= n and n + x = n ^ x.
 * Example
 * n = 5
 * There are two values of x that meet the criteria: 0 and 2.
 * n = 10
 * There are four values of x that meet the criteria: 0, 1, 4, and 5.
 * 
 * Explanation video: https://www.youtube.com/watch?v=2sXoQ9iYqjE
 * 
 * Constraints
 * 0 <= n <= 10^15
 * 
 * Time Complexity: O(log(n))
 * Space Complexity: O(1)
 * 
 */

public class SumVsXOR {
	
	public static long sumXor(long n) {
	    // Write your code here
		if(n == 0) {
			return 1;
		}		
		long count = 0;
		while (n > 0) {
			if ((n & 1) == 0) {
				count++;
			}
			n = n >> 1;
			
		}
		
		return (long) Math.pow(2, count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumXor(5)); // 2
		System.out.println(sumXor(10)); // 4
		System.out.println(sumXor(4)); // 4
		System.out.println(sumXor(15)); // 1
		System.out.println(sumXor(16)); // 16
	}

}
