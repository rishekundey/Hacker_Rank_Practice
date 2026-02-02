package hacker_Rank_Pacakge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {
	
	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
	    // Write your code here
		//String res = null;
		Collections.sort(A,Collections.reverseOrder());
		Collections.sort(B);
		
		System.out.println(A.toString());
		System.out.println(B.toString());
		
		int n = A.size();
		for(int i=0; i<n; i++) {
			if(!(A.get(i)+B.get(i)>=k)) {
				return "NO";
			}
				
		}
		
		return "YES";
	    }
	
	
	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>(Arrays.asList(2,1,3));
		List<Integer> B = new ArrayList<Integer>(Arrays.asList(7,8,9));
		int k =10;
		String res = PermutingTwoArrays.twoArrays(k, A, B);
		System.out.println(res);
	}

}
