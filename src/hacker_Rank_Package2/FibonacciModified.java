package hacker_Rank_Package2;

import java.math.BigInteger;

/*
 * The Fibonacci sequence is defined as follows:
 * F(0) = 0
 * F(1) = 1
 * F(n) = F(n-2) + F(n-1) for n > 1
 * Given three integers, t1, t2, and n, where t1 and t2 are the first two terms of a modified Fibonacci sequence, find the nth term of this modified sequence.
 * The modified Fibonacci sequence is defined as follows:
 * F(0) = t1
 * F(1) = t2
 * F(n) = F(n-2) + (F(n-1))^2 for n > 1
 * Function Description
 * Complete the fibonacciModified function in the editor below. It should return the nth term of the modified Fibonacci sequence.
 * fibonacciModified has the following parameter(s):
 * - int t1: the first term of the sequence
 * - int t2: the second term of the sequence
 * - int n: the term to compute and return
 * Returns
 * - int: the nth term of the modified Fibonacci sequence
 * Input Format
 * A single line of three space-separated integers describing the respective values of t1, t2, and n.
 * Constraints
 * - 0 <= t1, t2 <= 2
 * - 3 <= n <= 20
 * Sample Input
 * 0 1 5
 * Sample Output
 * 5
 * Explanation Video: https://www.youtube.com/watch?v=H8b9rGQYp3o
 * 
 */


public class FibonacciModified {

	/*
	 * public static int fibonacciModified(int t1, int t2, int n) {
	 * 
	 * BigInteger[] arr = new BigInteger[n]; arr[0] = BigInteger.valueOf(t1); arr[1]
	 * = BigInteger.valueOf(t2);
	 * 
	 * for (int i = 2; i < n; i++) { arr[i] = arr[i - 2].add(arr[i - 1].pow(2));
	 * System.out.println(arr[i]); }
	 * 
	 * return arr[n-1].intValue();
	 * 
	 * }
	 */
	
	public static BigInteger fibonacciModified(int t1, int t2, int n) {
		
		BigInteger third = new BigInteger("0");
		BigInteger first = BigInteger.valueOf(t1);
		BigInteger second = BigInteger.valueOf(t2);
		
		for (int i = 2; i < n; i++) {
			third = first.add(second.multiply(second));
			first = second;
			second = third;
			System.out.println(third);
		}
		return third;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(fibonacciModified(0, 1, 5));
		//System.out.println(fibonacciModified(0, 1, 6));
		int res = fibonacciModified(0, 1, 10).intValue();
		System.out.println(res);
		
	}

}
