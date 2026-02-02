/*
 * You will be given a list of 32 bit unsigned integers. Flip all the bits (1->0 and 0->1) and return the result as an unsigned integer.

Example
n=9(10)
9(10) = 1001(2). We're working with 32 bits, so:
00000000000000000000000000001001(2) = 9(10)
11111111111111111111111111110110(2) = 429467286(10)
Return 429467286.
 */

/*
 * Sample Input
 * 2147483647 --> 2147483648
 * 1 
 * 0 --> 4294967295
 */

package hacker_Rank_Pacakge;

public class FlipBits32Bits {
	
	public static long flippingBits(long n) {
	    // Write your code here
		//int num = (int) n;
		return Integer.toUnsignedLong(~(int) n);

	    }
	
	public static void main(String[] args) {
		long n = 2147483647;
		long result = FlipBits32Bits.flippingBits(n);
		System.out.println(result);
	}

}
