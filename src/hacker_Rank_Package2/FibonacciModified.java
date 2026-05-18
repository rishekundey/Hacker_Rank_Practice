package hacker_Rank_Package2;

import java.math.BigInteger;

// The Fibonacci sequence is defined by the recurrence relation:
// F(n) = F(n-1) + F(n-2)
// with seed values F(0) = 0 and F(1) = 1.
// Given three integers t1, t2 and n, find the value of Tn where Tn is defined by the following recurrence relation:
// T(n) = T(n-2) + (T(n-1))^2
// with seed values T(1) = t1 and T(2) = t2.
// Example
// t1 = 0
// t2 = 1
// n = 5
// The sequence is 0, 1, 1, 2, 5. T(5) = 5.


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
