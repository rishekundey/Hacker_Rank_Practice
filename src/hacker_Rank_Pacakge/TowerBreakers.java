package hacker_Rank_Pacakge;

public class TowerBreakers {

	public static int towerBreakers(int n, int m) {
		// Write your code here
		if (m == 1 || n % 2 == 0) {
			return 2;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(towerBreakers(2, 2)); // 2
		System.out.println(towerBreakers(1, 4)); // 1
		System.out.println(towerBreakers(3, 7)); // 1
	}

}
