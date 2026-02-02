package hacker_Rank_Package2;

public class StrongPassword {

	public static int minimumNumber(int n, String password) {
		// Return the minimum number of characters to make the password strong
		int count = 0;
		
		if (!password.matches(".*[0-9].*")) {
			count++;

		}
		if (!password.matches(".*[a-z].*")) {
			count++;
		}
		if (!password.matches(".*[A-Z].*")) {
			count++;
		}
		if (!password.matches(".*[!@#$%^&*()\\-+].*")) {
			count++;
		}
		if (n + count < 6) {
			count += 6 - (n + count);
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimumNumber(3, "Ab1"));
		System.out.println(minimumNumber(11, "#HackerRank"));
		System.out.println(minimumNumber(5, "2bb#A"));
		System.out.println(minimumNumber(5, "2bbbb"));
		System.out.println(minimumNumber(8, "*Temp#1234"));
	}

}
