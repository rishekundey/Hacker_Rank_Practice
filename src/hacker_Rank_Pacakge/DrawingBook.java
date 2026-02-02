package hacker_Rank_Pacakge;

public class DrawingBook {

	
	public static int pageCount(int n, int p) {
	    // Write your code here
		if (n % 2 == 0) {
			n = n + 1;
		}
		return Math.min(p/2, (n - p)/2);

	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6; // total number of pages
		int p = 2; // page number to turn to
		
		System.out.println(pageCount(n, p));

	}

}
