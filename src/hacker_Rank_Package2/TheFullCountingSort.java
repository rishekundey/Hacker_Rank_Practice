package hacker_Rank_Package2;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/full-counting-sort/problem
// Full Counting Sort
// Given a list of pairs of integers and strings, sort the pairs based on the integer values. 
// If two pairs have the same integer value, maintain their original order. 
// For the first half of the list, replace the strings with a dash ("-") before sorting. 
// Finally, print the strings in the sorted order.
// Example
// arr = [[0, ab], [6, cd], [0, ef], [6, gh]]
// The first half of the list is [[0, -], [6, -]], and the second half is [[0, ef], [6, gh]]. 
// After sorting, we get [[0, -], [0, ef], [6, -], [6, gh]]. 
// The output is "- ef - gh".
// Function Description
// Complete the countSort function in the editor below.
// The function must print the strings in their correct order as described.
// countSort has the following parameter(s):
// arr: a 2D array of integers and strings
// Input Format
// The first line contains an integer, n, the number of pairs.
// The next n lines each contain an integer and a string separated by a space.
//// Constraints
// 1 <= n <= 10^6
// 0 <= x < 100
// 1 <= |s| <= 10
// Output Format
// Print the strings in their correct order as described.

public class TheFullCountingSort {
	
	public static void countSort(List<List<String>> arr) {
		int n = arr.size();
		int half = n / 2;
		for(int i = 0; i < half; i++) {
			arr.get(i).set(1, "-");
		}
		arr = arr.stream().sorted((a, b) -> Integer.parseInt(a.get(0)) - Integer.parseInt(b.get(0))).collect(java.util.stream.Collectors.toList());
		StringBuilder sb = new StringBuilder();
		for (List<String> list : arr) {
			sb.append(list.get(1)).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> arr = Arrays.asList(Arrays.asList("0", "ab"), Arrays.asList("6", "cd"), Arrays.asList("0", "ef"), Arrays.asList("6", "gh"),
				Arrays.asList("4", "ij"), Arrays.asList("0", "ab"), Arrays.asList("6", "cd"), Arrays.asList("0", "ef"), Arrays.asList("6", "gh"),
				Arrays.asList("0", "ij"), Arrays.asList("4", "that"), Arrays.asList("3", "be"), Arrays.asList("0", "to"), Arrays.asList("1", "be"),
				Arrays.asList("5", "question"), Arrays.asList("1", "or"), Arrays.asList("2", "not"), Arrays.asList("4", "is"),
				Arrays.asList("2", "to"), Arrays.asList("4", "the"));
		countSort(arr);
	}

}
