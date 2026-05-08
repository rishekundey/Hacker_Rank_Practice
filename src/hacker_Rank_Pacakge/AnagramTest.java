package hacker_Rank_Pacakge;

public class AnagramTest {

	//meaning of anagram: An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
	//typically using all the original letters exactly once.
	// For example, the word "listen" is an anagram of "silent".
	// Examples of anagrams include "cinema" and "iceman", "evil" and "vile", and "astronomer" and "moon starer".
	
	// The function is expected to return an INTEGER.
	// The function accepts STRING s as parameter.
	// Example: s = "aaabbb"
	// The function should return 3 because we need to change three 'a's in the first half to 'b's to make both halves anagrams.
	// If the length of the string is odd, return -1.
	// Example: s = "abc"
	// The function should return -1 because the length of the string is odd.
	// Example: s = "ab"
	// The function should return 1 because we need to change one character to make both halves anagrams.
	// Example: s = "mnop"
	// The function should return 2 because we need to change two characters to make both halves anagrams.
	
	public static int anagram(String s) {
	    // Write your code here
		if (s.length() % 2 != 0) {
            return -1;
		}
		
		String firstHalf = s.substring(0, s.length() / 2);
		String secondHalf = s.substring(s.length() / 2);

		int[] charCount = new int[26];

		for (char c : firstHalf.toCharArray()) {
			charCount[c - 'a']++;
		}

		for (char c : secondHalf.toCharArray()) {
			charCount[c - 'a']--;
		}
		
		for (int count : charCount) {
			System.out.print(count + " ");
		}
		
		System.out.println();
		
		int changesNeeded = 0;
		for (int count : charCount) {
			if (count > 0) {
				changesNeeded += count;
			}
		}
		
		return changesNeeded;
		
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(anagram("aaabbb")); // Output: 3
		//System.out.println(anagram("ab"));     // Output: 1
		//System.out.println(anagram("abc"));    // Output: -1
		//System.out.println(anagram("mnop"));   // Output: 2
		System.out.println(anagram("asdfjoieufoa")); //asdfjo and ieufoa -> adfjos and aefiou -> 3
		System.out.println(anagram("fdhlvosfpafhalll"));
		System.out.println(anagram("mvdalvkiopaufl")); //mvdalvk and iopaufl -> adklmvv and afilopu -> 5
	}

}
