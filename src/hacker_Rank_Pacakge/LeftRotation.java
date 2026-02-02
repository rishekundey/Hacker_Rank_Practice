package hacker_Rank_Pacakge;

import java.util.List;

public class LeftRotation {

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
	    // Write your code here
		        int n = arr.size();
		        d = d % n; // Handle cases where d >= n
		        List<Integer> rotated = new java.util.ArrayList<>(n);
				for (int i = 0; i < n; i++) {
					rotated.add(arr.get((i + d) % n));
				}
				return rotated;
				                

	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = java.util.Arrays.asList(1, 2, 3, 4, 5);
		int d = 2;
		List<Integer> result = rotateLeft(d, arr);
		System.out.println(result); // Output: [3, 4, 5, 1, 2]
		
	}

}
