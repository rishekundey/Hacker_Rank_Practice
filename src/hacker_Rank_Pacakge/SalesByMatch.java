package hacker_Rank_Pacakge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesByMatch {

	public static int sockMerchant(int n, List<Integer> ar) {
	   
		int[] sockCounts = new int[101];
		int pairs = 0;
		for(int i=0;i<n;i++) 
			sockCounts[ar.get(i)]++;
		
		for(int i:sockCounts) 
			pairs += i/2;
		
	return pairs;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		List<Integer> ar = new ArrayList<Integer>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
		
		int result = sockMerchant(n,ar);
		System.out.println(result);
	}

}
