package hacker_Rank_Package2;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/xor-string/problem
 * 
 * Given two binary strings, determine the XOR of the two strings. The XOR operation is performed on each corresponding bit of the two strings. If the bits are the same, the result is 0; if they are different, the result is 1.
 * * Function Description
 * * * Complete the xorStrings function in the editor below. It should return a string that represents the XOR of the two input strings.
 * * * xorStrings has the following parameter(s):
 * * * * * string s1: the first binary string
 * * * * * * string s2: the second binary string
 * * * Returns
 * * * * string: the XOR of the two input strings
 * * * Input Format
 * * The first line contains a binary string s1.
 * * The second line contains a binary string s2.
 * * Constraints
 * * 1 <= length of s1, s2 <= 10^5
 * * s1 and s2 consist only of the characters '0' and '1'.
 * * Sample Input 0
 * * 10101
 * * 00101
 * * Sample Output 0
 * * 10000
 * 
 * Time  Complexity: O(n), where n is the length of the input strings.
 * Space Complexity: O(n), where n is the length of the output string.
 * 
 * Explanation Video: https://www.youtube.com/watch?v=9n7xLqf8s2o
 */

public class XORString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		
		String res = "";
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) == s2.charAt(i)) 
				res += "0";
			else 
				res += "1";
		}
		
		System.out.println(res);
		s.close();
	}

}
