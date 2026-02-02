package hacker_Rank_Pacakge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceInAnArray {

	public static int minimumAbsoluteDifference(List<Integer> arr) {
		// Write your code here
		Collections.sort(arr);
		int minAbsDiff = Integer.MAX_VALUE;
		for (int i = 1; i < arr.size(); i++) {
			int absDiff = Math.abs(arr.get(i) - arr.get(i - 1));
			minAbsDiff = Math.min(minAbsDiff, absDiff);
		}
		return minAbsDiff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimumAbsoluteDifference(Arrays.asList(-2, 2, 4))); // 2
		System.out.println(minimumAbsoluteDifference(Arrays.asList(1, -3, 71, 68, 17))); // 3
	}

}
