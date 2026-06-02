package hacker_Rank_Package2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * In this problem we need to list all the possible 3X3 magic squares after generating them in the program. 
 * A magic square is a 3X3 matrix of distinct positive integers from 1 to 9 where the sum of 
 * any row, column, or diagonal is equal to the same number (in this case, 15).
 */

public class ListMagicSquares {
	
	// Check if a 3x3 square is a magic square (all rows, cols, diagonals sum to 15)
    static boolean isMagic(int[][] s) {
        // Rows
        for (int[] row : s) {
            int sum = 0;
            for (int val : row) sum += val;
            if (sum != 15) return false;
        }

        // Columns
        for (int col = 0; col < 3; col++) {
            if (s[0][col] + s[1][col] + s[2][col] != 15) return false;
        }

        // Diagonals
        if (s[0][0] + s[1][1] + s[2][2] != 15) return false;
        if (s[0][2] + s[1][1] + s[2][0] != 15) return false;

        return true;
    }

    // Generate all permutations of the given array (in-place via backtracking)
    static List<int[]> generatePermutations(int[] arr) {
        List<int[]> result = new ArrayList<>();
        permute(arr, 0, result);
        return result;
    }

    static void permute(int[] arr, int start, List<int[]> result) {
        if (start == arr.length) {
            result.add(arr.clone());
            return;
        }
        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            permute(arr, start + 1, result);
            swap(arr, start, i); // backtrack
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

	
	static void listAllMagicSquares() {
        List<int[][]> magicSquares = new ArrayList<>();

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<int[]> perms = generatePermutations(nums);

        for (int[] perm : perms) {
            int[][] square = {
                {perm[0], perm[1], perm[2]},
                {perm[3], perm[4], perm[5]},
                {perm[6], perm[7], perm[8]}
            };
            if (isMagic(square)) {
                magicSquares.add(square);
                System.out.println("Found magic square:");
				for (int[] row : square) {
					System.out.println(Arrays.toString(row));
				}
            }
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listAllMagicSquares();
	}

}
