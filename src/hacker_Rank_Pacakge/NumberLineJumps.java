package hacker_Rank_Pacakge;

public class NumberLineJumps {

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		// Write your code here
		if (v1 <= v2) {
			return "NO";
		}
		if ((x2 - x1) % (v1 - v2) == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 0, v1 = 3, x2 = 4, v2 = 2;
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result); // Output: YES

	}

}
