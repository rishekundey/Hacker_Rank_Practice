/*
 * 8
 * UDDDUDUU
 * --> 1
 */
package hacker_Rank_Pacakge;

public class CountingValleys {

	
	public static int countingValleys(int steps, String path) {
	    // Write your code here
		
		int currrentLevel = 0;
		int numValleys = 0;
		for(char c : path.toCharArray()) {
			int step = c=='D'? -1:1;
			if(currrentLevel < 0 && currrentLevel+step == 0)
				numValleys++;
			currrentLevel += step;
		}
		return numValleys;
		
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s = "UDDDUDUU";
		String s = "DDUUUUDD";
		int res = countingValleys(8, s);
		System.out.println(res);
	}

}
