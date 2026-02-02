package hacker_Rank_Pacakge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LonelyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,3,2,1));
		//Collections.sort(arr);
		
		//System.out.println(arr.size());
		int result = 0;
		for(int i=0; i<arr.size(); i++) {
			result ^= arr.get(i);
		}
		System.out.println(result);
	}

}
