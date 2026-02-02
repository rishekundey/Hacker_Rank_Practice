package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Between_Two_Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> setA = new ArrayList<Integer>(Arrays.asList(2,4));
		List<Integer> setB = new ArrayList<Integer>(Arrays.asList(16, 32, 96));
		
		System.out.println(getTotalX(setA, setB));

	}
	
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here
		int count = 0;
		int maxA = a.stream().max(Integer::compare).get();
		int minB = b.stream().min(Integer::compare).get();

		int maxFromA = Collections.max(a);
		int minFromB = Collections.min(b);
		
		System.out.println("Max from A: " + maxFromA);
		System.out.println("Min from B: " + minFromB);
		
		for (int i = maxA; i <= minB; i++) {
			boolean allFactorsOfA = true;
			boolean factorOfAllB = true;
			System.out.println("Checking number: " + i);

			for (int numA : a) {
				if (i % numA != 0) {
					System.out.println(i+ "%" + numA + "=" + (i % numA));
					System.out.println(i + " is not a multiple of " + numA);
					System.out.println("False");
					allFactorsOfA = false;
					break;
				}
			}

			for (int numB : b) {
				if (numB % i != 0) {
					System.out.println(numB+ "%"+  i + "=" + (numB % i));
					System.out.println(i + " is not a factor of " + numB);
					System.out.println("False");
					factorOfAllB = false;
					break;
				}
			}

			if (allFactorsOfA && factorOfAllB) {
				System.out.println(i + " is a valid number.");
				count++;
				System.out.println("Current count: "+ count);
			}
		}

		return count;

	}

}
