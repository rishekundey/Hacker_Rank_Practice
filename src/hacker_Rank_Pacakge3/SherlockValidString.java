package hacker_Rank_Pacakge3;

import java.util.HashMap;

/*
 * URL: https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
 * 
 * Problem: Sherlock and the Valid String
 * 
 * Sherlock considers a string to be valid if all characters of the string appear the same 
 * number of times. It is also valid if he can remove just one character at one index in the 
 * string, and the remaining characters will occur the same number of times. Given a string 
 * s, determine if it is valid. If so, return YES, otherwise return NO.
 * 
 * Example 1:
 * * Input: s = "aabbcd"
 * * Output: NO
 * 
 * Example 2:
 * * Input: s = "aabbccddeefghi"
 * * Output: NO
 * 
 * Example 3:
 * * Input: s = "abcdefghhgfedecba"
 * * Output: YES
 * 
 * Constraints:
 * 
 * 1 <= |s| <= 10^5
 * 
 * Explanation Video: https://www.youtube.com/watch?v=Z4vFf2c9G0A
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * Data Structure: HashMap
 * Algorithm: Frequency Count
 * 
 */

public class SherlockValidString {

	public static String isValid(String s) {
		// Write your code here
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		if (map.size() == 1) {
			return "YES";
		}
		
		HashMap<Integer, Integer> freqMap = new HashMap<>();
		for (int freq : map.values()) {
			freqMap.put(freq, freqMap.getOrDefault(freq, 0) + 1);
		}
		
		if (freqMap.size() > 2) {
			return "NO";
		}
		
		if (freqMap.size() == 2) {
			int freq1 = (int) freqMap.keySet().toArray()[0];
			int freq2 = (int) freqMap.keySet().toArray()[1];
			int count1 = freqMap.get(freq1);
			int count2 = freqMap.get(freq2);

			if ((count1 == 1 && (freq1 - 1 == freq2 || freq1 - 1 == 0))
					|| (count2 == 1 && (freq2 - 1 == freq1 || freq2 - 1 == 0))) {
				return "YES";
			} else {
				return "NO";
			}
		}
		
		return "YES";
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdefghhgfedecba";
		System.out.println(isValid(s));
		
		s = "aabbcd";
		System.out.println(isValid(s));
		
		s = "aabbccddeefghi";
		System.out.println(isValid(s));
		
	}

}
