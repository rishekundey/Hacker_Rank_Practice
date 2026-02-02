package hacker_Rank_Pacakge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubArrayDivision {
	
	public static int countWays(int[] s, int d, int m) {
        if (m > s.length) return 0; // If segment length is more than chocolate size

        int count = 0;

        // First window sum
        int windowSum = 0;
        for (int i = 0; i < m; i++) {
            windowSum += s[i];
        }
        if (windowSum == d) count++;

        // Slide the window
        for (int i = m; i < s.length; i++) {
            windowSum += s[i] - s[i - m]; // Add next, remove previous
            if (windowSum == d) count++;
        }

        return count;
    }
	
	public static int birthday(List<Integer> s, int d, int m) {
	    // Write your code here
		/*
		 * int sum = 0; int count = 0; if(m>s.size()) return 0; for(int
		 * i=0;i<s.size()-m+1;i++) { int window = i+m; for(int j=i;j<window;j++) { sum
		 * += s.get(j); } if(sum == d) count++; sum = 0; }
		 * 
		 * return count;
		 */
		
		if (m > s.size()) 
			return 0;

        int count = 0;

        int windowSum = 0;
        for (int i = 0; i < m; i++) {
            windowSum += s.get(i);
        }
        if (windowSum == d) count++;

        // Slide the window
        for (int i = m; i < s.size(); i++) {
            windowSum += s.get(i) - s.get(i - m); // Add next, remove previous
            if (windowSum == d) count++;
        }

        return count;
	    }
	
	public static void main(String[] args) {		
		
		int[] squares = {1, 2, 1, 3, 2}; // Chocolate bar squares
		List<Integer> list = Arrays.stream(squares)
		        .mapToObj(Integer::valueOf)
		        .collect(Collectors.toList());
        int d = 6;  // Ron's birth day
        int m = 3;  // Ron's birth month

        //int ways = countWays(squares, d, m);
        int ways = birthday(list, d, m);
        System.out.println("Number of ways to share the chocolate: " + ways);
		
	}
}
