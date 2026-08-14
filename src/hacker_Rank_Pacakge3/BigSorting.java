package hacker_Rank_Pacakge3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Given an array of strings representing large integers, the task is to sort them in ascending order based 
 * on their numeric values. The challenge arises because the integers can be very large, potentially 
 * exceeding the range of standard integer types.
 * 
 * Example:
 * 
 * Input: unsorted = ["31415926535897932384626433832795", "1", "3", "10", "3"]
 * Output: ["1", "3", "3", "10", "31415926535897932384626433832795"]
 * 
 * Constraints:
 * 
 * 1 <= unsorted.length <= 10^6
 * 1 <= unsorted[i].length <= 10^6
 * unsorted[i] consists of digits only and does not have leading zeros.
 * 
 * Explanation Video: https://www.youtube.com/watch?v=G0_I-ZF0S38
 * 
 * Time Complexity: O(n log n), where n is the number of strings in the input list. The sorting operation 
 * dominates the time complexity.
 * Space Complexity: O(n), as the sorting algorithm may require additional space for storing the sorted 
 * output.
 * Data Structures Used: The algorithm uses a list to store the input strings and relies on the built-in 
 * sorting functionality, which may use additional data structures internally for sorting.
 * Algorithm: The algorithm sorts the list of strings based on their numeric values. It first compares the 
 * lengths of the strings, as shorter strings represent smaller numbers. If two strings have the same length, 
 * it compares them lexicographically. The sorted list is then returned as the output.
 * 
 */
public class BigSorting {

	/*
	 * The bigSorting method sorts a list of strings representing large integers in
	 * ascending order based on their numeric values. It uses a custom comparator to
	 * compare the lengths of the strings first, and if they are of equal length, it
	 * compares them lexicographically.
	 * 
	 * @param unsorted A list of strings representing large integers to be sorted.
	 * 
	 * @return A list of strings sorted in ascending order based on their numeric
	 * values.
	 */
	public static List<String> bigSorting(List<String> unsorted) {
		// Sort the list of strings based on their numeric values
		Collections.sort(unsorted, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				if (a.length() != b.length()) {
					return Integer.compare(a.length(), b.length());
				}
				return a.compareTo(b);
			}
		});
		return unsorted;
	}
	
	/*
	 * The bigSorting2 method sorts a list of strings representing large integers in
	 * ascending order based on their numeric values using a lambda expression. It
	 * compares the lengths of the strings first, and if they are of equal length,
	 * it compares them lexicographically.
	 * 
	 * @param unsorted A list of strings representing large integers to be sorted.
	 * 
	 * @return A list of strings sorted in ascending order based on their numeric
	 * values.
	 */
	public static List<String> bigSorting2(List<String> unsorted) {
		// Sort the list of strings based on their numeric values using lambda
		// expression
		Collections.sort(unsorted, (a, b) -> {
			if (a.length() != b.length()) {
				return Integer.compare(a.length(), b.length());
			}
			return a.compareTo(b);
		});
		return unsorted;
	}
	
	/*
	 * The bigSorting3 method sorts a list of strings representing large integers in
	 * ascending order based on their numeric values using method references. It
	 * compares the lengths of the strings first, and if they are of equal length,
	 * it compares them lexicographically.
	 * 
	 * @param unsorted A list of strings representing large integers to be sorted.
	 * 
	 * @return A list of strings sorted in ascending order based on their numeric
	 * values.
	 */
	public static List<String> bigSorting3(List<String> unsorted) {
		// Sort the list of strings based on their numeric values using method reference
		Collections.sort(unsorted, Comparator.comparingInt(String::length).thenComparing(String::compareTo));
		return unsorted;
	}
	
	/*
	 * The bigSorting4 method sorts a list of strings representing large integers in
	 * ascending order based on their numeric values using BigInteger for accurate
	 * comparisons. It converts each string to a BigInteger, sorts the list, and
	 * then converts the sorted BigIntegers back to strings.
	 * 
	 * @param unsorted A list of strings representing large integers to be sorted.
	 * 
	 * @return A list of strings sorted in ascending order based on their numeric
	 * values.
	 */
	public static List<String> bigSorting4(List<String> unsorted) {
		List<BigInteger> bigIntegers = new ArrayList<>();
		for (String numStr : unsorted) {
			bigIntegers.add(new BigInteger(numStr));
		}
		Collections.sort(bigIntegers);
		return bigIntegers.stream().map(BigInteger::toString).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> unsorted = new ArrayList<>();
		unsorted.add("31415926535897932384626433832795");
		unsorted.add("1");
		unsorted.add("3");
		unsorted.add("10");
		unsorted.add("3");
		
		List<String> sorted = bigSorting(unsorted);
		System.out.println("Sorted List:");
		for (String num : sorted) {
			System.out.println(num);
		}
	}

}
