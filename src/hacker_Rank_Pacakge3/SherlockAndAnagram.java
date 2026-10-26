package hacker_Rank_Pacakge3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Given a string, find the number of unordered anagrammatic pairs of substrings.
 * 
 * An anagrammatic pair of substrings is defined as two substrings that can be rearranged to form the same string. For example, the substrings "abc" and "bca" are anagrams of each other.
 * 
 * Example:
 * 
 * Input: s = "abba"
 * Output: 4
 * Explanation: The anagrammatic pairs of substrings are:
 * 
 * ("a", "a")
 * ("ab", "ba")
 * ("b", "b")
 * ("abb", "bba")
 * 
 * Input: s = "abcd"
 * Output: 0
 * Explanation: There are no anagrammatic pairs of substrings in this case.
 * 
 * Input: s = "ifailuhkqq"
 * Output: 3
 * Explanation: The anagrammatic pairs of substrings are:
 * 
 * ("i", "i")
 * ("q", "q")
 * ("ifa", "fai")
 * 
 * Constraints:
 * 
 * 1 <= length of s <= 100
 * 
 * Explanation Video: https://www.youtube.com/watch?v=G0_I-ZF0S38
 * 
 * Time Complexity: O(n^3), where n is the length of the input string s. The algorithm generates all possible substrings, sorts them, and counts their frequencies.
 * Space Complexity: O(n^2), as the algorithm uses a map to store the frequency of each substring's character count, which can grow with the number of substrings generated.
 * 
 * Data Structures Used: The algorithm uses a HashMap to store the frequency of each substring's character count, and an array to sort the characters of each substring.
 * Algorithm: The algorithm generates all possible substrings of the input string, sorts the characters of each substring to create a canonical representation, and counts the frequency of each unique sorted substring. Finally, it calculates the number of unordered anagrammatic pairs based on the frequencies of the sorted substrings.
 * 
 * 
 */

public class SherlockAndAnagram {
	
	/*
	 * The sherlockAndAnagrams method finds the number of unordered anagrammatic pairs of substrings in a given string. It generates all possible substrings, sorts their characters to create a canonical representation, and counts the frequency of each unique sorted substring. Finally, it calculates the number of unordered anagrammatic pairs based on the frequencies of the sorted substrings.
	 * 
	 * @param s The input string for which to find anagrammatic pairs of substrings.
	 * @return The total number of unordered anagrammatic pairs of substrings in the input string.
	 * 
	 */
	public static int sherlockAndAnagrams(String s) {

		int count = 0;
		int n = s.length();

		// Create a map to store the frequency of each substring's character count
		Map<String, Integer> substringCountMap = new HashMap<>();

		// Generate all possible substrings
		for (int length = 1; length <= n; length++) {
			for (int start = 0; start <= n - length; start++) {
				String substring = s.substring(start, start + length);
				char[] charArray = substring.toCharArray();
				Arrays.sort(charArray);
				String sortedSubstring = new String(charArray);

				// Update the frequency count in the map
				substringCountMap.put(sortedSubstring, substringCountMap.getOrDefault(sortedSubstring, 0) + 1);
			}
		}

		// Calculate the number of unordered anagrammatic pairs
		for (int freq : substringCountMap.values()) {
			if (freq > 1) {
				count += (freq * (freq - 1)) / 2; // nC2 combinations
			}
		}

		return count;
	}



	public static void main(String[] args) {

		String s = "abba";
		int result = sherlockAndAnagrams(s);
		System.out.println(result); // Output: 4
	}

}
