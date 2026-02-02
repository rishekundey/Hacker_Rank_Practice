package hacker_Rank_Pacakge;

public class MarsExploration {

	public static int marsExploration(String s) {
	    // Write your code here
		int count = 0;
		for(int i=0; i<s.length(); i = i+3) {
			
			if(!('S' == s.charAt(i))) 
				count++;
			if(!('O' == s.charAt(i+1)))
				count++;
			if(!('S' == s.charAt(i+2)))
				count++;
		}
		return count;
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "SOSSPSSQSSOR";
		String s = "SOSSOT";
		System.out.println(marsExploration(s));

	}

}
