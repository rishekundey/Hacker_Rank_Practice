package hacker_Rank_Pacakge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
	
	public static int diagonalDifference(List<List<Integer>> arr) {
	    // Write your code here
		int leftToRight = 0;
		int rightToLeft = 0;
		for(int i=0; i<arr.get(0).size(); i++) {
			for(int j=0; j<arr.get(0).size(); j++) {
				if(i==j) 
					leftToRight += arr.get(i).get(j);
				if((i+j+1) == arr.get(0).size()) 
					rightToLeft += arr.get(i).get(j);
			}
		}
		
		return Math.abs(leftToRight-rightToLeft);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> arrList = new ArrayList<List<Integer>>(Arrays.asList(Arrays.asList(1, 2, 3),Arrays.asList(4, 5, 6),Arrays.asList(9, 8, 9)));
		System.out.println(arrList.get(0).size());
		System.out.println(arrList.toString());
		System.out.println(diagonalDifference(arrList));		
	}
	
}
