package hacker_Rank_Pacakge3;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ClimbingLeaderboard class implements the climbing leaderboard algorithm. It
 * calculates the rank of a player based on their scores and the existing ranked
 * scores.
 */

/* 
 *An arcade game player wants to climb to the top of the leaderboard and track their ranking. The game uses Dense Ranking, so its leaderboard works like this:
 * -The player with the highest score is ranked number 1 on the leaderboard.
 * -Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.
 * 
 * Example:
 * 
 * ranked = [100, 90, 90, 80]
 * player = [70, 80, 105]
 * 
 * result = [4, 3, 1]
 * 
 * constraints:
 * 
 * 1 <= ranked.length <= 2 * 10^5
 * 1 <= player.length <= 2 * 10^5
 * 0 <= ranked[i] <= 10^9 for 0 <= i < ranked.length
 * 0 <= player[j] <= 10^9 for 0 <= j < player.length
 * The ranked array is in descending order.
 * The player array is in ascending order.
 * 
 * Explanation Video: https://www.youtube.com/watch?v=8v0Wz6b4n1Y
 * 
 * Time Complexity: O(n + m), where n is the length of the ranked list and m is the length of the player list. The algorithm iterates through both lists once, making it linear in time complexity.
 * Space Complexity: O(n), as the algorithm uses an additional list to store the unique ranked scores, which can be at most the same size as the input ranked list.
 * 
 * Data Structures Used: The algorithm uses a list to store the unique ranked scores and a few integer variables for counting and indexing. No additional complex data structures are used.
 * Algorithm: The algorithm first removes duplicates from the ranked list to create a unique ranked list. It then traverses the player's scores and compares them with the unique ranked scores to determine the player's rank. The rank is calculated based on how many unique scores are greater than the player's score.
 * 
 */

public class ClimbingLeaderboard {

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> uniqueRanked = new ArrayList<>();

        // Remove duplicates from ranked
        int prev = -1;
        for (int score : ranked) {
            if (uniqueRanked.isEmpty() || score != prev) {
                uniqueRanked.add(score);
                prev = score;
            }
        }

        List<Integer> result = new ArrayList<>();
        int i = uniqueRanked.size() - 1;

        // Traverse Alice's scores
        for (int score : player) {
            while (i >= 0 && score >= uniqueRanked.get(i)) {
                i--;
            }
            result.add(i + 2);
        }

        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ranked = new ArrayList<>();
		ranked.add(100);
		ranked.add(90);
		ranked.add(90);
		ranked.add(80);

		List<Integer> player = new ArrayList<>();
		player.add(70);
		player.add(80);
		player.add(105);

		List<Integer> result = climbingLeaderboard(ranked, player);

		for (Integer rank : result) {
			System.out.println("Rank: " + rank);
		}

	}

}
