package hacker_Rank_Package2;

/*
 *  http://www.hackerrank.com/challenges/palindrome-index
 *  
 *  *  A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
 *  *  Given a string of lowercase letters, determine the index of the character whose removal will result in a palindrome.
 *  *  There will always be a valid solution, and any correct answer will be accepted. For example, if your string is "bcbc",
 *  *  either remove 'b' at index 0 or 'c' at index 3.
 *  
 *  *  Example
 *  *  s = "aaab"
 *  *  Remove 'b' at index 3 and the string becomes "aaa", which is a palindrome.
 *  *  example
 *  *  s = "baa"
 *  *  Remove 'b' at index 0 and the string becomes "aa", which is a palindrome.
 *  *  example
 *  *  s = "aaa"
 *  *  This string is already a palindrome, so return -1.
 *  
 *  Explanation video: https://www.youtube.com/watch?v=8iZtP4Dq9nQ
 *  
 *  Time  complexity: O(n)
 *  Space complexity: O(1)
 *  
 */

public class PalindromeIndex {

	public static int palindromeIndex(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				if (isPalindrome(s, i + 1, j)) {
					return i;
				} else if (isPalindrome(s, i, j - 1)) {
					return j;
				} else {
					return -1;
				}
			}
			i++;
			j--;
		}
		return -1;
	}
	
	public static boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(palindromeIndex("aaab"));
		System.out.println(palindromeIndex("baa"));
		System.out.println(palindromeIndex("aaa"));
	}

}
