package hacker_Rank_Package2;

/*
 * Bomberman lives in a world represented as an R x C grid. Each cell of the grid either contains a bomb, or is empty.
 * Bomberman can perform the following steps in order:
 * 1. Bomberman plants bombs in all the empty cells. After this step, there is a bomb in every cell.
 * 2. Bomberman waits for one second. No bombs explode during this second.
 * 3. Bomberman detonates every bomb in the grid simultaneously. After a bomb detonates, it destroys itself and any cells directly adjacent to it (up, down, left, and right).
 * Bomberman repeats these steps indefinitely. Given the initial state of the grid and an integer, n, find and print the state of the grid after n seconds.
 * Input Format
 * The first line contains three space-separated integers, R, C, and N, the number of rows, columns, and seconds to simulate.
 * Each of the next R lines contains a string of C characters that describes the initial state of the grid. Each character in the grid is either '.' (empty) or 'O' (bomb).
 * Constraints
 * 1 <= R, C <= 200
 * 1 <= N <= 10^9
 * Output Format
 * Print R lines of C characters that represent the state of the grid after N seconds. Each character in the grid should be either '.' (empty) or 'O' (bomb).
 * Sample Input
 * 6 7 3
 * .......
 * ...O.O.
 * ....O..
 * ..O....
 * OO...OO
 * OO.O...
 * Sample Output
 * OOO.OOO
 * OO...OO
 * OO...OO
 * OO...OO
 * OO...OO
 * OO...OO
 * Explanation Video: https://www.youtube.com/watch?v=7qQkZt3iYpE
 * 
 * Time Complexity: O(R * C)
 * Space Complexity: O(R * C)
 * Note: The time complexity is O(R * C) because we need to iterate through the grid to plant bombs and detonate them. The space complexity is O(R * C) because we need to store the state of the grid at each second.
 * The main idea is to simulate the process of planting bombs and detonating them. We can use a list of strings to represent the grid, and we can use StringBuilder to modify the grid when planting bombs and detonating them. We need to consider the cases when n is even and when n is odd, as the state of the grid will be different in these cases. When n is even, all cells will have bombs, and when n is odd, we need to simulate the process of detonating the bombs to find the state of the grid.
 * The code first checks if n is 1, in which case it returns the initial grid. Then it creates a new grid where all empty cells are filled with bombs. If n is even, it returns this new grid. If n is odd, it simulates the detonation of the bombs and creates a new grid based on the detonation. If n is congruent to 3 modulo 4, it returns the grid after the first detonation. If n is congruent to 1 modulo 4, it simulates another detonation and returns the resulting grid.
 * The key insight is that the state of the grid after n seconds can be determined by the initial state and the pattern of bomb planting and detonation, which repeats every 4 seconds after the first second. Therefore, we only need to simulate up to 2 detonations to find the state of the grid for any n.
 * This solution efficiently handles the large value of n (up to 10^9) by recognizing the repeating pattern in the grid's state, thus avoiding the need for simulating each second up to n.
 * This code can be further optimized by precomputing the states of the grid for the first few seconds and then using those precomputed states to determine the final state for any given n, especially since the pattern repeats every 4 seconds after the first second. However, the current implementation is straightforward and easy to understand while still being efficient for the given constraints.
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BomberManGame {
	
	public static List<String> bomberMan(int n, List<String> grid){
		
		if(n == 1)
			return grid;
		
		List<String> grids = new ArrayList<>(grid);
		grids.replaceAll(s -> s.replace('.', 'O'));
		
		if(n%2 == 0)
			return grids;
		
		List<StringBuilder> sbList = new ArrayList<>();
		for(int i=0; i<grids.size(); i++) {
			sbList.add(new StringBuilder(grids.get(i)));
		}
		
		for (int i = 0; i < grid.size(); i++) {
			for (int j = 0; j < grid.get(i).length(); j++) {
				if (grid.get(i).charAt(j) == 'O') {
					sbList.get(i).setCharAt(j, '.');
					if (i - 1 >= 0)
						sbList.get(i - 1).setCharAt(j, '.');
					if (i + 1 < grid.size())
						sbList.get(i + 1).setCharAt(j, '.');
					if (j - 1 >= 0)
						sbList.get(i).setCharAt(j - 1, '.');
					if (j + 1 < grid.get(i).length())
						sbList.get(i).setCharAt(j + 1, '.');
				}
			}
		}
		List<String> grid1 = new ArrayList<>();
		for (StringBuilder sb : sbList)
			grid1.add(sb.toString());
		
		if(n%4 == 3)
			return grid1;
		
		List<StringBuilder> sbList1 = new ArrayList<>();
		for(int i=0; i<grids.size(); i++) {
			sbList1.add(new StringBuilder(grids.get(i)));
		}
		
		for (int i = 0; i < grid1.size(); i++) {
			for (int j = 0; j < grid1.get(i).length(); j++) {
				if (grid1.get(i).charAt(j) == 'O') {
					sbList1.get(i).setCharAt(j, '.');
					if (i - 1 >= 0)
						sbList1.get(i - 1).setCharAt(j, '.');
					if (i + 1 < grid1.size())
						sbList1.get(i + 1).setCharAt(j, '.');
					if (j - 1 >= 0)
						sbList1.get(i).setCharAt(j - 1, '.');
					if (j + 1 < grid1.get(i).length())
						sbList1.get(i).setCharAt(j + 1, '.');
				}
			}
		}
		
		if(n%4 == 1) {
			grid1.clear();
			for (StringBuilder sb : sbList1)
				grid1.add(sb.toString());
		}
		return grid1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		List<String> grid = Arrays.asList(
				".......", 
				"...O.O.", 
				"....O..", 
				"..O....", 
				"OO...OO", 
				"OO.O..."
				);
		int n = 5;
		List<String> result = bomberMan(n, grid);
		for (String s : result)
			System.out.println(s);
		
	}

}
