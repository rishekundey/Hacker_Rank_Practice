package hacker_Rank_Pacakge;

import java.util.HashSet;

public class Pangrams {

	public static String pangrams(String s) {
	    // Write your code here
		HashSet<Character> set = new HashSet<Character>();
		s = s.trim().toLowerCase().replaceAll("\\s+", "");
		for(char c:s.toCharArray()) {
			set.add((Character)c);
		}
		return set.size()==26?"pangram":"not pangram";

	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "We promptly judged antique ivory buckles for the next prize";
		//String s = "We promptly judged antique ivory buckles for the prize";
		
		String res = pangrams(s);
		System.out.println(res);

	}

}
