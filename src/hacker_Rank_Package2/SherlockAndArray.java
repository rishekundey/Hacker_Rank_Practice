package hacker_Rank_Package2;

import java.util.Arrays;
import java.util.List;

public class SherlockAndArray {

	public static String balancedSums(List<Integer> arr) {
	    // Write your code here
		int totalSum = 0;
		for (int num:arr)
			totalSum += num;
		int leftSum = 0;
		for (int num:arr) {
			if (leftSum == totalSum - leftSum - num) {
				return "YES";
			}
			leftSum += num;
		}
		return "NO";
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(balancedSums(Arrays.asList(1, 2, 3))); // Output: NO
		System.out.println(balancedSums(Arrays.asList(1, 2, 3, 3))); // Output: YES
		System.out.println(balancedSums(Arrays.asList(1, 1, 4, 1, 1))); // Output: YES
		System.out.println(balancedSums(Arrays.asList(2, 0, 0, 0))); // Output: YES
		System.out.println(balancedSums(Arrays.asList(0, 0, 2, 0))); // Output: YES
		System.out.println(balancedSums(Arrays.asList(-1, 3, -4, 5, 1))); // Output: 
		
	}

}
