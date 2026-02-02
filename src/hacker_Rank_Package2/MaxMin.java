package hacker_Rank_Package2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {

	public static int maxMin(int k, List<Integer> arr) {
		// Write your code here
		Collections.sort(arr);
		int minRes = Integer.MAX_VALUE;
		for(int i=0; i<=arr.size()-k; i++) {
			minRes = Math.min(minRes,  arr.get(i+k-1) - arr.get(i));
		}
		return minRes;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxMin(4, Arrays.asList(1, 2, 3, 4, 10, 20, 30, 40, 100, 200)));
	}

}
