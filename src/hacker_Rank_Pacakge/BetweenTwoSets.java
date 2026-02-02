package hacker_Rank_Pacakge;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {

	public static int getTotalX(List<Integer> a, List<Integer> b) {
	    // Write your code here
		        int count = 0;
		        int maxA = a.stream().max(Integer::compare).orElse(0);
		        int minB = b.stream().min(Integer::compare).orElse(0);
				for (int i = maxA; i <= minB; i++) {
					int num = i;
					boolean allFactorsOfA = a.stream().allMatch(x -> num % x == 0);
					boolean allFactorsOfB = b.stream().allMatch(x -> x % num == 0);
					if (allFactorsOfA && allFactorsOfB) {
						count++;
					}
				}
				return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = Arrays.asList(2, 4);
		List<Integer> b = Arrays.asList(16, 32, 96);
		System.out.println(getTotalX(a, b));
		

	}

}
