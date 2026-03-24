package hacker_Rank_Package2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class GridChallenge {

	// The function is expected to return a STRING.
	// The function accepts STRING_ARRAY grid as parameter.
	// Example: grid = ["abc", "ade", "efg"]
	// The function should return YES because after sorting each row, the grid
	// becomes:
	// ["abc", "ade", "efg"], and the columns are in ascending order.
	// Example: grid = ["zyx", "wvu", "tsr"]
	// The function should return NO because after sorting each row, the grid
	// becomes:
	// ["xyz", "uvw", "rst"], and the columns are not in ascending order.

	/*
	 * Test Case: 3 3 abc lmp qrt 3 mpxz abcd wlmf 4 abc hjk mpq rtv
	 */
	public static String gridChallenge(List<String> grid) {
		int n = grid.size();
		int m = grid.get(0).length();

		// Sort each row
		for (int i = 0; i < n; i++) {
			String row = grid.get(i).chars().sorted()
					.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
			/*
			 * char[] row = grid.get(i).toCharArray(); java.util.Arrays.sort(row);
			 */
			grid.set(i, new String(row));
		}

		// Check if columns are in ascending order
		for (int j = 0; j < m; j++) {
			for (int i = 1; i < n; i++) {
				if (grid.get(i).charAt(j) < grid.get(i - 1).charAt(j)) {
					return "NO";
				}
			}
		}

		return "YES";
	}

	public static void main(String[] args) { // TODO Auto-generated method stub
		List<String> grid = Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv");

		System.out.println(gridChallenge(grid)); // Output: YES

	}

}
