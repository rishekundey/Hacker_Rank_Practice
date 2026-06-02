package hacker_Rank_Package2;

import java.util.Arrays;
import java.util.List;

public class FormingAMagicSquare {
	
	public static int formingMagicSquare(List<List<Integer>> s) {
	    // Write your code here
		
		int[][][] magicSquares = {
			{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
		};
		
		int minCost = Integer.MAX_VALUE;
		int round = 1;
		for (int[][] magicSquare : magicSquares) {
			int cost = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					//System.out.println("Round " + round + ": Processing cell (" + i + ", " + j + ")");
				//System.out.println("s.get(" + i + ").get(" + j + "): " + s.get(i).get(j));
				//System.out.println("magicSquare[" + i + "][" + j + "]: " + magicSquare[i][j]);
					cost += Math.abs(s.get(i).get(j) - magicSquare[i][j]);
					System.out.println("Cost after processing (" + i + ", " + j + "): " + cost);
				}
			}
			System.out.println("Cost for round " + round + ": " + cost);
			minCost = Math.min(minCost, cost);
			round++;
		}

		return minCost;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> s = Arrays.asList(
				Arrays.asList(5, 3, 4), 
				Arrays.asList(1, 5, 8), 
				Arrays.asList(6, 4, 2));
		System.out.println(formingMagicSquare(s));
	}

}
