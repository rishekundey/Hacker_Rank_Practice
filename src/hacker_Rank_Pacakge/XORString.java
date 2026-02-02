package hacker_Rank_Pacakge;

import java.util.Scanner;

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
