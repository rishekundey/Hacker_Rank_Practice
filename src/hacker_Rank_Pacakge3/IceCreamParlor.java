package hacker_Rank_Pacakge3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Two Friends like to pool their money and go to the ice cream parlor. They always choose two distinct flavors and they spend all of their money.
 * Given a list of prices for the flavors of ice cream, select the two that will cost all of the money they have.
 * 
 * Example
 * m = 6
 * arr = [1, 3, 4, 5, 6]
 * 
 * The two flavors that cost 1 and 5 meet the criteria. Using 1-based indexing, they are at indices 1 and 4.
 * 
 * Example
 * m = 4
 * arr = [1, 4, 3, 5, 2]
 * The two flavors that cost 1 and 3 meet the criteria. Using 1-based indexing, they are at indices 1 and 3.
 * 
 * Constraints:
 * 1 <= t <= 50
 * 1 <= m <= 10^4
 * 1 <= n <= 10^4
 * 1 <= cost[i] <= 10^4
 * There is always a unique solution.
 * 
 * Explanation Video: https://www.youtube.com/watch?v=3n0b9lKQHcY
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * Data Structure Used: HashMap
 * Algorithm Used: Two Sum Problem
 * 
 */

public class IceCreamParlor {
	
	/*
	 * Brute Force Approach Time Complexity: O(n^2) Space Complexity: O(1)
	 * 
	 * @param m: the amount of money they have
	 * 
	 * @param arr: the list of prices for the flavors of ice cream
	 * 
	 * @return: the indices of the two flavors that cost all of the money they have
	 */
	public static List<Integer> icecreamParlor_Brute_Force(int m, List<Integer> arr){
		List<Integer> res = new ArrayList<Integer>();
		for(int i=0; i<arr.size()-1; i++) {
			for(int j = i+1; j<arr.size(); j++) {
				if(arr.get(i)+arr.get(j)==m) {
					res.add(i+1);
					res.add(j+1);
					break;
				}
			}
		}
		return res;
	}
	
	/*
	 * Optimized Approach Time Complexity: O(n) Space Complexity: O(n)
	 * 
	 * @param m: the amount of money they have
	 * 
	 * @param arr: the list of prices for the flavors of ice cream
	 * 
	 * @return: the indices of the two flavors that cost all of the money they have
	 */
	public static List<Integer> icecreamParlor(int m, List<Integer> arr){
		List<Integer> res = new ArrayList<Integer>();
		Map<Integer, Integer> resToBe = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.size(); i++) {
			int comp = m-arr.get(i);
			if(resToBe.containsKey(comp)) {
				res.add(resToBe.get(comp)+1);
				res.add(i+1);
				break;
			} else
				resToBe.put(arr.get(i), i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 3, 4, 5, 6);
		List<Integer> res = icecreamParlor(6, arr);
		System.out.println(res);
	}

}
