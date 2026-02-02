package hacker_Rank_Pacakge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {

	public static List<Integer> closestNumbers(List<Integer> arr) {
		// Write your code here
		int minDiff = Integer.MAX_VALUE;
		int n = arr.size();
		int[] result = new int[2 * (n - 1)];
		int index = 0;
		arr.sort(null);
		for (int i = 1; i < n; i++) {
			int diff = arr.get(i) - arr.get(i - 1);
			if (diff < minDiff) {
				minDiff = diff;
				index = 0;
				result[index++] = arr.get(i - 1);
				result[index++] = arr.get(i);
			} else if (diff == minDiff) {
				result[index++] = arr.get(i - 1);
				result[index++] = arr.get(i);
			}
		}
		
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < index; i++) {
			res.add(result[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(closestNumbers(Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854 )));
		System.out.println(closestNumbers(Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470 )));
		System.out.println(closestNumbers(Arrays.asList(5, 4, 3, 2)));
		

	}

}
